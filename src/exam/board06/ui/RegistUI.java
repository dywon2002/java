package exam.board06.ui;

import java.util.Date;

import exam.board06.BoardSequence;
import exam.board06.BoardService;
import exam.board06.ContentVO;

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
		content.setWriter(writer);
		
		
		content.setNo(BoardSequence.getNo()); // static�� Ŭ������ �ٷ� ����
		// �Խù� ��Ͻ��� �ð� ���� �߰�
		content.setRegDate(new Date()); // �ƹ��͵� ���ڰ��� ������ ���� �ð� �߰� 
		
		list[service.pos++] = content;
		System.out.println("�Խñ��� ��ϵǾ����ϴ�");
		
	}
}
