package kr.co.mlec.day09.exam;

public class TV {
	int channel;
	int vol;
	
	TV(){}
	
	TV(int channel, int vol){
		this.channel = channel;
		this.vol = vol;
	}
	int getVolume(){
		return vol;
	}
	int getChannel(){
		return channel;
	}
	void setChannel(int newChannel){
		this.channel = newChannel;
	}
	void channelUp(){
		this.channel++;
	}
	void powerOn(){
		System.out.println("티비 전원을 켭니다.");
	}
	void powerOff(){
		System.out.println("티비 전원을 끕니다.");
	}
}
