package kr.co.mlec.day20;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

class EchoThread extends Thread {
	private Socket s;

	EchoThread(Socket s) {
		this.s = s;
	}

	public void run() {

		try {

			InputStream in = s.getInputStream();
			DataInputStream dis = new DataInputStream(in);

			OutputStream out = s.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);

			// 접속한 클라이언트 연결 객체 : client
			while (true) {

				// 3. 클라이언트 보내온 메세지를 읽는다
				String s = dis.readUTF();

				if (s.equals("quit"))
					break;

				// 4. 읽은 데이터를 클라이언트로 전송
				dos.writeUTF(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

public class ThreadServerTest03 {

	public static void main(String[] args) {
		try {
			// 타임 서버 생성
			// 현재 시간 정보를 제공하는 서비스
			System.out.println("에코 서버를 구동합니다.");

			ServerSocket server = new ServerSocket(10001);
			while (true) {
				Socket s = server.accept();
				EchoThread et = new EchoThread(s);
				et.start();
			}
		} catch (Exception e) {
		}
	}

}
