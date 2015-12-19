/*
 * 로또 번호가 0번일 경우 발생한다
 */

package kr.co.mlec.day12;

public class LottoZeroNumberException extends Exception{
	public LottoZeroNumberException(){
		super("로또번호는 0이 될수 없습니다");
	}
}
