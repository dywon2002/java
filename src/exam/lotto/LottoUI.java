package exam.lotto;

import java.util.Arrays;

public class LottoUI {
	
	LottoService service;
	
	public LottoUI(){
		service = new LottoService();
	}
	
	public void start(){
		System.out.println("�ζ� ��ȣ�� �����մϴ�");
		int[] numbers = service.getLottoNumbers();
		// �迭�� �ִ°��� Ȯ�θ� �Ϸ��� Arrays.toString�� ���� ���ϴ�
		System.out.println("������ �ζǹ�ȣ : "+Arrays.toString(numbers));
	}
	
}
