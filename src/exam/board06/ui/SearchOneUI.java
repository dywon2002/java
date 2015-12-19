// 게시글 하나의 정보를 보여주는 클래스


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


	// 게시글에 대한 상세 조회 : 글쓴이 조회
	public void execute(){
		// BaseUI에 제공되는 메서드를 활용
		String name = inputStr("조회할 글쓴이를 입력하세요: ");
		
		System.out.println(name+"님이 쓴글");
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
		System.out.println(name+"님이 쓴 게시글이 없습니다");
	}
		System.out.println("------------------------");
	}

	/*
	 * hong 이 쓴글
	 * ------------
	 * 제목 글쓴이
	 * ------------
	 * test hong
	 * test2 hong
	 * ------------
	 */
}
