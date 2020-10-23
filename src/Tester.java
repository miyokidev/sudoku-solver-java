public class Tester {

	public static void main(String[] args) {
		
		int[][] puzzle = {{1,0,5,0,0,0,0,0,0},
				  		  {2,0,0,4,9,1,6,0,0},
				  		  {9,0,0,3,0,0,0,0,0},
				  		  {0,9,8,0,0,0,0,0,0},
				  		  {5,4,0,0,0,8,0,9,0},
				  		  {0,0,0,0,0,4,7,0,0},
				  		  {0,5,6,0,7,0,2,0,0},
				  		  {0,0,1,0,0,3,0,0,0},
				  		  {0,0,0,8,0,6,3,1,0},};
		
		SudokuSolver.grid = puzzle;
		if (SudokuSolver.possible(3,8,8)) {
			System.out.println("POSSIBLE");
		} else {
			System.out.println("IMPOSSIBLE");
		}
	}

}
