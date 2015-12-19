/*
 * join : 다른 스레드를 기다린다(지정된 시간만, 무한)
 * 
 * join(long) : 지정된 시간만 기다리기
 * join() : 무한 기다리기
 */

package kr.co.mlec.day18;

class Girl extends Thread {
	public void run(){
		try {
			System.out.println("여친 : 남친 전화해서 깨워줌");
			System.out.println("여친 : 남친과 계속 만남을 유지할지 인내심 테스트");
			System.out.println("여친 : 10초 안 기다리면 헤어질거에요");
			for(int i = 1;i<=10;i++){
				Thread.sleep(1000);
				
				System.out.println(i+"초 지났음");
			}
			Thread.sleep(1000);
			System.out.println("여친 : 남친이 없네요");
			System.out.println("여친 : 바이바이 잘가~~");
			
		} catch (InterruptedException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
	}
}

class Boy extends Thread {
	private void sleep(int time){
		try {
			Thread.sleep(time * 1000);
		} catch (InterruptedException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
	}
	
	public void run() {
		System.out.println("남친 : 영화관 도착");
		sleep(1);
		System.out.println("남친 : 영화표 2장 구매");
		sleep(1);
		System.out.println("남친 : 여친 도착하지 않았음");
		sleep(1);
		System.out.println("남친 : 여친 기다림(내 인내심 3초)");
		Girl g = new Girl();
		g.start();
		try {
//			g.join(); // g 스레드 객체가 종료될때까지 멈춘다
			g.join(3000); // g 스레드 객체를 3초동안 기다린다
		} catch (InterruptedException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		} 
		sleep(1);
		System.out.println("남친 : 여친 안 왔음, 영화 혼자서 봄");
	}
}

public class ThreadTest05 {
	public static void main(String[] args) {
		// 남친 스레드 구동
		Boy b = new Boy();
		b.start();
	}
}
