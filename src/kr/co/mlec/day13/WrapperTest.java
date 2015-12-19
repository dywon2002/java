/*
 * 기본형에 대한 객체 타입
 * --------------------------
 * byte Byte
 * short Short
 * int Integer
 * long Long
 * float Float
 * double Double
 * boolean Boolean
 * char Character
 * --------------------------
 */



package kr.co.mlec.day13;

public class WrapperTest {

	private static void call(Object o){
		
	}
	
	public static void main(String[] args) {
		
		// 1.4버전까지 사용하던 방식
		int i = 100;
		// int의 참조클래스 타입 변환
		Integer iObj = new Integer(i);
		call(iObj);
	
		call(i); // new Integer(i)
		
		// boolean의 참조클래스 타입 변환
		boolean flag = false;
		Boolean bObj = new Boolean(flag);
		call(bObj);

		// 1.5버전부터 사용
		// AutoBoxing   : 기본형->참조형 자동으로 진행
		// AutoUnboxing : 참조형->기본형 자동으로 진행
		
		int i2 = 100;
		Integer iObj2 = i2;
		call(iObj2);
		int i3 = iObj2;
		
		call(i2);
		
	}
}
