package kr.co.mlec.day10.exam;

public class Rectangle extends Shape {
	protected int side1;
	protected int side2;
	
	public Rectangle() {}
	public Rectangle(int side1, int side2) {
		this.side1 = side1;
		this.side2 = side2;
	}
	public void area() {
		System.out.println("직사각형의 면적은 " + side1 * side2 + "입니다.");
	}
}
