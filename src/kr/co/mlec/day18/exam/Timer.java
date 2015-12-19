package kr.co.mlec.day18.exam;

public class Timer extends Thread{
	private int time;
	
	public Timer(int time){
		this.time = time;
	}
	/*
	 * 20초 남았습니다.
	 * 10초 남았습니다.
	 * 3초 남았습니다.
	 * 2초 남았습니다.
	 * 1초 남았습니다.
	 * 종료되었습니다.
	 */
	
	public void run(){
		for(int i=time;i>0;i--){
			if((i<30&&i%10==0) || i<4){
		System.out.println(i+"초 남았습니다.");}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
		}
		System.out.println("종료되었습니다");
	}
}
