
public class Cell {
	private int x_pos;
	private int y_pos;
	private int value;
	private int group;
	// public boolean hidden = true;
	
	public Cell(int x_pos, int y_pos, int value) {
		set_x(x_pos);
		set_y(y_pos);
		set_value(value);
		set_group();
	}
	
	public void set_value(int v) {
		this.value = v;
	}
	
	public int get_value() {
		return value;
	}
	
	public void set_x(int x) {
		this.x_pos = x;
	}
	
	public int get_x() {
		return x_pos;
	}
	
	public void set_y(int y) {
		this.y_pos = y;
	}
	
	public int get_y() {
		return y_pos;
	}
	
	public void set_group() {
		int x = (this.get_x() + 1) / 3 + 1;
		int y = (this.get_y() + 1) / 3 + 1;
		this.group = x * y;
	}
	
	public int get_group() {
		return this.group;
	}
	
}


