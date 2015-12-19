package co.kr.mlec.day06;

public class VariableTest {
	public static void main(String [] args){
		
		// datatype
		
		// 정수
		byte b = 100; // 후반부에 많이 쓰인다 1byte = 8bit = 256 = (-128 ~ 127)
					  // -2^7 ~ 2^7 - 1
		short s = 1; // 별로 중요하지 않다
		int i = 100; // - 2147483647 ~ 2147483647
		long l = 100; // int 타입의 범위를 벗어날 경우에는 long 타입 사용(giga,tera는 int로 표현안됨)
					  // 100L은 강제로 롱타입 의미
		
		// 실수
		float f = 1.1f; // float은 뒤에 항상 소문자f나 대문자 F를 붙여야한다.
			  f = 1.1F;	
		double d = 1.1;
		
		// 문자
		// 문자는 아스키코드로 변환된다.
		char c = 'a'; // '' 안에는 무조건 한글자만
		System.out.println(c);
			 c = '\u0061'; // 유니코드는 예외, 유니코드 뒤에 16진수 최대큰 숫자는 ffff
		System.out.println(c);
			 c = 97; // 3개의 결과값은 모두 a로 출력된다
		System.out.println(c);
		
		boolean bool = true;
				bool = false; // true, false
			
		// 기본형(8가지)은 모두 소문자 <-> 기본형의 반대말은 참조형(대문자로 시작하는것은 참조형)
		
		int[] iArr; // 참조형
		
		Byte bObj;
		Short sObj;
		
		// 자바 기본서 다독이 중요
		if (bool){
			
		}
		
	}
}
