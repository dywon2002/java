package kr.co.mlec.day20;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ServerTest02 {

	public static void main(String[] args) {
		try {
			// 타임 서버 생성
			// 현재 시간 정보를 제공하는 서비스
			System.out.println("타임 서버를 구동합니다.");
			ServerSocket server = new ServerSocket(10001);
			
			// 시간 정보
			String pattern = "yyyy-MM-dd HH:mm:ss";
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			
			while (true) {
				// 접속한 클라이언트 연결 객체 : client
				Socket client = server.accept();
				
				// 접속한 클라이언트에 시간 정보를 보낸다(클라이언트로 출력)
				OutputStream out = client.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				dos.writeUTF(sdf.format(new Date()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
