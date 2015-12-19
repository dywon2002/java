// getName() : 스레드의 이름을 가져온다

package kr.co.mlec.day18.exam;

import java.util.Random;

class CallCenter extends Thread{
	int money; // 총 합계 금액
	
	
	CallCenter(String name){
		super(name); // Thread(String) : 스레드의 이름을 설정함
	}
	
	public void run(){
		// 랜덤한 금액을 모금 : 1000 ~ 10000
		Random r = new Random();
		for(int i=1;i<=10;i++){
			try{
				Thread.sleep(1000);
				
			}
			catch(InterruptedException e){
			}
			money+=(r.nextInt(10)+1)*1000;
			System.out.println(getName() + " 모금 금액("+money+")");
		}
	}
}

public class Exam05 {
	public static void main(String[] args) {
		CallCenter c1 = new CallCenter("1번 : ");
		CallCenter c2 = new CallCenter("2번 : ");
		CallCenter c3 = new CallCenter("3번 : ");
		
		c1.start();
		c2.start();
		c3.start();
		
		try {
			c1.join();
			c2.join();
			c3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int totMoney = c1.money+c2.money+c3.money;
		System.out.println("총 모금 금액 : "+totMoney+"원");
	
	}
}
