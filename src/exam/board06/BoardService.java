package exam.board06;

import java.util.Scanner;

import exam.board06.ui.DeleteUI;
import exam.board06.ui.ExitUI;
import exam.board06.ui.IBoardUI;
import exam.board06.ui.RegistUI;
import exam.board06.ui.SearchOneUI;
import exam.board06.ui.SearchUI;
import exam.board06.ui.UpdateUI;

public class BoardService {
	Scanner sc = new Scanner(System.in);
	
	ContentVO [] list = new ContentVO[10]; // 컨텐트VO의 배열을 만들어준다
	
	public int pos = 0; // 배열 contentVO의 인덱스 초기값
	
	int i,x = 0;
	

	// 실행 메소드
	void execute(){	// 메소드는 최소한의 기능만 표현하는 것이 좋다
		while(true){
			System.out.println("------------------------");
			System.out.println("1. 전체 게시물 조회");
			System.out.println("2. 글번호 조회");
			System.out.println("3. 글등록");
			System.out.println("4. 글수정");
			System.out.println("5. 글삭제");
			System.out.println("0. 종료");
			System.out.println("------------------------");
			System.out.print("메뉴 중 처리할 항목을 입력하세요 : ");
			i = sc.nextInt();
			IBoardUI ui = null;
			
			if(i==1){
				ui = new SearchUI(pos,list);
			}
			else if(i==2){
				ui = new SearchOneUI(pos, list);
			}
			else if(i==3){
				ui = new RegistUI(this, list);
			}
			else if(i==4){
				ui = new UpdateUI(list, pos);
			}
			else if(i==5){
				ui = new DeleteUI(list,this);
			}
			else if(i==0){
				ui = new ExitUI();
			}
			ui.execute();
		}	
	}
}
