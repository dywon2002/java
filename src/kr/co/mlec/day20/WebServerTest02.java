package kr.co.mlec.day20;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WebServerTest02 {
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
			
			/*
			 * HTTP 통신 규약
			 * -----------------
			 * 시작라인 : 프로토콜 버전 정보, 응답 코드, 응답 메세지
			 * 예> HTTP/1.1 200 OK
			 * -----------------
			 * 헤더(여러개 선언 가능) : 이름 : 값, 헤더값이 종료될때 빈줄을 추가
			 * 예>
			 * Content-Type:text/html;
			 * Content-Length:19
			 * -----------------
			 * 바디(전달할 메세지)
			 * 예>
			 * 2015-12-11 19:11:11
			 * -----------------
			 * 
			 */
			
			
			
			// 접속한 클라이언트에 시간 정보를 보낸다(클라이언트로 출력)
			OutputStream out = client.getOutputStream();
			String body = "<html>"
						  + "<head><title>시간정보</title></head>"
						  + "<body><h1>"+sdf.format(new Date())
						  + "</h1></body>"
						  + "</html>";
						  
			String startLine = "HTTP/1.1 200 OK\r\n";
			String header = "Cache-Control: no-cache\r\n"
							+"Content-Type: text/html; charset=EUC-KR\r\n"
							+"Content-Length: "
							+body.getBytes().length+"\r\n\r\n"; // 헤더는 밑에 공백줄이 한줄 더 있어야한다
			String sendMsg = startLine+header+body;
			out.write(sendMsg.getBytes());
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
