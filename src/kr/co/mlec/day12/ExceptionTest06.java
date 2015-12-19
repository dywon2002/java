/*
 * 간접처리방식
 *  - throws 키워드를 메서드의 선언부에 사용
 *  - 메서드를 호출하는 쪽에서 대신 예외처리를 진행해야 한다
 *  
 *  패키지
 *  임포트
 *  클래스선언부
 *  클래스바디
 *    - 멤버변수선언
 *    - 생성자
 *    - 일반 기능메서드
 *    - 메인메서드
 */

package kr.co.mlec.day12;

import java.io.FileReader;

public class ExceptionTest06 {

	public static void call() throws Exception{
		try{
		FileReader fr = new FileReader("data/a.txt");
		System.out.println(1/0);
		}
		catch (Exception e){
			System.out.println("개발자 스스로 에러에 대한 정보 캐치");
		
		// 개발자가 예외를 직접 발생시킨다
		// 예외 발생 키보드 : throw
		
		throw e; // 간접 처리방식으로 예외를 처리함
		}
		
	}
	
	public static void main(String[] args){
		// call();
		try{
		call();
		}
		catch(Exception e){
			System.out.println("관리자가 처리하는 예외처리 루틴 동작");
//			e.printStackTrace();
		}
		
	}
	
}
