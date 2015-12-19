package kr.co.mlec.day09;

/*
//반환타입과 class 이름만 확인하면 된다, 생성자는 클래스 이름과 똑같아야한다
// 다형성의 특징 : 여러개의 같은 이름의 생성자를 만들수 있다
//             객체 지향 언어의 특성, 오버로딩,오버라이딩,변수의 다형성
//             동일한 이름의 메서드가 선언되면서 매개변수의 개수 또는 타입이
//             다른 것을 오버로딩이라고 한다
 * - 디폴트 생성자
 * 개발자가 명시적으로 클래스 정의시 생성자를 정의하지 않았을 경우
 * 컴파일러!가 자동으로 제공하는 생성자를 의미한다
 * 형태 : 클래스명() -> 매개변수가 없는 형태
 * Dog() {} : 디폴트 생성자 형태 -> 생성자가 정의되지 않았을때
 * - 클래스 작성시 기본 생성자 형태 이외의 생성자를 정의할 때는
 *   기본 생성자 형태도 같이 추가해준다
 * - 생성자의 활용
 * 클래스 내의 속성(필드,멤버변수)에 대한 초기값을 설정함
 * - this 키워드의 활용
 * this는 인스턴스 객체를 가리키는 히든 변수임
 * this는 모든 static이 붙지 않는 메서드에 숨겨진 변수
 * this([매개변수, ...]) : 생성자 호출, 생성자 내에서만 사용 가능, 가장 위쪽에 선언해야 함
 * */

class Dog{
	/*Dog(){ // 생성자, 반환 타입이 없다, class 이름과 같다
		System.out.println("1");
	}
	Dog(String name){ 
	System.out.println("2");
	
	}
	*/
	String name;
	int age;
	Dog(){}
	Dog(String name){
		System.out.println("2");
	}
	// 변수 찾기 : 모든 변수는 자기 자신의 스코프(자기를 감싸고있는 블락)부터 검색한다
	Dog(/* Dog this */String name,int age){
	this.name = name;
	this.age = age;
	}
}


public class ConstructorTest01 {

	public static void main(String[] args) {
		// 쫑, 2
		Dog d = new Dog();
		d.name = "쫑";
		d.age = 2;
		
		Dog d2 = new Dog("쫑",2);
		
		/*
		System.out.println("3");
		Dog d = new Dog();
		// d.info(); 
		System.out.println("4");
		*/
	}

}