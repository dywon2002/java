/*
 * Runnable 활용
 * 
 * Thread(Runnable) 생성자를 이용함
 * 스레드 방식으로 동작하기 위해 start() 메서드가 필요함
 * 결론 : Thread 객체가 필요함
 * 
 */


package kr.co.mlec.day18;

class LowerThread implements Runnable{

	@Override
	public void run() {
		for(int i = 1;i<=4;i++){
			for(char c = 'a' ; c<='z'; c++){
				System.out.print(c + "  ");
			}
			System.out.println();
		}
	}
	
}


public class ThreadTest02 {
	private static void doWork(){
		for(int i = 1;i<=4;i++){
			for(int c = 1 ; c<= 26; c++){
				System.out.print(c + "  ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
	
	System.out.println("main 스레드 시작");
	
	Runnable r = new LowerThread();
	
	Thread t = new Thread(r);
	
	t.start(); // JVM에 스레드의 run 메서드를 호출부탁
	
	doWork();
	
	System.out.println("main 스레드 종료");
}
}
