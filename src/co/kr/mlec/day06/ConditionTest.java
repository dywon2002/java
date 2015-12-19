package co.kr.mlec.day06;

import java.util.Scanner; // 문장이 익숙해질때까지 직접 타이핑 하는 습관이 중요
import java.util.Random;

public class ConditionTest {

	/*
	 * 메서드 안에 선언되는 변수
	 * 지역변수, 로컬변수
	 * 자동 초기화가 발생하지 않는다
	 * 선언된 변수를 사용하기 전에 값을 반드시 초기화하는 부분이 있어야 한다
	 */
	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		Scanner sc = new Scanner(System.in); // 참조형은 사용자가 직접 만들수있다
		// java.util에 들어있다 참조형은 값이 시작할때 new로 시작한다 
		System.out.print("수를 입력하세요 : "); // println은 줄넘기고 커서가 떨어진다
		int num = sc.nextInt();
		
		System.out.print("수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		int result;
		
		if(num==num2){
			result = 1; // 조건에 따라 달라지는 부분은 안의 출력값만 변한다
		}
		else {
			result = 0;
		}
		System.out.println("출력값은 "+result);
		
		
//		ConditionTest ct = new ConditionTest(); // 공간을 만들어준다
//		Random r = new Random(); // 난수 만드는 함수 램덤이라는 클래스가 존재한다 API이다 JDK가 설치될때 따라온다
//		// 사용을 위해서 new를 선언해준다
		
		System.out.print("월을 입력하세요 : ");
		int month = sc.nextInt();
		
		
		String s; // 자바는 값이 없으면 임의의 값을 넣어주지 않는다 null을 안 넣어주면 default에서 확실히 값을 넣어준다
		
		switch (month){ // switch (기준값)
		case 12: //break가 없으면 무조건 밑으로 내려간다
		case 1:
		case 2:	
			s="겨울";	
			break; // 블록을 빠져나올때 쓰는것 break;
		case 3:
		case 4:
		case 5:
			s="봄";
			break; // 블록을 빠져나올때 쓰는것 break;
		default:
			s="가을 또는 여름";
		}
		System.out.println(s+"입니다."); // 중복되는 부분은 하나로 묶는것이 좋다
		
		int age;
		int i = 12;
		
		if(i>10){
			age = i;
		}
		else{
			age= -1;
		}
		System.out.println(age);
		
	}

}
