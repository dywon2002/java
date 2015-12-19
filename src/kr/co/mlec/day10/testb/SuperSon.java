package kr.co.mlec.day10.testb;


public class SuperSon extends SuperMother {
	 private String name; 
	 public SuperSon(String MotherName, String SunName) {
	        super(MotherName);      //SuperMother 클래스의 생성자 호출
	        this.name = SunName;
	    } 
	    public SuperSon(String MotherName,int MotherAge, String SunName) {
	        super(MotherName, MotherAge);   //SuperMother 클래스의 생성자 호출
	        this.name = SunName;
	    }
	     public void printContent() { 
	     if (super.age > 0) System.out.println("엄마 이름 : "+ super.name + " && 엄마나이 : " + super.age + " / 아들 이름 : " + name);  
	     else System.out.println("엄마 이름 : "+ super.name + " / 아들 이름 : " + name); 
	    }  
	 }