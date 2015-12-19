package exam.board08.ui;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import exam.board08.BoardSequence;
import exam.board08.ContentVO;

public class ExitUI implements IBoardUI {
	private ArrayList<ContentVO> list;
	public ExitUI(ArrayList<ContentVO> list) {
		this.list = list;
	}
	
	@Override
	public void execute() {
		// list 에 들어가 있는 ContentVO 객체의 내용을 파일에 저장함

		try (
			// data/board.txt 파일에 내용을 저장
			FileOutputStream fos = new FileOutputStream("data/board.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		) {
			// 글번호 저장
			oos.writeInt(BoardSequence.getCurrentNo());
			oos.writeObject(list);
			
		} catch (Exception e) {
			System.out.println("파일 저장시 오류 발생");
			e.printStackTrace();
		}
		// 게시판 프로그램 종료
		System.out.println("게시판 프로그램을 종료합니다.\n");
		System.exit(0);
	}
}



















