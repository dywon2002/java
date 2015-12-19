package kr.co.mlec.day09.exam;

import java.util.Scanner;

class Shape {
	public void area() {
	}
}

class Rectangle extends Shape {
	Rectangle() {
	}

	int side1 = 0;
	int side2 = 0;
	
	Rectangle(int num1, int num2) {
		this.side1 = num1;
		this.side2 = num2;
	}
	public void area(){
		System.out.println("직사각형의 면적은 "+side1*side2);
	}
}

class Triangle extends Shape {
	Triangle() {
	}
	int side1 = 0;
	int side2 = 0;
	Triangle(int num1, int num2) {
		this.side1 = num1;
		this.side2 = num2;
	}
	public void area(){
		System.out.println("삼각형의 넓이는 "+side1*side2/2);
	}
}

class Circle extends Shape {
	Circle() {
	}
	int side = 0;
	Circle(int num1) {
		this.side = num1;
	}
	public void area(){
		System.out.println("원의 면적은 "+Math.PI*side*side);
	}
}

class Square extends Rectangle {
	Square() {
	}

	Square(int num1) {
		super(num1,num1);
		
	}

	public void area() {
		System.out.println("정사각형의 면적은" +side1 * side2);
	}

}

public class AreaMain {

	public static void main(String[] args) {

		int num1 = (int) (Math.random() * 9 + 1);
		int num2 = (int) (Math.random() * 9 + 1);

		Scanner sc = new Scanner(System.in);

		System.out.println("면적을 구할 도형의 종류를 표현할 랜덤한 숫자를 생성합니다.(1~4)");
		System.out.println("1-정사각형, 2-직사각형, 3-삼각형, 4-원, 5-종료");
		System.out.print("원하는 도형의 번호를 선택하세요 : ");
		int i = sc.nextInt();
		
		Shape s = null;
		
		switch (i) {
		case 1:
			s = new Square(num1);
			break;
		case 2:
			s = new Rectangle(num1, num2);
			break;
		case 3:
			s = new Triangle(num1, num2);
			break;
		case 4:
			s = new Circle(num1);
			break;
		case 5:
			System.exit(0);
		default:
			break;
		}
		s.area();
	}

}
