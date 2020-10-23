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
	
	public static boolean possible(int row, int col, int n) {
		if(checkRow(row, n) && 
		   checkCol(col, n) && 
		   checkBox(row, col, n)) {
			return true;
		}
		return false;
	}
	
	public static int[][] solve(int[][] gridToSolve) {
		grid = gridToSolve;
		
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				if (grid[row][col] == 0) {
					for (int n = 1; n < 10; n++) {
						if (possible(row,col,n)) {
							grid[row][col] = n;
							grid = solve(grid);					
						}
					}
				}
			}
		}
		return grid;
	}
	
	public static void show(int[][] gridToShow) {
		String str = "";
		
		for (int row = 0; row < gridToShow.length; row++) {
			str += "\r\n";
			for (int col = 0; col < gridToShow[row].length; col++) {
				str += gridToShow[row][col];
			}
		}
		
		System.out.println(str);
	}
}
