/*
 * IP 연관 클래스
 * 
 * InetAddress
 */

package kr.co.mlec.day19;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Exam01 {

	public static void main(String[] args) {
		// 현재 사용하는 컴퓨터의 주소 정보 열기
		try {
			// 특정 도메인주소를 통해서 주소 정보를 얻기
//			InetAddress addr = InetAddress.getByName("www.naver.com");
//			System.out.println(addr);
			
			InetAddress [] addrs = InetAddress.getAllByName("www.daum.net");
			for(InetAddress addr : addrs){
				System.out.println(addr);
			}
				
			
			/*
			InetAddress local = 
					InetAddress.getLocalHost();
			System.out.println(local); // local.toString() 객체를 그냥 호출하면 toString
			System.out.println(local.getHostAddress());
			*/
		} catch (UnknownHostException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		} // 자기를 나타내는 로컬호스트
	}
}
