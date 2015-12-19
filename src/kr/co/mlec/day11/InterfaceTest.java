/*
 * Interface
 * 
 * 1. 선언방법
 * 	  class 키워드 자리에 interface 키워드를 사용
 * 2. 인터페이스에 선언되는 모든 메서드는 자동으로 public abstract가 추가됨
 * 3. 인터페이스에 선언되는 모든 변수는 자동으로 public static final 추가됨
 * 4. 클래스가 인터페이스를 상속할 경우 implements 키워드를 사용함
 *    클래스 extends 클래스
 *    클래스 implements 인터페이스
 *    인터페이스 extends 인터페이스
 * 5. 인터페이스는 객체 생성이 불가능
 * 6. 인터페이스 타입의 참조 변수는 자식클래스를 이용해서 얻는다
 * 7. 인터페이스는 다중 상속을 지원한다
 *    - 클래스는 단일 상속만 지원함
 *    	class Test extends A, B (X)
 *    	class Test implements TV, Printable, ... (O)
 */

package kr.co.mlec.day11;

// 구현이 아닌 추상개념
interface TV{
	// 상수일 때 이름 규칙 : 전부다 대문자로 표기하되 단어와 단어사이에 '_'를 사용
	int MIN_CHANNEL = 1; // 인터페이스가 있으면 자동으로 public static final이 앞에 붙었다고 보면 됨
	int MAX_CHANNEL = 130;
	
	/* public abstract */ void powerOn(); // public abstract가 자동 추가됨
	public void powerOff();
	public void channelUp();
	public void channelDown();
	public void soundUp();
	public void soundDown();
}

class SamsungTV implements TV{

	@Override // 어노테이션(이 메소드는 어떤 메소드입니다 라는 추가적인 정보를 준다) 메소드의 기능과 전혀 무관하다
	public void powerOn() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("삼성 티비 전원을 켠다.");
	}

	@Override
	public void powerOff() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("삼성 티비 전원을 끈다.");
	}

	@Override
	public void channelUp() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("삼성 티비 채널을 올린다.");
	}

	@Override
	public void channelDown() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("삼성 티비 채널을 내린다.");
	}

	@Override
	public void soundUp() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("삼성 티비 소리를 올린다.");
	}

	@Override
	public void soundDown() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("삼성 티비 소리를 내린다.");
	}
}
class LgTV implements TV{
	
	@Override // 어노테이션(이 메소드는 어떤 메소드입니다 라는 추가적인 정보를 준다) 메소드의 기능과 전혀 무관하다
	public void powerOn() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("LG 티비 전원을 켠다.");
	}
	
	@Override
	public void powerOff() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("LG 티비 전원을 끈다.");
	}
	
	@Override
	public void channelUp() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("LG 티비 채널을 올린다.");
	}
	
	@Override
	public void channelDown() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("LG 티비 채널을 내린다.");
	}
	
	@Override
	public void soundUp() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("LG 티비 소리를 올린다.");
	}
	
	@Override
	public void soundDown() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("LG 티비 소리를 내린다.");
	}
}

public class InterfaceTest {
	public static void showTV(TV tv){
		tv.powerOn();
		tv.channelUp();
		tv.soundUp();
		tv.powerOff();
	}
	
	public static void main(String[] args) {
//		TV.MAX_CHANNEL = 200;
		TV tv = new LgTV(); // 객체 변수 참조를 얻기 위해서 자식 이용
		
		
		System.out.println("TV 최대 채널 : "+TV.MAX_CHANNEL);
		System.out.println("TV 최소 채널 : "+TV.MIN_CHANNEL);
		showTV(new SamsungTV());
		
		showTV(new LgTV());
		
		
//		TV tv = new LgTV();
//		tv.powerOn();
//		tv.channelUp();
//		tv.soundUp();
//		tv.powerOff();
	}
}
