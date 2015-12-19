package exam.board05.ui;

import exam.board05.BoardSequence;
import exam.board05.BoardService;
import exam.board05.ContentVO;
import java.util.Scanner;

public class RegistUI extends BaseUI implements IBoardUI {
	// �� ���
	
	private ContentVO[] list;
	private BoardService service;
	
	public RegistUI() {}

	public RegistUI(BoardService service, ContentVO[] list) {
		this.list = list;
		this.service = service;
	}

	
	public void execute(){
		ContentVO content = new ContentVO();
		
		String title = inputStr("������ �Է��ϼ��� : ");
		content.setTitle(title);
		String writer = inputStr("�۾��̸� �Է��ϼ��� : ");
		content.setTitle(writer);
		
		
		content.setNo(BoardSequence.getNo()); // static�� Ŭ������ �ٷ� ����
		
		list[service.pos++] = content;
		System.out.println("�Խñ��� ��ϵǾ����ϴ�");
		
	}
}
