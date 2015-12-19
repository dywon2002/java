package kr.co.mlec.day18.exam;


public class Exam03 {

	public static void main(String[] args) {
		
		System.out.println("main 스레드 시작");

		new Thread(){
			public void run(){
				for (int i = 1;i<=100;i++){
					System.out.println("눈 붙이기 "+i+"번째 작업");
				}
			}
		}.start();
		
//		Runnable nRun = new Runnable(){
//			public void run(){
//				for (int i = 1;i<=100;i++){
//					System.out.println("코 붙이기 "+i+"번째 작업");
//				}
//			}
//		};


		new Thread(new Runnable(){
			public void run(){
				for (int i = 1;i<=100;i++){
					System.out.println("코 붙이기 "+i+"번째 작업");
				}
			}
		}).start();
		
		
		
	}
}
