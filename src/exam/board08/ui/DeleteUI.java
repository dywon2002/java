package exam.board08.ui;

import java.util.ArrayList;

import exam.board08.ContentVO;

public class DeleteUI extends BaseUI implements IBoardUI {
	private ArrayList<ContentVO> list;
	
	public DeleteUI() {}
	
	public DeleteUI(ArrayList<ContentVO> list) {
		this.list = list;
	}	
	
	// 게시글 삭제 처리
	public void execute() {
		int no = inputInt("삭제할 글의 번호를 입력하세요 : ");
		for (int i = 0; i < list.size(); i++) {
			ContentVO content = list.get(i);
			if (no == content.getNo()) {
				list.remove(i);
				break;
			}
		}
		System.out.println("게시글이 삭제되었습니다.\n");
	}
}





