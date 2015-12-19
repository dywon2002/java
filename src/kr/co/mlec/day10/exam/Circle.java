package kr.co.mlec.day10.exam;

public class Circle extends Shape {
	private int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public void area() {
		System.out.println(
				"원의 면적은 " + Math.PI * radius * radius + "입니다.");
	}
}
