package kr.co.mlec.day10.testb;


public class SuperTest {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		 SuperMother mom = new SuperMother("춘자");   
		   mom.printContent();   
		   SuperSon son = new SuperSon("춘자", "영구");
		        son.printContent();      
		   SuperSon sunConten = new SuperSon("춘자", 50 ,"영구");
		        sunConten.printContent();    


	}

}
