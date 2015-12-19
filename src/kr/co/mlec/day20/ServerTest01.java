/*
 * TCP 소켓 이용
 * - ServerSocket : Server 역할 클래스
 * - 메서드
 * 	 · accept() : 클라이언트의 요청을 무한 대기
 * 
 */


package kr.co.mlec.day20;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest01 {
	public static void main(String[] args) {
		try {
		// 서버 생성 : 클라이언트가 접속할 때 10001 번 포트로 접속
		ServerSocket server = new ServerSocket(10001);
		
		System.out.println("서버 생성 후 클라이언트의 요청을 대기함");
		// 클라이언트의 요청을 무한 대기
		// 연결을 요청한 클라이언트 정보를 담고 있는 소켓 객체 반환
		while(true){
		Socket client = server.accept();
		System.out.println("client : " + client); // toString으로 객체값 출력
		}
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
		}
}
