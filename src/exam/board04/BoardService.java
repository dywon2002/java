package exam.board04;

import java.util.Scanner;

public class BoardService {
	Scanner sc = new Scanner(System.in);
	
	ContentVO [] list = new ContentVO[10]; // 컨텐트VO의 배열을 만들어준다
	int pos = 0; // 배열 contentVO의 인덱스 초기값
	
	int i,x = 0;
	String s = null;
		
	// 전체 게시글 조회
	void searchAll(){
		System.out.println("전체 : "+pos+"개");
		System.out.println("------------------------");
		System.out.println("제목\t글쓴이");
		System.out.println("------------------------");
		// 최신 등록된 글부터 출력
		for(int i=pos-1;i>=0;i--){
			System.out.println(list[i]);
		}
		// 만약 게시글이 하나도 등록되어 있지 않다면...
		if(pos == 0){
			System.out.println("게시글이 존재하지 않습니다");
		}
		System.out.println("------------------------");
			
		
	}
	
	// 게시글에 대한 상세 조회 : 글쓴이 조회
	void searchOne(){
		System.out.print("조회할 글쓴이를 입력하세요: ");
		String name = sc.next();
		sc.nextLine();
		System.out.println(name+"님이 쓴글");
		System.out.println("------------------------");
		int cnt=0;
		for(int i=0;i<pos;i++){
			
			ContentVO content=list[i];
			if(name.equals(content.getWriter())){
			System.out.println(content.getTitle()+"\t"+content.getWriter());
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
	
	// 글 등록
	void regist(){
		ContentVO content = new ContentVO();
		
		System.out.print("제목을 입력하세요: ");
		content.setTitle(sc.next());
		System.out.print("글쓴이를 입력하세요: ");
		content.setWriter(sc.next());
		
		content.setNo(BoardSequence.getNo()); // static은 클래스로 바로 접근
		
		list[pos++] = content;
		System.out.println("게시글이 등록되었습니다");
		
	}
	
	// 게시글 수정 처리
	void update(){
		System.out.print("수정할 글번호를 입력하세요: ");
		int no = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("변경할 제목을 입력하세요: ");
		String title = sc.nextLine();
		
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
	
	// 게시글 삭제 처리
	void delete(){
		System.out.print("삭제할 글의 번호를 입력하세요 : ");
		int no = sc.nextInt();
		sc.nextLine();
		
//		for(int i = 0; i<pos;i++){
//		
//			int numMoved = pos - i - 1;
//			if(numMoved > 0){
//				System.arraycopy(list,i+1,list,i,numMoved);
//			}
//			list[--pos]=null;
//			break;
//			}
//		}
//		
		for(int i=0;i<pos;i++){
			
			ContentVO content=list[i];
			if(no==content.getNo()){
				for(;i<pos-1;i++){
					list[i]=list[i+1];
				}
				list[i+1]=null;
				pos--;
				System.out.println("게시글이 삭제 되었습니다");
				break;
				}
			}
		
		}
	

	
	// 종료 처리
	void exit(){
		System.out.println("게시판 프로그램을 종료합니다");
		System.exit(0);
	}
	
	// 실행 메소드
	void execute(){	// 메소드는 최소한의 기능만 표현하는 것이 좋다
		while(true){
			System.out.println("------------------------");
			System.out.println("1. 전체 게시물 조회");
			System.out.println("2. 글번호 조회");
			System.out.println("3. 글등록");
			System.out.println("4. 글수정");
			System.out.println("5. 글삭제");
			System.out.println("0. 종료");
			System.out.println("------------------------");
			System.out.print("메뉴 중 처리할 항목을 입력하세요 : ");
			i = sc.nextInt();
			if(i==1){
				searchAll();
			}
			else if(i==2){
				searchOne();
			}
			else if(i==3){
				regist();
			}
			else if(i==4){
				update();
			}
			else if(i==5){
				delete();
			}
			else if(i==0){
				exit();
			}
		}	
	}
}
