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

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTest05 {

	public static void call() throws FileNotFoundException{
		FileReader fr = new FileReader("data/a.txt");
	}
	
	public static void main(String[] args){
		
		// call();
		try{
		call();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
	}
	
}
