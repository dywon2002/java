package exam.board05.ui;

import java.util.Scanner;

import exam.board05.BoardService;
import exam.board05.ContentVO;

public class DeleteUI extends BaseUI implements IBoardUI{
	
	private ContentVO[] list;
	private BoardService service;
	
	public DeleteUI() {
	}

	public DeleteUI(
			ContentVO[] list, BoardService service) {
		this.list = list;
		this.service = service;
	}

	
	
	// 게시글 삭제 처리
		public void execute(){
			
		int no = inputInt("삭제할 글의 번호를 입력하세요 : ");
			
//			for(int i = 0; i<pos;i++){
//			
//				int numMoved = pos - i - 1;
//				if(numMoved > 0){
//					System.arraycopy(list,i+1,list,i,numMoved);
//				}
//				list[--pos]=null;
//				break;
//				}
//			}
//			
			for(int i=0;i<service.pos;i++){
				
				ContentVO content=list[i];
				if(no==content.getNo()){
					for(;i<service.pos-1;i++){
						list[i]=list[i+1];
					}
					list[i+1]=null;
					service.pos--;
					System.out.println("게시글이 삭제 되었습니다");
					break;
					}
				}
			}
}
