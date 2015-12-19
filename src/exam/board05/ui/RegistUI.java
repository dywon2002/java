package exam.board05.ui;

import exam.board05.BoardSequence;
import exam.board05.BoardService;
import exam.board05.ContentVO;
import java.util.Scanner;

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
		content.setTitle(writer);
		
		
		content.setNo(BoardSequence.getNo()); // static은 클래스로 바로 접근
		
		list[service.pos++] = content;
		System.out.println("게시글이 등록되었습니다");
		
	}
}
