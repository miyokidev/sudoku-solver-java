/*
 * Utility Class cannot be instantiated
 */
public final class SudokuSolver {
	public static int[][] grid = null;
	
	private SudokuSolver() {
	}
	
	private static boolean checkRow(int row, int col, int n) {
		
		return true;
	}
	
	private static boolean checkCol(int row, int col, int n) {
		
		return true;
	}
	
	private static boolean checkBox(int row, int col, int n) {
		
		return true;
	}
	
	private static boolean possible(int row, int col, int n) {
		return false;
	}
	
	public static int[][] solve(int[][] gridToSolve) {
		grid = gridToSolve;
		
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				possible(row, col, 1);
			}
		}
		return null;
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
