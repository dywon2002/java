package kr.co.mlec.day10.testb;

/*public*/
public class StringUtil {
	public String data;
	protected String exStr = "상속된 클래스는 볼 수 있다";
	String name; // 디폴트는 외부 패키지는 상속이라도 무조건 볼 수 없다
	private String magicNumber = "a1"; // private 선언된 변수는 클래스 내에서만 사용가능
}
