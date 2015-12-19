package kr.co.mlec.day18.exam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exam04 {
	public static void main(String[] args) throws InterruptedException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		for(int i=0;i<100;i++){
			Thread.sleep(1000);
			System.out.println(sdf.format(new Date()));
		}
		
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("타이머를 설정하세요(30초~60초) : ");
		int time = sc.nextInt();
		Timer t = new Timer(time);
		System.out.println("타이머를 시작합니다.");
		t.start();
		*/
	}
}
