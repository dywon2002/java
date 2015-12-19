package kr.co.mlec.day08;

public class StringTest01 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		String s = "a";
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) { // 객체를 자꾸 만들고 가비지컬렉터 때문에 안 쓰는 객체를
											// 자꾸 삭제하므로 시간이 오래 걸린다
			s += i;
		}
		long end = System.currentTimeMillis();
		double time = (end - start) / 1000d; // 뒤에 더블형을 붙여줘서 정확한 값을 얻는다
		System.out.println("String 연산 결과 : " + time);

		start = System.currentTimeMillis(); // 문자열을 많이 쓸 경우에는 StringBuffer
		StringBuffer sb = new StringBuffer("a");
		for (int i = 0; i < 100000; i++) {
			sb.append(i);
		}
		end = System.currentTimeMillis();
		time = (end - start) / 1000d; // 뒤에 더블형을 붙여줘서 정확한 값을 얻는다
		System.out.println("StringBuffer 연산 결과 : " + time);

	}

}
