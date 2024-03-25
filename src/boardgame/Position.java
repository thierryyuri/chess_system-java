package boardgame;

public class Position {
      private int row;
      private int column;
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColum() {
		return column;
	}
	public void setColum(int colum) {
		this.column = colum;
	}
	public Position(int row, int colum) {
		super();
		this.row = row;
		this.column = colum;
	}
	
	@Override
	public String toString() {
		return row + ", " + column;
		
	}
}
