package kr.co.mlec.day12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;

public class ExceptionTest01 {
	public static void main(String[] args) {
		// 예외는 컴파일 시점과 실행 시점으로 나눌 수 있고
		// 예외가 발생하게 되면 JVM은 해당 예외와 관련된
		// 예외 클래스 객체를 찾고 예외 객체를 생성한 후
		// 알려준다
		
		// 컴파일 시점 예외 : 이클립스 에서는 소스 작성시 자동 컴파일 되기 때문에
		//              소스 작성시 예외 발생 여부를 알 수 있다
		//              반드시 예외 처리를 해야만 프로그램이 동작할 수 있다
		// CheckedException(컴파일 시점)
		try {
			FileReader fr = new FileReader("a.txt");
		} catch (FileNotFoundException e) {
			// TODO 자동 생성된 catch 블록
			System.out.println("a.txt 파일이 없어서 예외가 발생했음...");
			e.printStackTrace();
		}
			
		// RuntimeException의 하위 클래스 NullPointerException 테스트
		String str = "Hello";
		str = null;
		System.out.println("문자열의 길이 : "+str.length());
		
		
		Random r = new Random();
		int num = r.nextInt(3); // 0부터 2까지
		System.out.println("생성된 난수 : "+num);
		// 실행 시점 발생 예외 : 코드를 실행 시켰을때 발생함
		//                필요에 따라서 예외처리를 진행함
		// UnCheckedException(실행 시점)
		System.out.println("생성된 난수로 나누기 : "+10/num);
		
	}
}
