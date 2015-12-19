package kr.co.mlec.day10.exam;

public class Triangle extends Shape {
	private int width; 
	private int height;
	public Triangle(int width, int height) {
		this.width  = width;
		this.height = height;
	}
	
	public void area() {
		System.out.println("삼각형의 넓이는 " + width * height / 2 + "입니다.");
	}

}









