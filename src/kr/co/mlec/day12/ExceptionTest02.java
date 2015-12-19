package kr.co.mlec.day12;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTest02 {

	public static void main(String[] args) {
		// try : 예외발생 코드를 묶는 역할
		// catch : try 블럭에서 예외가 발생할 경우 발생한 예외에 대한 처리를 진행
		// 		    메서드처럼 매개변수를 선언함
		//         매개변수 타입으로 선언되는 것은 try에서 발생한 예외클래스 타입을 명시함
		
		try {
		
			int [] arr = new int[1];
			
			arr[1] = 1;
			
			System.out.println(1);
			// FileNotFoundException
			// data/a.txt 파일이 없을경우
			// 1. 실행시 JVM이 파일이 없는 것과 연관된 예외클래스를 찾는다
			// 2. FileNotFoundException 객체를 생성한다
			// 3. 생성된 예외 객체를 처리할 catch 블럭을 찾는다
			// 4. 처리할 catch 블럭이 존재하면 해당 블럭으로 생성한 예외객체를 넘긴다
			// 
			// new FileNotFoundException(..);
			
		FileReader fr = new FileReader("data/a.txt");
		
			// new ArimeticException(..);
			// 만약, 처리할 catch 블럭이 존재하지 않으면 JVM 기본 예외처리기가 실행된다
			// 프로그램이 비정상적으로 종료됨
		System.out.println(1/0);
		
		}
		catch (FileNotFoundException fnfe){
		// 개발자가 작성하는 예외 처리 코드
			System.out.println("a.txt 파일이 존재하지 않습니다.");
		}
		catch (ArithmeticException ae){
			// 개발자가 작성하는 예외 처리 코드
				System.out.println(5);
			}
		catch (ArrayIndexOutOfBoundsException aioobe){
			System.out.println("ArrayIndexOutOfBoundsException가 발생하였습니다.");
		}
		catch(Exception e){ // 제일 위로 올리면 밑에 있는 예외는 할일이 없으니까 오류가 뜬다
			                // 여러개를 잡을때 모든 예외문을 받을수 있으므로 좋다
			System.out.println(7);
		}
		System.out.println(2);
		
	}

}
