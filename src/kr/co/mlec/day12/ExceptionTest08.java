package kr.co.mlec.day12;

public class ExceptionTest08 {

	public static void main(String[] args) {
		MyList mList = new MyList(2);
		mList.add("하나");
		mList.add("둘");
		
		String data = mList.get(2);
		System.out.println("1번째 인덱스 값 : "+data);
		
//		mList.add("셋");
	}
}
