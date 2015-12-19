/*
 * 동기화 : 
 * - 키워드 : synchronized
 * 
 */

package kr.co.mlec.day18;

class Sync{
	void a(){
		for(int i=1;i<=30;i++){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("a ");
		}
	}
	
	synchronized void b(){
		for(int i=1;i<=30;i++){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("b ");
		}
	}
}

class SyncThread extends Thread {
	private Sync s;
	private int cType;
	SyncThread(Sync s, int cType){
		this.s = s;
		this.cType = cType;
	}
	
	public void run(){
		switch(cType){
		case 1:
			s.a();
			break;
		case 2:
			s.b();
			break;
		}
	}
	
}

public class ThreadTest06 {

	public static void main(String[] args) {
		Sync s = new Sync(); // 열쇠가 하나 있다
		
		SyncThread st1 = new SyncThread(s,1);
		SyncThread st2 = new SyncThread(s,2);
		
		st1.start();
		st2.start();
	}
	
}
