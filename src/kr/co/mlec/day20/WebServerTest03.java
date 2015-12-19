/*
 * 사용자 요청에 따른 작업 분할
 * 
 */

package kr.co.mlec.day20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class HttpThread extends Thread{
	Socket client;
	HttpThread(Socket client){
		this.client = client;
	}
	public void run(){
		try{
			// 접속을 요청한 웹브라우저에서 보내온 정보를 읽는 객체
						/*
						 * http 프로토콜 방식
						 * 
						 * 첫줄을 읽으면 시작라인의 내용을 읽을 수 있다
						 * 요청 시작라인 구성요소 : 요청방식 요청 URI
						 * 예> GET / image
						 */
						InputStream in = client.getInputStream();
						Scanner sc = new Scanner(in);
						String reqStartLine = sc.nextLine();
						System.out.println(reqStartLine);
						
						String fileName = "";
						
						// 브라우저에게 보낼 문서의 종류를 알려준다
						String contentType = "";
						
						// 1번째 요소가 uri 스트링 타입으로 저장된다
						String uri = reqStartLine.split(" ")[1]; // 공백으로 split 하면 배열을 넘겨준다
						if(uri.equalsIgnoreCase("/image")){
							fileName="data/Koala.jpg";
							contentType = "image/jpg";
						}else if(uri.equalsIgnoreCase("/audio")){
							fileName = "data/test.mp3";
							contentType = "audio/mp3";
						}
						
						File f = new File(fileName);

						String startLine = "HTTP/1.1 200 OK\r\n";
						String header = "Cache-Control: no-cache\r\n"
								+"Content-Type: " + contentType + "; charset=EUC-KR\r\n"
								+"Content-Length: "
								+f.length()+"\r\n\r\n"; // 헤더는 밑에 공백줄이 한줄 더 있어야한다
						
						String sendData = startLine+header;
						
						OutputStream out = client.getOutputStream();
						BufferedOutputStream bos = new BufferedOutputStream(out);
						bos.write(sendData.getBytes());
						
						FileInputStream fis = new FileInputStream(f);
						BufferedInputStream bis = new BufferedInputStream(fis);
						
						while(true){
							int ch=bis.read();
							if(ch==-1)break;
							bos.write(ch);
						}
						
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}



public class WebServerTest03 {
public static void main(String[] args) {
	try {
		ServerSocket server = new ServerSocket(10001);
		
		while (true) {
			// 접속한 클라이언트 연결 객체 : client
			Socket client = server.accept();
			
			HttpThread t = new HttpThread(client);
			t.start();
			
			/*
			// 접속한 클라이언트에 시간 정보를 보낸다(클라이언트로 출력)
			OutputStream out = client.getOutputStream();
			String body = "<html>"
						  + "<head><title>시간정보</title></head>"
						  + "<body><h1>"+sdf.format(new Date())
						  + "</h1></body>"
						  + "</html>";
						  
			String sendMsg = startLine+header+body;
			out.write(sendMsg.getBytes());*/
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
