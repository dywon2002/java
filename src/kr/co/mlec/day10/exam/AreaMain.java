/*

-	면적을 구할 랜덤 숫자까지 생성되었다면 
     각각의 도형의 면적을 구하는 클래스를 호출합니다.
-	출력결과는 아래와 같이 출력됩니다.
정사각형일 경우 : 정사각형의 면적은 9 입니다
직사각형일 경우 : 직사각형의 면적은 12 입니다
삼각형일 경우   : 삼각형의 면적은 6 입니다
원일 경우       : 원의 면적은 6 입니다
 */
package kr.co.mlec.day10.exam;

import java.util.Random;

public class AreaMain {
	public static void main(String[] args) {
		Random r = new Random();
		Shape s = null;
		// 1-정사각형, 2-직사각형, 3-삼각형, 4-원
		int type = r.nextInt(4) + 1;
		switch (type) {
		case 1: 
			s = new Square(r.nextInt(10) + 1);
			break;
		case 2: 
			s = new Rectangle(
					r.nextInt(10) + 1, r.nextInt(10) + 1);
			break;
		case 3: 
			s = new Triangle(
					r.nextInt(10) + 1, r.nextInt(10) + 1);
			break;
		case 4:
			s = new Circle(r.nextInt(10) + 1);
			break;
		}
		s.area();
	}
}





















