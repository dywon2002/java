package kr.co.mlec.day12;

public class LottoUI {
	
	private LottoService service;
	
	public LottoUI(){
		service = new LottoService();
	}
	
	public void execute(){
		System.out.println("로또 서비스를 시작합니다");
		System.out.println("번호를 뽑습니다");

		// 랜덤한 숫자 6개를 배열에 담아서 넘겨준다
		int [] numbers = service.getNumbers();
		// 생성된 숫자를 유효한지 체크하는 기능 호출
		boolean flag = false;
		try {
			flag = service.checkNumbers(numbers);
			if(flag){
				for(int num : numbers){
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO 자동 생성된 catch 블록
						e.printStackTrace();
					}
					System.out.println(num);
				}
			}
		} catch (LottoZeroNumberException | LottoDupNumberException e1) {
			// TODO 자동 생성된 catch 블록
			e1.printStackTrace();
		}
		
	}
}
