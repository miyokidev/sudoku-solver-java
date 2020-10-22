/*
 * Utility Class cannot be instantiated
 */
public final class SudokuSolver {
	public int[][] grid;
	
	public SudokuSolver() {
	}
	
	private boolean checkRow(int[][] grid) {
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				
			}
		}
		return false;
	}
	
	private boolean checkCol(int[][] grid) {
		
		return false;
	}
	
	private boolean checkBox(int[][] grid) {
		
		return false;
	}
	
	private boolean possible(int[][] grid) {
		return false;
	}
	
	public static int[][] solve(int[][] grid) {
		return null;
	}
	
	public static void show(int[][] grid) {
		String str = "";
		
		for (int row = 0; row < grid.length; row++) {
			str += "\r\n";
			for (int col = 0; col < grid[row].length; col++) {
				str += grid[row][col];
			}
		}
		
		System.out.println(str);
	}
}
