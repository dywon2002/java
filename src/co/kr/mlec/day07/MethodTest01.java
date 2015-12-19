package co.kr.mlec.day07;

class MethodSub01{
	// 두개의 숫자를 더해서 결과값을 만들어내는 기능
	// void : 값을 넘기지 않겠다
	// void 이외의 타입일 경우 처리한 값을 넘기겠다(나를 부른쪽으로)
	// 반환타입이 void가 아닐 경우 반드시 메서드 바디 부분에
	// return 넘길값; 형태를 명시해야한다
	int sum(int i, int j){
		return i+j; // 변수는 최대한 줄이는 것이 좋다 바로 처리한다
	}
	// 하나의 수를 받아서 넘겨받은 수의 세제곱을 구해서 결과를 돌려주는 메서드
	int se(int i){
		return i*i*i;
	}
	
}


public class MethodTest01 {
	
	/*class 라면{
		// 메소드는 동사 형태, 메서드 - 반환타입,메서드명, ([매개변수들])
		// 라면 끓이기 메소드
		//  {
		//  해야할 일들을 순서적으로 나열... 
		//  }
		// void 작업한 결과물을 줄지 안 줄지
		void 끓인다(/* 메서드가 실행할 때 필요한 값)
		{	
			// 일련의 과정을 나열
		}
		
	}
*/
	
	public static void main(String [] args){
		MethodSub01 sub01 = new MethodSub01();
		// 메서드를 부르는 쪽
		// 메서드를 부를때는 메서드의 이름으로 불러야 한다
		// 메서드의 선언된 매개변수의 타입에 들어갈 값을 넘겨야 한다
		// 만약, 메서드가 반환타입에 void가 아닌 값을 선언 했다면
		// 선택적으로 넘겨주는 값을 받을 수 있다
		int result = sub01.sum(8, 3); // 실행되면 이 값은 11이랑 같다고 생각하면된다
						 // 해당 메서드의 반환 값과 항상 똑같은 데이터타입으로 변수를 만들어 받아주면 된다.
		System.out.println("두 수의 합은 "+result+"입니다.");
		// System.out.println("두 수의 합은 "+sub01.sum(8, 3)+"입니다."); 위의 줄과 같은 의미 더 효율적인 방법
		
		
		System.out.println("5의 세제곱 값은 "+sub01.se(5)+"입니다.");
		
	}
}
