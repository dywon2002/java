package exam.board06.ui;


public class ExitUI implements IBoardUI {
	
	// 종료 처리
	public void execute(){
		System.out.println("게시판 프로그램을 종료합니다");
		System.exit(0);
	}
	
}
