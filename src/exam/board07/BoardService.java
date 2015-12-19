package exam.board07;

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import exam.board07.ui.DeleteUI;
import exam.board07.ui.ExitUI;
import exam.board07.ui.IBoardUI;
import exam.board07.ui.RegistUI;
import exam.board07.ui.SearchOneUI;
import exam.board07.ui.SearchUI;
import exam.board07.ui.UpdateUI;

public class BoardService {
	
	Scanner sc = new Scanner(System.in);
	// 데이터 저장 처리
	ArrayList<ContentVO> list = new ArrayList<>();
	
	// data/board.txt 파일의 내용을 읽어서 list 에 입력하는 기능
	private void loadingFile() {
		try {
			Scanner sc = new Scanner(new File("data/board.txt"));
			if(sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
				BoardSequence.setNo(parseInt(line));
			}
			
			while (sc.hasNextLine()) {
				// 1:1:1:2015-12-04-16-43-20
				String line = sc.nextLine();
				// bInfo[0] -> 1(no)
				// bInfo[1] -> 1(writer)
				// bInfo[2] -> 1(title)
				// bInfo[3] -> 2015-12-04-16-43-20
				String[] bInfo = line.split(":");
				
				ContentVO vo = new ContentVO();
				vo.setNo(parseInt(bInfo[0]));
				vo.setWriter(bInfo[1]);
				vo.setTitle (bInfo[2]);
				
				String[] dInfo = bInfo[3].split("-");
				
				Calendar c = Calendar.getInstance();
				c.set(  parseInt(dInfo[0]), 
						parseInt(dInfo[1])-1, 
						parseInt(dInfo[2]), 
						parseInt(dInfo[3]), 
						parseInt(dInfo[4]), 
						parseInt(dInfo[5]));
				// Calendar 객체를 Date 객체로 변환
				vo.setRegDate(c.getTime());
				list.add(vo);
			}
		} catch (Exception e) {
			System.out.println("파일 로딩중 에러발생");
		}
	}
	
	private int parseInt(String data) {
		return Integer.parseInt(data);
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






