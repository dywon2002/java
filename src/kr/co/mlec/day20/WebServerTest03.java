/*
 * ����� ��û�� ���� �۾� ����
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
			// ������ ��û�� ������������ ������ ������ �д� ��ü
						/*
						 * http �������� ���
						 * 
						 * ù���� ������ ���۶����� ������ ���� �� �ִ�
						 * ��û ���۶��� ������� : ��û��� ��û URI
						 * ��> GET / image
						 */
						InputStream in = client.getInputStream();
						Scanner sc = new Scanner(in);
						String reqStartLine = sc.nextLine();
						System.out.println(reqStartLine);
						
						String fileName = "";
						
						// ���������� ���� ������ ������ �˷��ش�
						String contentType = "";
						
						// 1��° ��Ұ� uri ��Ʈ�� Ÿ������ ����ȴ�
						String uri = reqStartLine.split(" ")[1]; // �������� split �ϸ� �迭�� �Ѱ��ش�
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
								+f.length()+"\r\n\r\n"; // ����� �ؿ� �������� ���� �� �־���Ѵ�
						
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
			// ������ Ŭ���̾�Ʈ ���� ��ü : client
			Socket client = server.accept();
			
			HttpThread t = new HttpThread(client);
			t.start();
			
			/*
			// ������ Ŭ���̾�Ʈ�� �ð� ������ ������(Ŭ���̾�Ʈ�� ���)
			OutputStream out = client.getOutputStream();
			String body = "<html>"
						  + "<head><title>�ð�����</title></head>"
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
