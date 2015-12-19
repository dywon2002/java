package kr.co.mlec.day18.exam;


class EyesInterface implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=100;i++){
			System.out.println(i+"번째 눈을 붙이는 작업입니다");
		}
	}
}
class NoseInterface implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=100;i++){
			System.out.println(i+"번째 코를 붙이는 작업입니다");
		}
	}
}
class LipsInterface implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=100;i++){
			System.out.println(i+"번째 입을 붙이는 작업입니다");
		}
	}
}

public class Exam02 {

	public static void main(String[] args) {
		
		System.out.println("main 스레드 시작");
		
		Runnable e = new EyesInterface();
		Runnable n = new NoseInterface();
		Runnable l = new LipsInterface();
		
		Thread t1 = new Thread(e);
		Thread t2 = new Thread(n);
		Thread t3 = new Thread(l);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
