package kr.co.mlec.day20;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WebServerTest02 {
public static void main(String[] args) {
	try {
		// Ÿ�� ���� ����
		// ���� �ð� ������ �����ϴ� ����
		System.out.println("Ÿ�� ������ �����մϴ�.");
		ServerSocket server = new ServerSocket(10001);
		
		// �ð� ����
		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		while (true) {
			// ������ Ŭ���̾�Ʈ ���� ��ü : client
			Socket client = server.accept();
			
			/*
			 * HTTP ��� �Ծ�
			 * -----------------
			 * ���۶��� : �������� ���� ����, ���� �ڵ�, ���� �޼���
			 * ��> HTTP/1.1 200 OK
			 * -----------------
			 * ���(������ ���� ����) : �̸� : ��, ������� ����ɶ� ������ �߰�
			 * ��>
			 * Content-Type:text/html;
			 * Content-Length:19
			 * -----------------
			 * �ٵ�(������ �޼���)
			 * ��>
			 * 2015-12-11 19:11:11
			 * -----------------
			 * 
			 */
			
			
			
			// ������ Ŭ���̾�Ʈ�� �ð� ������ ������(Ŭ���̾�Ʈ�� ���)
			OutputStream out = client.getOutputStream();
			String body = "<html>"
						  + "<head><title>�ð�����</title></head>"
						  + "<body><h1>"+sdf.format(new Date())
						  + "</h1></body>"
						  + "</html>";
						  
			String startLine = "HTTP/1.1 200 OK\r\n";
			String header = "Cache-Control: no-cache\r\n"
							+"Content-Type: text/html; charset=EUC-KR\r\n"
							+"Content-Length: "
							+body.getBytes().length+"\r\n\r\n"; // ����� �ؿ� �������� ���� �� �־���Ѵ�
			String sendMsg = startLine+header+body;
			out.write(sendMsg.getBytes());
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
