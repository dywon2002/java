//360번 버스 운행시작.
//승객 3명 승차.
//승객 1명 하차.
//승객 1명 승차.
//승객 2명 하차.
//승객 5명 승차.
//승객 3명 하차.
//360번 버스의 현재 승차인원: 3명.
//모든 버스의 누적 승차인원: 9명.
//740번 버스 운행시작.
//승객 2명 승차.
//승객 1명 하차.
//승객 3명 승차.
//승객 2명 하차.
//승객 2명 승차.
//승객 3명 하차.
//740번 버스의 현재 승차인원: 1명.
//모든 버스의 누적 승차인원: 16명.

package kr.co.mlec.day09.exam;

class Bus{
	int busNo;
	int count;
	static int accumulateCount;
	
	Bus(){}
	Bus(int busNo){
		this.busNo = busNo;
		System.out.println(busNo+"번 버스 운행시작.");
	}
	void ride(){
		ride(1);
//		this.count=count++;
//		System.out.println("승객 1명 승차");
	}
	void ride(int count){
		this.count+=count;
		System.out.println("승객 "+count+"명 승차");
		Bus.accumulateCount+=count;
	}
	void leave(int count){
		this.count-=count;
		System.out.println("승객 "+count+"명 하차");
	}
	void leave(){
		leave(1);
	}
	void info(){
		System.out.println(busNo+"번 버스의 현재 승차인원 : "+count+"명");
		System.out.println("모든 버스의 누적 승차인원 : "+Bus.accumulateCount+"명");
	}
}

public class BusTest {

	public static void main(String[] args) {
		Bus no360 = new Bus(360);
		no360.ride(3);
		no360.leave();
		no360.ride();
		no360.leave(2);
		no360.ride(5);
		no360.leave(3);
		no360.info();

		Bus no740 = new Bus(740);
		no740.ride(2);
		no740.leave(1);
		no740.ride(3);
		no740.leave(2);
		no740.ride(2);
		no740.leave(3);
		no740.info();
	}

}

