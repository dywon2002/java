package kr.co.mlec.day18.exam;

class Animal {}
/* 이미 다른 클래스를 상속받고 있을 때는 Thread 클래스의 상속이 불가능(단일상속)
 * 이런 경우 Runnable 인터페이스를 이용
class Dog extends Animal{
	
}
*/

class Eyes extends Thread{
	public void run(){
		for(int i=1;i<=100;i++){
			System.out.println(i+"번째 눈을 붙이는 작업입니다");
		}
	}
	
}

class Lips extends Thread{
	public void run(){
		for(int i=1;i<=100;i++){
			System.out.println(i+"번째 입을 붙이는 작업입니다");
		}
	}
}
class Nose extends Thread{
	public void run(){
	for(int i=1;i<=100;i++){
		System.out.println(i+"번째 코를 붙이는 작업입니다");
		
	}
}
}
public class Exam01 {

	
	public static void main(String[] args) {

		Thread e = new Eyes();
		Thread l = new Lips();
		Thread n = new Nose();
		
		n.start();
		e.start();
		l.start();
		
	}

}
