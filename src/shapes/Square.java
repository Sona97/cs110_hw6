package shapes;

public class Square {
	
	private int length;
	
	public Square(int a) {
		this.length = a;
	}
	
	public int getArea() {
		return this.length*this.length;
	}
}