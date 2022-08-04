/**
 * 
 * @author drewedwards
 *
 */

// cells with a value of 0 are hidden
public class Grid {
	public Cell[][] matrix = new Cell[9][9];
	
	public Grid() {  // creates a 9x9 grid of cells. each cell is given a starting value of 0.
		set_values();
	}
	
	public Grid(Cell[][] matrix) {  // (redundant) creates a 9x9 grid of cells using a matrix of Cell objects.
		this.matrix = matrix;
		set_values();
	}
	
	public Grid(int[][] matrix) {  // creates a 9x9 grid of cells from a matrix of integers.
		set_values(matrix);
	}
	
	public void set_values() {  // iterates matrix and sets each cell to 0.
		for (int x = 0; x < 9; x++) {
			for (int y = 0; y < 9; y++) {
				matrix[x][y] = new Cell(x, y, 0);
				System.out.print("initialized [" + x + "," + y + "] as ");
				System.out.println(matrix[x][y].get_value());
			}
		}
	}
	
	public void set_values(int[][] imported_matrix) {  // iterates the matrices and sets each cell to its corresponding value.
		for (int x = 0; x < 9; x++) {
			for (int y = 0; y < 9; y++) {
				matrix[x][y] = new Cell(x, y, imported_matrix[x][y]);
				System.out.print("initialized [" + x + "," + y + "] as ");
				System.out.println(matrix[x][y].get_value());
			}
		}
	}
	
	public int get_value(int x, int y) {
		return matrix[x][y].get_value();
	}
	
	public void check_row_validity() {
		
	}
	
	public void check_col_validity() {
		
	}
	
	public void iterate(Cell current) {
		Cell nextup;
		
	}
	
	public void print() {
		System.out.println();
		for (int x = 0; x < 9; x++) {
			if (x == 0 || x == 3 || x == 6)
				System.out.println("  ");
			System.out.print(" ");
			for (int y = 0; y < 9; y++) {
				if (y == 3 || y == 6)
					System.out.print(" ");
				System.out.print(matrix[x][y].get_value());
			}
		}
	}
	
}
