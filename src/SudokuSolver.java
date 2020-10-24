/*
 * Utility Class cannot be instantiated
 */
public final class SudokuSolver {
	public static int[][] grid = null;
	
	private SudokuSolver() {
	}
	
	private static boolean checkRow(int row, int n) {
		for (int i = 0; i < 9; i++) {
			if (grid[row][i] == n) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean checkCol(int col, int n) {
		for (int i = 0; i < 9; i++) {
			if (grid[i][col] == n) {
				return false;
			}
		}
		return true;
	}
	
	
	private static boolean checkBox(int row, int col, int n) {
        int rowBox = Math.floorDiv(row,3)*3;
        int colBox = Math.floorDiv(col,3)*3;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[rowBox+i][colBox+j] == n) {
                    return false;
                }
            }
        }
        return true;
    }
	
	/*				AUTRE APPROCHE DE LA METHODE CHECKBOX			 */
	/*
	private static boolean checkBox(int row, int col, int n) {		
		int rowBox = row - row % 3;
		int colBox = col - col % 3;
		
		for (int i = rowBox; i < rowBox + 3; i++) {
			for (int j = colBox; j < colBox + 3; j++) {
				if (grid[rowBox+i][colBox+j] == n) {
					return false;
				}
			}
		}
		return true;
	}
	*/
	
	public static boolean possible(int row, int col, int n) {
		return checkRow(row, n) && checkCol(col, n) && checkBox(row, col, n);
	}
	
	public static boolean solve(int[][] gridToSolve) {
		grid = gridToSolve;
		
		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {
				if (grid[row][col] == 0) {
					for (int n = 1; n < 10; n++) {
						if (possible(row,col,n)) {
							grid[row][col] = n;
							if(solve(grid)) {
								return true;
							} else {
								grid[row][col] = 0;
							}
						}
					}
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static void show(int[][] gridToShow) {
		String str = "";
		grid = gridToShow;
		
		for (int row = 0; row < grid.length; row++) {
			if (row % 3 == 0 && row != 0) {
				str += "\r\n- - - - - - - - - - - - -";
			} 
			str += "\r\n";
			for (int col = 0; col < grid[row].length; col++) {
				if (col % 3 == 0 && col != 0) {
					str += " | ";
				}
				
				if (col == 8) {
					str += grid[row][col];
				} else {
					str += grid[row][col] + " ";
				}
			}
		}
		
		System.out.println(str);
	}
}
