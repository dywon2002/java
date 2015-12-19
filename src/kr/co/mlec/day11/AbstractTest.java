/*
 * 추상클래스 
 * 1. 클래스의 선언부에 abstract 키워드가 붙은 클래스
 * 2. 추상메서드 : 메서드의 선언부에 abstract가 붙은 메서드
 *    - 메서드의 구현부인(바디) {}을 빼야한다
 * 3. 추상클래스를 상속 받은 클래스는 반드시 (필수) 상속받은 클래스의 추상메서드를 오버라이딩(재정의)해야한다 필수
 * 4. 추상클래스는 추상메서드와 구현된 메서드를 동시에 정의할 수 있다
 * 5. 객체 생성이 불가능하다 (new가 안된다) 추상클래스는 인스턴스를 직접 만들수 없다
 * 6. 추상클래스 타입의 객체 변수에 주소값을 생성하기 위해서는
 *    자식클래스를 이용한다
 * 	  Print p = new 자식클래스();
 *    추상클래스가 없으면 각각의 클래스에 들어가서 출력하고자 하는 메서드를 일일이 파악해야한다
 *    번거로움을 덜수있다
 */

package kr.co.mlec.day11;

abstract class Print{
	String name;
	public void info(){
		System.out.println(name+"프린터...");
	}
	public abstract void print(); // 메서드의 선언부
	
}

class SamsungPrint extends Print{
	public SamsungPrint(){
		name = "Samsung";
	}
	@Override
	public void print() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("재정의된 print 메서드");
	}
}
class LgPrint extends Print{
	public LgPrint(){
		name = "Lg";
	}
	@Override
	public void print() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("재정의된 print 메서드");
	}
}

public class AbstractTest {
	public static void main(String[] args){
//		Print p = new Print();
		Print p = new SamsungPrint();
		// 추상메서드를 호출 시 자식클래스의 재정의된 메서드가 호출된다
		p.info();
		p.print();
		
		p = new LgPrint(); // 변수의 다형성
		p.info();
		p.print();
	}
}
