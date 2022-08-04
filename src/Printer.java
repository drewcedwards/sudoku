import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// prints an ascii representation of the grid
// each number is 6x5 characters
// because each number resides on multiple lines, each row of the grid will have to be computed and printed together

public class Printer {
	
	public Grid input;
	public String[] numbers;
	// string array for each line. each column has 6 characters & 1 space to separate them (with spaces at the start and end of the line)
	// each completed string in the array should be 64 characters wide ((9 * 7) + 1), with spaces included.
	// the array shoould be as well as 55 lines long. 53 lines
	public int rows_done;  // carriage
	
	public Printer(Grid input) {
		this.input = input;
		this.numbers = new String[50];
		this.rows_done = 0;
		
		try {
			this.read_src();
		} catch (FileNotFoundException fnf) {
			System.out.println("file not found: " + fnf);
		} catch (IOException io) {
			System.out.println("input/output exception: " + io);
		}
	}
	
	public void read_src() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("numbers");
		BufferedReader br = new BufferedReader(fr);
		
		// placed into the numbers array line by line.
		// each line in the array is 1 less than the .txt line number. e.g., the first line in numbers.txt corresponds to the 0th element.
		for (int y = 0; y < 50; y++) {
			numbers[y] = br.readLine();
		}
		
		br.close();
		
		// example & reference -- zero from [0,4]. lines 1 to 5.
		// 1 starts at index 5, 2 at 10, 3 at 15 ...
		
	}
	
	
	// 1 space before and after each row
	// 1 space between each number

	public void print_row(int y) {  
		int row_values[] = get_row(input, y);
		ArrayList<String> output = new ArrayList<String>();
		
		for (int h = 0; h < 5; h++) {  // the height of each number is 5 lines. h is added to the index of the numbers[] array each iteration to traverse it downwards.
			String line = "";
			for (int num = 0; num < 9; num++) {  // 9 numbers long.
				int index = 5 * row_values[num];  // 
				line = line + " " + numbers[index+h];
			}
			output.add(String.valueOf(line+"\n"));
			
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.print(output.get(i));
		}
		
	}
			
	
	public int[] get_row(Grid input, int row_num) {  // reminder: 9 numbers in rows and cols. rows are numbered 0 through 8, from top to bottom.
		int[] row = new int[9];
		for (int i = 0; i < 9; i++) {
			row[i] = input.get_value(row_num, i);
		}
		return row;
	}
	
	public void print() {
		
		System.out.println();
		
		for(int i = 0; i < 9; i++) {
			print_row(i);
			System.out.println();
		}
		System.out.println();
		
	}
	
	
}
