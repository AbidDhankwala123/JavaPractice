package oops;

public class Rectangle {

	private int length;
	private int breadth;
	
	public void setDim(int l, int b) {
		this.length = l;
		this.breadth = b;
	}
	
	public double getArea() {
		return length * breadth;
	}
	
}
