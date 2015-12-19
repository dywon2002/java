package exam.board06.ui;

import exam.board06.ContentVO;
import java.util.Scanner;

public class UpdateUI extends BaseUI implements IBoardUI{

	private ContentVO[] list;
	private int pos;
	
	
	public UpdateUI() {
	}

	public UpdateUI(ContentVO[] list, int pos) {
		this.list = list;
		this.pos = pos;
	}



	// �Խñ� ���� ó��
	public void execute(){
		int no = inputInt("������ �۹�ȣ�� �Է��ϼ��� : ");
		String title = inputStr("������ ������ �Է��ϼ��� : ");
		
		boolean flag = false;
		for(int i=0;i<pos;i++){
			ContentVO content=list[i];
			if(no==content.getNo()){
				content.setTitle(title);
				flag = true; // ������ �ߴ��� ���ߴ��� �˻�
				break;
				}
			}
		if (flag == false){
			System.out.println("�Խñ��� �������� �ʽ��ϴ�");
		}
		else {
			System.out.println("�Խñ��� �����Ǿ����ϴ�");
		}
	}
}
