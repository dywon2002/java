package kr.co.mlec.day10.testb;

public class SuperMother {
	  protected String name;
	  protected int age;
	     public SuperMother(String name) {
	         this.name = name;
	     }    
	     public SuperMother(String name,int ages) {
	      age = 0;
	         this.name = name;
	         this.age = ages;
	     }    
	     public void printContent() {
	         System.out.println("엄마 이름 : " + name);
	    }
	 }