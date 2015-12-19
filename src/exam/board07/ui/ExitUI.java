package exam.board07.ui;

import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import exam.board07.BoardSequence;
import exam.board07.ContentVO;

public class ExitUI implements IBoardUI {
	private ArrayList<ContentVO> list;
	public ExitUI(ArrayList<ContentVO> list) {
		this.list = list;
	}
	
	@Override
	public void execute() {
		// list 에 들어가 있는 ContentVO 객체의 내용을 파일에 저장함
//		private String title;
//		private String writer;
//		private int no;
//		private Date regDate;
		try (
			// data/board.txt 파일에 내용을 저장
			FileWriter fw = new FileWriter("data/board.txt");
		) {
			// 글번호 저장
			fw.write(BoardSequence.getCurrentNo() + "\n");
			
			// 파일에 저장하는 포멧
			// no:writer:title:regDate
			SimpleDateFormat sdf = 
					new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
			for (ContentVO vo : list) {
				String data = vo.getNo() + ":" + vo.getWriter() + ":" + 
						      vo.getTitle() + ":" + sdf.format(vo.getRegDate());
				fw.write(data + "\n");
			}
		} catch (Exception e) {
			System.out.println("파일 저장시 오류 발생");
			e.printStackTrace();
		}
		// 게시판 프로그램 종료
		System.out.println("게시판 프로그램을 종료합니다.\n");
		System.exit(0);
	}
}



















