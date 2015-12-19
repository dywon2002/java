/*
 * 객체의 형변환
 * 형변환이 되려면 좌변과 우변의 클래스가 상속 관계가 있어야 한다
 * 
 * 형변환 종류
 * 1. 묵시적(암묵적,업캐스팅)
 *    부모 = 자식
 *    - 부모타입의 변수객체가 접근 가능한 범위는 부모 클래스에 선언된 것들만 가능함
 *    - 단, 부모 클래스의 메서드를 호출할 때 자식클래스의 메서드가 호출될 수 있다
 *      자식클래스에서 부모클래스의 메서드를 오버라이딩(재정의) 했을 경우에는
 *      자식클래스의 메서드가 호출된다
 *    - 변수는 항상 부모의 값만 호출된다
 * 2. 명시적(다운캐스팅) 형변환 묵시적과 반대
 *    자식 = (자식)부모
 *    
 */

package kr.co.mlec.day10;

public class CastTest {
	
	/*
	 * Animal a = d;
	 * Animal a = c;
	 */
	// 메소드 오버라이딩의 경우에는 자식의 메소드를 호출한다
	public static void eat(Animal a){
		a.eat();
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		eat(d);
		Cat c = new Cat();
		eat(c);
		
//		Dog d = new Cat(); // 관계가 없을 경우 오류 발생
		Animal ani = new Dog(); // 부모 = 자식, 부모는 자식을 받을 수 있다
		// 접근 범위 체크
		// Animal 클래스 자체에 존재하는 변수 접근
		System.out.println(ani.name);
		System.out.println(ani.age);
		// Dog 클래스에 존재하는 메서드 접근
//		ani.bark(); // 에러가 발생, Animal 클래스에 선언되지
									  // 않아서 오류 발생
									  // 원칙에서 어긋나는게 하나 있다
		ani.eat(); // 많이 사용된다
		
		Dog d2 = new Dog();
//		Cat d2 = d2; // 상속관계가 전혀 없기 때문에 안됨
		
		Animal a2 = new Dog();
//		Cat c3 = a2; // 컴파일 오류, 문법적 오류
//		Cat c4 = (Cat)a2; // 문법적으로는 오류가 안난다, 눈속임, 실행하면 개가 튀어나온다
		Dog d3 = (Dog)a2; // 정상실행
		
	}
	

}
