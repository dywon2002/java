package kr.co.mlec.day10;
/*
 * 
 */

import java.util.Random;


class Animal2 {
	
}

// 만약, 클래스 정의시 명시적으로 extends를 사용하지 않았다면
// 컴파일러가 extends java.lang.Object 를 추가한다
class Duck extends Animal2 {
	
}
	
class IceCream{
	String name;
	int price;
	@Override
	public String toString() {
		return "IceCream [name=" + name + ", price=" + price + "]";
	}
	
	// alt + shift + s, s
	/*public String toString(){
		return "IceCream[name="+name+", price = "+ price +"]";
	}
	*/
	
	
}

public class ObjectTest {

	public static void main(String[] args) {
		IceCream ice = new IceCream();
		ice.name = "빠삐코";
		ice.price = 1200;
		System.out.println(ice);
		
		Object obj = new Random(); // 형변환 , 업캐스팅
		int [] arr = {1,2,3};
		System.out.println(arr);
		obj = arr;
		obj = "aaa";
	
		Duck d = new Duck();
		Object obj2 = d;
		
		
		System.out.println(d.toString());
		
		// 객체변수 자체를 출력하게 되면 객체의 toString() 메서드가 자동호출됨
		System.out.println(d); // d.toString()
		
		Integer iObj = new Integer(100);
		System.out.println(iObj);
		
	}

}
