package exam.board08;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import exam.board08.ui.DeleteUI;
import exam.board08.ui.ExitUI;
import exam.board08.ui.IBoardUI;
import exam.board08.ui.RegistUI;
import exam.board08.ui.SearchOneUI;
import exam.board08.ui.SearchUI;
import exam.board08.ui.UpdateUI;

public class BoardService {
	
	Scanner sc = new Scanner(System.in);
	// 데이터 저장 처리
	ArrayList<ContentVO> list = new ArrayList<>();
	
	// data/board.txt 파일의 내용을 읽어서 list 에 입력하는 기능
	private void loadingFile() {
		try (
				FileInputStream fis = new FileInputStream("data/board.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);
				)
		{
			// 현재 글번호 설정
			BoardSequence.setNo(ois.readInt());
			list = (ArrayList<ContentVO>)ois.readObject();
		}
		 catch (Exception e) {
		}
	}
	
	void execute() {
		
		// 파일 정보를 리스트에 로딩시키기
		loadingFile();
		
		while(true) {
			System.out.println("--------------------------------------------------");
			System.out.println("1. 전체게시물 조회   ");
			System.out.println("2. 글번호 조회   ");
			System.out.println("3. 글등록   ");
			System.out.println("4. 글수정   ");
			System.out.println("5. 글삭제   ");
			System.out.println("0. 종료 ");
			System.out.println("--------------------------------------------------");
			System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");

			IBoardUI ui = null;
			
			int i = sc.nextInt();
			switch(i) {
			case 1 :
				ui = new SearchUI(list);
				break;
			
			case 2 :
				ui = new SearchOneUI(list);
				break;
			
			case 3 :
				ui = new RegistUI(list);
				break;
			
			case 4 :
				ui = new UpdateUI(list);
				break;

			case 5 :
				ui = new DeleteUI(list);
				break;
				
			case 0 :
				// 리스트의 내용을 파일에 저장하기 위해 리스트 객체를 넘긴다.
				ui = new ExitUI(list);
			}
			ui.execute();
		}
	}
}






