// http://localhost:10001/login?id=aaa&pass=1234
package kr.co.mlec.day20;

import java.net.ServerSocket;
import java.net.Socket;

public class WebServerTest04 {
	public static void main(String[] args) {
		try{
			System.out.println("웹 서버 구동합니다");
			
			ServerSocket server = new ServerSocket(10001);
			while(true){
				Socket client = server.accept();
				LoginThread lt = new LoginThread(client);
				lt.start();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
