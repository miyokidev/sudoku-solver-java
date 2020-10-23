import java.util.Arrays;

public class Program {

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
		
		int[][] solution = {{1,3,5,6,8,7,9,2,4},
				  			{2,8,7,4,9,1,6,5,3},
				  			{9,6,4,3,2,5,8,7,1},
				  			{7,9,8,5,1,2,4,3,6},
				  			{5,4,3,7,6,8,1,9,2},
				  			{6,1,2,9,3,4,7,8,5},
				  			{3,5,6,1,7,9,2,4,8},
				  			{8,7,1,2,4,3,5,6,9},
				  			{4,2,9,8,5,6,3,1,7},};
		
		SudokuSolver.show(puzzle); // Show the puzzle before it's solved.
		puzzle = SudokuSolver.solve(puzzle); // Methods that solve the puzzle
		// If the puzzle is the same as the solution we show it.
		if (Arrays.equals(puzzle, solution)) {
			SudokuSolver.show(puzzle);	
		}
		SudokuSolver.show(puzzle);
	}

}
