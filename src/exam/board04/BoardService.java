package exam.board04;

import java.util.Scanner;

public class BoardService {
	Scanner sc = new Scanner(System.in);
	
	ContentVO [] list = new ContentVO[10]; // ����ƮVO�� �迭�� ������ش�
	int pos = 0; // �迭 contentVO�� �ε��� �ʱⰪ
	
	int i,x = 0;
	String s = null;
		
	// ��ü �Խñ� ��ȸ
	void searchAll(){
		System.out.println("��ü : "+pos+"��");
		System.out.println("------------------------");
		System.out.println("����\t�۾���");
		System.out.println("------------------------");
		// �ֽ� ��ϵ� �ۺ��� ���
		for(int i=pos-1;i>=0;i--){
			System.out.println(list[i]);
		}
		// ���� �Խñ��� �ϳ��� ��ϵǾ� ���� �ʴٸ�...
		if(pos == 0){
			System.out.println("�Խñ��� �������� �ʽ��ϴ�");
		}
		System.out.println("------------------------");
			
		
	}
	
	// �Խñۿ� ���� �� ��ȸ : �۾��� ��ȸ
	void searchOne(){
		System.out.print("��ȸ�� �۾��̸� �Է��ϼ���: ");
		String name = sc.next();
		sc.nextLine();
		System.out.println(name+"���� ����");
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
	
	// �� ���
	void regist(){
		ContentVO content = new ContentVO();
		
		System.out.print("������ �Է��ϼ���: ");
		content.setTitle(sc.next());
		System.out.print("�۾��̸� �Է��ϼ���: ");
		content.setWriter(sc.next());
		
		content.setNo(BoardSequence.getNo()); // static�� Ŭ������ �ٷ� ����
		
		list[pos++] = content;
		System.out.println("�Խñ��� ��ϵǾ����ϴ�");
		
	}
	
	// �Խñ� ���� ó��
	void update(){
		System.out.print("������ �۹�ȣ�� �Է��ϼ���: ");
		int no = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("������ ������ �Է��ϼ���: ");
		String title = sc.nextLine();
		
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
	
	// �Խñ� ���� ó��
	void delete(){
		System.out.print("������ ���� ��ȣ�� �Է��ϼ��� : ");
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
				System.out.println("�Խñ��� ���� �Ǿ����ϴ�");
				break;
				}
			}
		
		}
	

	
	// ���� ó��
	void exit(){
		System.out.println("�Խ��� ���α׷��� �����մϴ�");
		System.exit(0);
	}
	
	// ���� �޼ҵ�
	void execute(){	// �޼ҵ�� �ּ����� ��ɸ� ǥ���ϴ� ���� ����
		while(true){
			System.out.println("------------------------");
			System.out.println("1. ��ü �Խù� ��ȸ");
			System.out.println("2. �۹�ȣ ��ȸ");
			System.out.println("3. �۵��");
			System.out.println("4. �ۼ���");
			System.out.println("5. �ۻ���");
			System.out.println("0. ����");
			System.out.println("------------------------");
			System.out.print("�޴� �� ó���� �׸��� �Է��ϼ��� : ");
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
