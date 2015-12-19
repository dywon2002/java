package exam.board07.ui;

import java.util.ArrayList;
import java.util.Date;

import exam.board07.BoardSequence;
import exam.board07.ContentVO;

public class RegistUI extends BaseUI implements IBoardUI {
	private ArrayList<ContentVO> list;
	
	public RegistUI() {}
	public RegistUI(ArrayList<ContentVO> list) {
		this.list = list;
	}

	// 게시글 등록 처리
	public void execute() {
		ContentVO content = new ContentVO();
		
		String title = inputStr("제목을 입력하세요 : ");
		content.setTitle(title);

		String writer = inputStr("글쓴이를 입력하세요 : ");
		content.setWriter(writer);

		// 번호관리 클래스에서 얻어온다.
		content.setNo(BoardSequence.getNo());

		// 게시물 등록시의 시간 정보 추가
		content.setRegDate(new Date());
		
		list.add(content);

		System.out.println("게시글이 등록되었습니다.\n");
	}
}






