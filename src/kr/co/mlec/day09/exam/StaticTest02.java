package kr.co.mlec.day09.exam;

public class StaticTest02 {
	
	int i = 100;
	static int j = 200;
	
	void test(){
		System.out.println(i);
		System.out.println(j);
	}
	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		StaticTest02 test02 = new StaticTest02();
		// static 영역에서는 (static으로 선언된 block) static으로 선언된 것들만
		// 접근이 가능하다. 단 인스턴스 변수 또는 메서드를 접근하려면 인스턴스 객체를 생선한 후
		// 생성된 객체 변수로 접근해야 한다
		System.out.println(test02.i);
	}

}
