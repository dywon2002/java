/*
 * 서버와 클라이언트가 데이터를 주고 받기
 * - 에코프로그램 작성하기
 */

package kr.co.mlec.day20;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientTest03 {
	public static void main(String[] args) {
		try {
			// 서버와 연결 시도
			Socket s = new Socket("192.168.0.16",10001); // 소켓을 만드는게 우선순위
			
			// 화면에서 입력
			Scanner sc = new Scanner(System.in);
			
			// 입력받은 메세지를 서버에 전송할 출력 객체
			OutputStream out = s.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			
			// 서버에서 재전송된 메세지를 읽을 입력 객체
			InputStream in = s.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			while(true){
				// 1. 화면에서 메세지를 입력 받는다
				System.out.print("메세지 : ");
				String msg = sc.nextLine();
				
				// 2. 입력한 메세지를 서버에 전송한다(출력 객체 활용)
				dos.writeUTF(msg);
				
				if(msg.equals("quit")) break;
				
				
				// 5. 서버에서 재전송된 메세지를 읽는다(입력 객체 활용)
				String echoMsg = dis.readUTF();
				System.out.println("에코메세지 : " + echoMsg);
			
			}
			
		} catch (Exception e) {
		} 
	}
}
