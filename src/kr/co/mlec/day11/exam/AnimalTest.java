package kr.co.mlec.day11.exam;

abstract class Animal{
	protected String name;
	
	public Animal(String name){
		this.name = name;
	}
	public abstract void eat();
	
	public abstract void cry();
	
}

interface Flyable{
	public void fly();
}

class Dog extends Animal{
	private String name;
	Dog(String name){
		super(name);
	}
	
	@Override
	public void eat() {
		System.out.println(name+": ¸Ô½À´Ï´Ù.");
	}

	@Override
	public void cry() {
		System.out.println(name+": ¸Û¸Û Â¢½À´Ï´Ù.");
	}
}

class Duck extends Animal implements Flyable{
	private String name;
	Duck(String name){
		super(name);
	}

	@Override
	public void eat() {
		System.out.println(name+": ¸Ô½À´Ï´Ù.");
	}
	
	@Override
	public void cry() {
		System.out.println(name+": ²Ð²Ð ¿ó´Ï´Ù.");
	}
	
	public void fly(){
		System.out.println(name+": ³¯°³¸¦ ÆÛ´ö°Å¸®Áö¸¸ ³¯Áö ¸øÇÕ´Ï´Ù.");
	}

}

public class AnimalTest {
	public static void main(String[] args) {
		Dog dog = new Dog("¸Û¸ÛÀÌ");
		Duck duck = new Duck("²Ð²ÐÀÌ");

		dog.eat();
		crying(new Dog("¸Û¸ÛÀÌ"));

		duck.eat();
		crying(duck);	
		flying(duck);
		}
		// Animal a = new Dog("¸Û¸ÛÀÌ");
		private static void crying(Animal a){
		a.cry();
		}

		// Flyable f = new Duck("²Ð²ÐÀÌ");
		private static void flying(Flyable f){
		f.fly();
		}
}
