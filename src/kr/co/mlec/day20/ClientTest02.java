/*
 *  TCP 클라이언트 관련 클래스
 *  Socket : 서버 접속시 사용
 *   - 메서드
 *     · InputStream getInputStream()
 *     · OutputStream getOutputStream()
 */
package kr.co.mlec.day20;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;
import java.util.Date;

public class ClientTest02 {

	public static void main(String[] args) {
		try{
		// 실행중인 서버에 접속
		// localhost, 127.0.0.1, 192.168.0.9
			System.out.println("서버에 접속을 시도합니다");
			Socket s = new Socket("localhost",10001);
			System.out.println("접속 성공!!! ^^");
			
			InputStream in = s.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			String time = dis.readUTF();
			System.out.println("시간 : "+time);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
