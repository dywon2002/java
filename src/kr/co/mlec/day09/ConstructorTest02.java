package kr.co.mlec.day09;

// 실행 시
// 고양이의 이름은 아직없음이고 나이는 0살입니다
// 고양이의 이름은 나비이고 나이는 7살입니다
// 고양이의 이름은 별이이고 나이는 0살입니다
class Cat{
	String name;
	int age;
	
	void info(){
			System.out.println("고양이의 이름은 "+name+"이고 나이는 "+age+"살입니다");
	}
	
	Cat(){
		// 생성사 내에서만 호출 가능하다
		this("아직없음",0); // 해당 매개변수가 들어있는 생성자를 부른다 this.name this.age를
						 // 반복할 필요 없다, 항상 생성자 내에서 맨 위에 위치한다
	}
	Cat(String name,int age){
		this.name = name;
		this.age = age;
	}
	Cat(String name){
		this(name,0);
	}
	
}

public class ConstructorTest02 {

	public static void main(String[] args) {

		Cat c = new Cat();
		Cat c2 = new Cat("나비",7);
		Cat c3 = new Cat("별이");
		
		c.info();
		c2.info();
		c3.info();
	}

}
