package exam.lotto;

import java.util.Arrays;

public class LottoUI {
	
	LottoService service;
	
	public LottoUI(){
		service = new LottoService();
	}
	
	public void start(){
		System.out.println("로또 번호를 추출합니다");
		int[] numbers = service.getLottoNumbers();
		// 배열에 있는것을 확인만 하려면 Arrays.toString이 가장 편리하다
		System.out.println("생성된 로또번호 : "+Arrays.toString(numbers));
	}
	
}
