/*
 * 스레드 생성 방식
 * - 내부클래스 중에서 익명클래스를 활용하는 방식
 * - 객체 생성 + 클래스의 정의
 * - 익명클래스 형태
 * 	 new 클래스명[상속]() {
 * 		변수..
 * 		메서드..
 * 		}
 * 
 * 	 class Test{
 * 		변수
 * 		메서드..
 * 		} 위의 중괄호 부분과 동일
 * 
 * 	 new Thread(){};
 *   
 *   new Runnable(){
 *   	public void run(){
 *   
 *      }
 *   };
 * 	 
 */

package kr.co.mlec.day18;

class Human {
}

class Child extends Human {
	public void play() {
		System.out.println("지치지 않고 논다");
	}
}

// class MyThread extends Thread{
// public void run(){
// System.out.println("스레드 정의");
// }
// }

//class MyRun implements Runnable {
//
//	@Override
//	public void run() {
//		System.out.println("Runnable 구현");
//	}
//}

public class ThreadTest03 {
	public static void main(String[] args) {
//		Runnable r = new MyRun();
//		
//		Thread t = new Thread(r);
//		t.start();
		
		// 익명클래스로 변경 : Runnable r = new MyRun();
		
		Runnable r = new Runnable(){
			public void run() {
				System.out.println("Runnable 구현");
			}
		};
		Thread t = new Thread(r);
		t.start();
		
		// Thread t = new MyThread();

		// 위의 코드를 익명클래스 방식으로 변경
		/*Thread t = new Thread() {
			public void run() {
				System.out.println("스레드 정의");
			}
		};*/

		// Human h = new Child();

		// Child 클래스의 역할을 익명클래스로 선언
		// Human h2 = new Human();
		/*
		 * Human h2 = new Human(){ public void play() { System.out.println(
		 * "지치지 않고 논다"); } };
		 */
	}
}
