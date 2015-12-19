package kr.co.mlec.day09.exam;
/*
	티비 전원을 켭니다.
	현재 TV 볼륨 : 9
	현재 TV 채널 : 11
	채널 36번으로 변경
	채널 증가
	현재 TV채널 : 37
	TV 시청 종료
	티비 전원을 끕니다.
 */
public class TVTest {

	public static void main(String[] args) {

		TV tv = new TV(11, 9);
		tv.powerOn();
		System.out.println("현재 TV 볼륨 : " + tv.getVolume());
		System.out.println("현재 TV 채널 : " + tv.getChannel());
		System.out.println("채널 36번으로 변경");
		tv.setChannel(36);
		System.out.println("채널 증가");
		tv.channelUp();
		System.out.println("현재 TV채널 : " + tv.getChannel());
		System.out.println("TV 시청 종료");
		tv.powerOff();
	}
}
