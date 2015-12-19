package co.kr.mlec.day07;

import java.util.Scanner;

class Bread{
	int price;
	String name;
}

class BreadMng{
	// 클래스 영역 : 클래스 안에 있지만 메소드에 포함되지 않은 영역
	Bread [] breadlist = new Bread [20]; // 메소드명, 변수명은 소문자 클래스명은 항상 대문자로 시작
	
	int pos = 0;
	Scanner sc = new Scanner(System.in); // 메인에서도 쓰이니까 클래스 영역으로 이동
	
	void showMenu(){
		System.out.println("---------------");
		System.out.println("1. 빵 정보 등록");
		System.out.println("2. 전체 빵 정보 보기");
		System.out.println("3. 가격으로 조회");
		System.out.println("4. 가장 비싼 빵 정보 보기");
		System.out.println("5. 가장 싼 빵 정보 보기");
		System.out.println("6. 이름으로 정보 조회");
		System.out.println("7. 시스템 종료");
		System.out.println("---------------");
		System.out.print("메뉴를 선택해주세요(1 ~ 7) : ");
		int menu = sc.nextInt();
		switch(menu){
		case 1:
		add(); // 이미 나의 클래스 안에 있으니까 앞에 객체를 만들어서 부를 필요가 없다
		break;
		
		case 2:
		view(); 
		break;
	
		case 3:
		System.out.print("가격을 입력하세요 : ");
		int price = sc.nextInt();
		viewByPrice(price); 
		break;

		case 4:
		viewMaxPriceBread();
		break;

		case 5:
		viewMinPriceBread(); 
		break;

		case 6:
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		viewByName(name);
		break;

		case 7:
		System.out.println("프로그램을 종료합니다");
		System.exit(0); // 현재 돌아가는 프로그램을 중단시킨다. 이 문장을 만나는 순간 종료
	}
	}
	
	// 빵의 정보를 등록하는 기능	
	void add(){
		System.out.println("빵 정보를 등록합니다.");
		//                  ↑ 스캐너 클래스에도 똑같이 멤버변수와 메서드가 있다	
		while(true){
		Bread b = new Bread();
		System.out.print("빵의 이름 : ");
		String name = sc.next(); // next라는 메서드를 찾는다
		b.name = name;
		System.out.print("빵의 가격 : ");
		int price = sc.nextInt();
		b.price = price;
		
		breadlist[pos++] = b;
		
		System.out.print("계속 입력하시겠습니까? (Y.예, N.아니오) :");
//		String isCon = sc.next();
//		if(isCon.equals("N"))
//				{
//			break;
//				}
		if(sc.next().equals("N")){
			break;
			}
		}
	}
	
	// 등록된 빵의 정보를 볼수 있는 기능
	void view(){
		System.out.println();
		System.out.println("빵 정보");
		System.out.println("--------------------");		
		System.out.println("이름\t가격\t");
		System.out.println("--------------------");
		// 등록된 빵의 정보 출력
		for(int i=0;i<pos;i++){
			Bread b = breadlist[i];
			System.out.println(b.name+"\t"+b.price);
		}
		System.out.println("--------------------");
	}
	
	// 특정한 가격을 받아서 해당 가격으로 구입할 수 있는 빵
	void viewByPrice(int price){
	/*
	 * 1000원으로 구입 가능한 빵
	 * -------------------
	 * 이름     가격
	 * 소보루   800
	 * 단팥빵   700
	 * -------------------	
	 */
		
		System.out.println(price+"원으로 구입 가능한 빵");
		System.out.println("이름\t가격\t");
		System.out.println("--------------------");
			for(int i=0;i<pos;i++){
				Bread b = breadlist[i];
				
				if(b.price<=price)
			{	
				System.out.println(b.name+"\t"+b.price);
		}
		}
			System.out.println("--------------------");
	}
	
	// 가장 비싼 빵
	
	void viewMaxPriceBread() {
		/*
		 * 가장 가격이 비싼 빵
		 * -----------------
		 * 소보루 600
		 * -----------------
		 */
		 Bread maxBread = breadlist[0];
		 
		 for(int i=1;i<pos;i++){
			 Bread b = breadlist[i];
			 if(maxBread.price<b.price){
				 maxBread.price = b.price;
			 }
		 }
		System.out.println("가장 가격이 비싼 빵");
		System.out.println("--------------------");
		System.out.println(maxBread.name+"\t"+maxBread.price);
		System.out.println("--------------------");	
	}
	
	// 가장 싼 빵
	
	void viewMinPriceBread() {
		/*
		 * 가장 가격이 싼 빵
		 * -----------------
		 * 소보루 600
		 * -----------------
		 */
		Bread minBread = breadlist[0];
		
		for(int i=1;i<pos;i++){
			Bread b = breadlist[i];
			if(minBread.price > b.price){
				minBread = b;
			}
			
		}
		System.out.println("가장 가격이 싼 빵");
		System.out.println("--------------------");
		System.out.println(minBread.name+"\t"+minBread.price);
		System.out.println("--------------------");
	}
	
	// 빵의 이름을 받아서 해당 빵이 등록되어 있는지 확인
	
	void viewByName(String name){
		
		System.out.println(name+"빵의 정보");
		System.out.println("--------------------");
		
		
		// 반복이 끝까지 돌았는지 확인할 수 있는 방법(flag가 아닌 int로 확인)
		int i = 0;
		for( ; i<pos; i++){
		Bread b = breadlist[i];
		if(name.equals(b.name)){
		System.out.println("이름 : "+b.name);
		System.out.println("가격 : "+b.price);
		break;
		}
		
		}
		
		if(i==pos){
		System.out.println("해당 빵의 정보를 찾을수 없습니다.");
		}
		System.out.println("--------------------");
		
//		boolean flag = false; // flag값으로 for문에서 break로 빠져나왔는지 같은 빵이 없어서 for문으로 빠져나왔는지
//							  // 체크 할 수 있다
//		//int findCnt=0;
//		for(int i = 0; i<pos; i++){
//			Bread b = breadlist[i];
//			if(name.equals(b.name)){
//				System.out.println("이름 : "+b.name);
//				System.out.println("가격 : "+b.price);
//				flag = true;
//				//findCnt++;
//				break;
//			}
//			
//		}
//		
//		// 브레이크로 반복을 벗어났는지 체크
//		if(flag==false){
//			System.out.println("해당 빵의 정보를 찾을수 없습니다.");
//		}
//		// if(findCnt == 0){
//		// System.out.println("해당 빵의 정보를 찾을수 없습니다.");
//		// }
//		System.out.println("--------------------");
	}
	
}

public class MethodTest02 {

	public static void main(String [] args){
		
		BreadMng mng = new BreadMng();
		while(true){
			mng.showMenu();
		}
		
		/*mng.add();
		mng.view();
		// 1000원으로 구입 가능한 빵의 목록
		mng.viewByPrice(1000);
		// 가격이 가장 비싼 빵 정보 보기
		mng.viewMaxPriceBread();
		// 가격이 가장 싼 빵 정보 보기
		mng.viewMinPriceBread();
		mng.viewByName("soboru");
	*/
	}
	
}
