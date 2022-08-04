/**
 * 
 * @author drewedwards
 * @version 0.1
 * 
 */

public class Sudoku {
	
	public static int[][] test_array = {
		{0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0}
	};
	
	public static int[][] test_array2 = {
		{0, 9, 0, 0, 0, 1, 0, 0, 6},
		{0, 0, 7, 0, 6, 0, 0, 3, 0},
		{4, 0, 0, 9, 0, 0, 7, 0, 0},
		{0, 1, 0, 0, 0, 6, 0, 0, 0},
		{0, 0, 9, 0, 0, 0, 5, 0, 0},
		{0, 0, 0, 3, 0, 0, 0, 9, 0},
		{0, 0, 4, 0, 0, 5, 0, 0, 1},
		{0, 8, 0, 0, 7, 0, 2, 0, 0},
		{1, 0, 0, 6, 0, 0, 0, 4, 0}
	};
	
	public static int[][] test_array3 = {
		{0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 7, 0, 6, 0, 0, 3, 0},
		{4, 0, 0, 9, 0, 0, 7, 0, 0},
		{0, 1, 0, 0, 0, 6, 0, 0, 0},
		{0, 0, 9, 0, 0, 0, 5, 0, 0},
		{0, 0, 0, 3, 0, 0, 0, 9, 0},
		{0, 0, 4, 0, 0, 5, 0, 0, 1},
		{0, 8, 0, 0, 7, 0, 2, 0, 0},
		{1, 0, 0, 6, 0, 0, 0, 4, 0}
	};
	
	
	public static void main(String[] args) {
		Grid game = new Grid(test_array);
		Grid game2 = new Grid(test_array2);
		Grid game3 = new Grid(test_array3);
		
		Printer printer = new Printer(game);
		//printer.print();
		
		Printer printer2 = new Printer(game2);
		//printer2.print();
		
		Printer printer3 = new Printer(game3);
		printer3.print();
		
	}

}
