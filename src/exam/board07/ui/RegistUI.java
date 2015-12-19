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

	// �Խñ� ��� ó��
	public void execute() {
		ContentVO content = new ContentVO();
		
		String title = inputStr("������ �Է��ϼ��� : ");
		content.setTitle(title);

		String writer = inputStr("�۾��̸� �Է��ϼ��� : ");
		content.setWriter(writer);

		// ��ȣ���� Ŭ�������� ���´�.
		content.setNo(BoardSequence.getNo());

		// �Խù� ��Ͻ��� �ð� ���� �߰�
		content.setRegDate(new Date());
		
		list.add(content);

		System.out.println("�Խñ��� ��ϵǾ����ϴ�.\n");
	}
}






