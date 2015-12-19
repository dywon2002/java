/*
 * 	Thread를 활용하는 방식
 * 	1. Thread 클래스를 상속받는 방식
 *  2. Runnable 인터페이스를 상속받는 방식
 * 
 * 	스레드가 처리할 일
 * 	- public void run() 메소드에서 구현
 * 
 *  기본적으로 main 스레드가 자동으로 생성됨
 */

package kr.co.mlec.day18;

// 영어 대문자를 화면에 출력(4번)
// Thread 클래스를 상속받아서 사용
class UpperThread extends Thread {
	public void run(){ // 부모와 메소드 선언부를 똑같이 정의해준다(재정의,오버라이딩)
		for(int i = 1;i<=4;i++){
			for(char c = 'A' ; c<='Z'; c++){
				System.out.print(c + "  ");
			}
			System.out.println();
		}
	}
}

public class ThreadTest01 {
	
	private static void doWork(){
		for(int i = 1;i<=4;i++){
			for(int c = 1 ; c<= 26; c++){
				System.out.print(c + "  ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		// main, ut : 경쟁
		
		System.out.println("main 스레드 시작");
		// 스레드 객체(ut)
//		UpperThread ut = new UpperThread();
		Thread ut = new UpperThread();
		
		// 스레드 동작 시키기
//		ut.run(); // 직접 개발자가 동작시키면 안됨
		
		ut.start(); // JVM에 스레드의 run 메서드를 호출부탁
		
		doWork();
		
		System.out.println("main 스레드 종료");

		
		
	}

}
