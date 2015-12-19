package kr.co.mlec.day09;

public class StaticTest02 {

	// static int i = 100;
	int i = 100;
	static int j = 200;
	void test(){
		System.out.println(i);
		System.out.println(j);
	}
	
	public static void main(String[] args) {

		StaticTest02 test02 = new StaticTest02();
		// static 영영에서는 static선언된 것들만 접근이 가능하다.
		// 단 , 인스턴스 변수 또는 메서드를 접근하려면
		// 인스턴스 객체를 생성한 후 생성된 객체변수?? 으로 접근해야 한다.
		System.out.println(test02.i);

	}
}
