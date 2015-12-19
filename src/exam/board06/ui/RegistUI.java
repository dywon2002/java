package exam.board06.ui;

import java.util.Date;

import exam.board06.BoardSequence;
import exam.board06.BoardService;
import exam.board06.ContentVO;

public class RegistUI extends BaseUI implements IBoardUI {
	// 글 등록
	
	private ContentVO[] list;
	private BoardService service;
	
	public RegistUI() {}

	public RegistUI(BoardService service, ContentVO[] list) {
		this.list = list;
		this.service = service;
	}

	
	public void execute(){
		ContentVO content = new ContentVO();
		
		String title = inputStr("제목을 입력하세요 : ");
		content.setTitle(title);
		String writer = inputStr("글쓴이를 입력하세요 : ");
		content.setWriter(writer);
		
		
		content.setNo(BoardSequence.getNo()); // static은 클래스로 바로 접근
		// 게시물 등록시의 시간 정보 추가
		content.setRegDate(new Date()); // 아무것도 인자값이 없으면 현재 시간 추가 
		
		list[service.pos++] = content;
		System.out.println("게시글이 등록되었습니다");
		
	}
}
