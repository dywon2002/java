package exam.board01;

import java.util.Scanner;

public class BoardTest {

	public static void main(String[] args) {	// main�� ���ุ �Ѵ�
		// TODO �ڵ� ������ �޼ҵ� ����
		
		Scanner sc = new Scanner(System.in);
		
		int i,x = 0;
		String s = null;
		
		while(true){
			System.out.println("--------------------");
			System.out.println("1. ��ü �Խù� ��ȸ");
			System.out.println("2. �۹�ȣ ��ȸ");
			System.out.println("3. �۵��");
			System.out.println("4. �ۼ���");
			System.out.println("5. �ۻ���");
			System.out.println("0. ����");
			System.out.println("--------------------");
			System.out.println("�޴� �� ó���� �׸��� �Է��ϼ���");
			i = sc.nextInt();
			if(i==1){
				System.out.println("��ü �Խñ� ��ȸ �޴� ������");
			}
			else if(i==2){
				System.out.print("��ȸ�� �� ��ȣ�� �Է��ϼ���: ");
				x = sc.nextInt();
			}
			else if(i==3){
				System.out.print("������ �Է��ϼ���: ");
				s = sc.next();
				System.out.print("�۾��̸� �Է��ϼ���: ");
				s = sc.next();
				System.out.println("�۵�� �޴� ������");
			}
			else if(i==4){
				System.out.print("������ �۹�ȣ�� �Է��ϼ���: ");
				x = sc.nextInt();
				System.out.print("������ ������ �Է��ϼ���: ");
				s = sc.next();
			}
			else if(i==5){
				System.out.print("������ �۹�ȣ�� �Է��ϼ���: ");
				x = sc.nextInt();
				System.out.print("�ۻ��� �޴� ������");
			}
			else if(i==0){
				System.out.println("�Խ��� ���α׷��� �����մϴ�");
				break;
			}
		}	

	}
}