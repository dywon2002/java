package kr.co.mlec.day12;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTest04 {

	public static void main(String[] args) {
		
		try {
		
		// FileNotFoundException
		System.out.println(1);
		FileReader fr = new FileReader("data/a.txt");
		
		// ArithmeticException
		System.out.println(1/0);
		System.out.println(3);

		// ArrayIndexOutOfBoundsException
		int [] arr = new int[1];
		arr[1] = 1;
		
		}
		// catch문이 길어지는것을 방지하고자 jdk 7 버전부터 가능
		catch (FileNotFoundException|ArrayIndexOutOfBoundsException|ArithmeticException fnfe){
			// 예외 확인시 주로 사용하는 메서드
			// String(반환타입) getMessage() : 간단한 예외 메시지를 넘겨준다
			String errMsg = fnfe.getMessage();
			System.out.println("예외 메시지 : "+errMsg);
			// 에러가 발생된 위치를 추적해준다
			fnfe.printStackTrace(); // MethodArea,Stacks,Heap 중에 Stacks의 위치를 추적
		}
		catch(Exception e){ 
			e.printStackTrace();
		}
		System.out.println(2);
		
	}

}
