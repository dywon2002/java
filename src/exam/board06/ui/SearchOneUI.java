// �Խñ� �ϳ��� ������ �����ִ� Ŭ����


package exam.board06.ui;

import exam.board06.ContentVO;
import java.util.Scanner;

public class SearchOneUI extends BaseUI implements IBoardUI {
	
	private int pos;
	private ContentVO[] list;
	
	public SearchOneUI() {}
	
	public SearchOneUI( int pos, ContentVO[] list) {
		this.pos = pos;
		this.list = list;
	}


	// �Խñۿ� ���� �� ��ȸ : �۾��� ��ȸ
	public void execute(){
		// BaseUI�� �����Ǵ� �޼��带 Ȱ��
		String name = inputStr("��ȸ�� �۾��̸� �Է��ϼ���: ");
		
		System.out.println(name+"���� ����");
		System.out.println("------------------------");
		
		int cnt=0;
		for(int i=0;i<pos;i++){
			
			ContentVO content=list[i];
			if(name.equals(content.getWriter())){
			System.out.println(content.getTitle()+"\t"+content.getWriter()+"\t"+content.getRegDate());
			cnt++;
			}
		}
		if(cnt==0){
		System.out.println(name+"���� �� �Խñ��� �����ϴ�");
	}
		System.out.println("------------------------");
	}

	/*
	 * hong �� ����
	 * ------------
	 * ���� �۾���
	 * ------------
	 * test hong
	 * test2 hong
	 * ------------
	 */
}
