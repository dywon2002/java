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



	// 게시글 수정 처리
	public void execute(){
		int no = inputInt("수정할 글번호를 입력하세요 : ");
		String title = inputStr("변경할 제목을 입력하세요 : ");
		
		boolean flag = false;
		for(int i=0;i<pos;i++){
			ContentVO content=list[i];
			if(no==content.getNo()){
				content.setTitle(title);
				flag = true; // 수정을 했는지 안했는지 검사
				break;
				}
			}
		if (flag == false){
			System.out.println("게시글이 존재하지 않습니다");
		}
		else {
			System.out.println("게시글이 수정되었습니다");
		}
	}
}
