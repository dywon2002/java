package kr.co.mlec.day10.exam;

public class Square extends Rectangle {
	public Square(int side) {
		super(side, side);
	}
	
	public void area() {
		System.out.println("정사각형의 면적은 " + side1 * side2 + "입니다.");
	}
}
