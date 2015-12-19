/*
 * 다형성
 * 1. 오버로딩 : 메서드의 이름은 같고 매개변수의 타입 또는 개수가 다르다
 * 2. 오버라이딩 : 우선 상속 관계에서 발생한다, 부모클래스의 메서드 선언부를 동일하게
 * 			     자식클래스에서 정의하는 것을 말한다
 * 			     부모클래스의 메서드의 내용을 자식클래스 변경해서 처리하고 싶을때
 * 
 * 상속 
 * 1. extends 키워드를 이용해서 상속한다
 * class 클래스명 extends 상속할 클래스명
 * class Manager extends Employee
 * 2. 부모, 상위, super : Employee
 *    자식, 하위, sub : Manager
 * 3. 부모클래스에 선언되어 있는 변수 또는 메서드를 마치 자신의 것처럼 접근해서 사용할 수 있다
 *    단, 접근제한자가 허용되어야만 가능하다
 *    (public, protected, default, private)
 * 4. 부모 코드에 접근하려고 할 때 사용하는 키워드 : super
 *    super.변수 : 부모클래스의 멤버변수 접근
 *    super.메서드 : 부모클래스의 메서드를 접근
 *    super([값, ...]) : 부모클래스의 생성자를 호출
*/

package kr.co.mlec.day09;


class Animal{
	void cry(){
		System.out.println(1);
	}
}

class Duck extends Animal {
	void cry(){ // 오버라이딩은 부모 클래스의 같은 이름 메소드를 복사
		System.out.println(1);
		System.out.println(2);
	}
}

class Dept {
	int deptNo; // 부서번호
	String name; // 부서명
}

// 사원 정보 표현 클래스
class Employee{
	String empNo; // 사번
//	private String name; // 사원명 상속 시키지 않는다
	String name; // 사원명
	String hireDate;
	Dept dept; // 부서정보
	
	Employee(){}
	Employee(String empNo,String name,String hireDate){
		this.empNo = empNo;
		this.name = name;
		this.hireDate = hireDate;
	}
	void info(){
		System.out.println("사번 : "+empNo);
		System.out.println("이름 : "+name);
		System.out.println("입사일 : "+hireDate);
	}
}

// 사원 중에서 관리자 사원을 표현
class Manager extends Employee{
	//공통되는 부분은 사원 클래스에 있는 속성을 가져다 쓴다
	// 상속 관계 활용
	Employee[] empList;
	
	Manager(){}
	Manager(String empNo,String name,String hireDate, Employee[] empList){
		super(empNo,name,hireDate);
//		this.empNo = empNo;
//		this.name = name;
//		this.hireDate = hireDate;
		this.empList = empList;
	}
	void info(){ // 다형성
		super.info(); // 부모가 info를 가지고 있는지 확인하고 있으면 출력한다
					  // 그냥 info를 할경우 자신의 클래스에 있는 자신의 메소드를 실행하므로 계속 돈다
		
		// 부모클래스에 있는 내용에 추가적인 작업 진행
		System.out.println("관리하는 사원 정보 출력");
		System.out.println("-------------------");
		for(Employee e : empList){ // empList의 배열만큼 하나씩 앞으로 
								   // 첫번째 e는 e1, 두번째 e는 e2가 된다
			System.out.println(e.name);
		}
		System.out.println("-------------------");
	}
}

public class ExtendsTest {
	
	public static void main(String[] args) {

		Employee e1 = new Employee("m0001","노찬호","2016-04-10");
		// 사번 : m0001
		// 이름 : 노찬호
		// 입사일 : 2016-04-10
		e1.info();
		Employee e2 = new Employee("m0002","문창현","2016-04-18");
		e2.info();
		
		Manager m = new Manager("m0000","이상영","2016-04-01",new Employee[]{e1,e2});
		System.out.println("관리자 정보");
		m.info();
		
		/*
		Employee e1 = new Employee();
		e1.empNo = "m0001";
		e1.name = "노찬호";
		e1.hireDate = "2016-04-10";
		
		Employee e2 = new Employee();
		e2.empNo = "m0002";
		e2.name = "문창현";
		e2.hireDate = "2016-04-18";
		
		Manager m = new Manager();
		m.empNo = "m0000";
		m.name = "이상영";
		m.hireDate = "2016-04-01";
		m.empList = new Employee[]{e1,e2};
		
		System.out.println(m.name);
		*/
	}

}
