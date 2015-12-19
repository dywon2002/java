package kr.co.mlec.day12;

public class LottoDupNumberException extends Exception{
	public LottoDupNumberException(){
		super("생성된 로또 번호가 중복되었습니다");
	}
	public LottoDupNumberException(int num){
		super("생성된 로또 번호("+num+")가 중복되었습니다");
	}
}
