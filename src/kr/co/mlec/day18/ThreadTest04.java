/*
 * 	스레드 상태 : NoN Runnable
 * 	sleep, join, io 입출력, 동기화(Sync)
 */


package kr.co.mlec.day18;

public class ThreadTest04 {
	public static void main(String[] args) {
		System.out.println("2초 동안 sleep 상태에 들어갑니다");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
		
		System.out.println("sleep 상태에서 빠져나옴");
		
	}
}
