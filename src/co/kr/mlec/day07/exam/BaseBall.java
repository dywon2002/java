package co.kr.mlec.day07.exam;

import java.util.*;

public class BaseBall {
	public static void main(String[] args) {

		int Number[] = new int[3]; // 컴퓨터가 던지 볼
		int Fit[] = new int[3]; // 사용자가 맞추기위해서 던지는 볼
		int temp = 0; // 1-9이상의 값이 들어오면 쳐내기 위해서
		int counter = 0; // 몇번에 맞추는지 세기 위해서
		boolean loop = true;

		while (true) { // 컴퓨터가 랜덤으로 볼을 던진다.
			for (int i = 0; i < Number.length; i++) {
				Number[i] = (int) (Math.random() * 9) + 1;
			}
			// 다른 숫자가 나올때까지 계속 돌린다.
			if (Number[0] != Number[1] && Number[1] != Number[2] && Number[0] != Number[2]) {
				break;
			}
		}

		while (loop) {
			int strike = 0; // 스트라이크를
			int ball = 0;
			System.out.print("야구 게임을 시작합니다 :");
			Scanner Input = new Scanner(System.in);
			for (int i = 0; i < Fit.length; i++) {
				try {
					temp = Input.nextInt();
					Fit[i] = temp;
					if (temp > 10 || temp < 0) {
						System.out.println("1∼9의 정수를 입력하세요 ");
					}
				} catch (Exception e) {
					System.out.println("정수가 아닌 값이 입력되었습니다. ");
				}
			}
			for (int i = 0; i < Number.length; i++) {
				for (int j = 0; j < Fit.length; j++) {
					// 인덱스와 값이 동일해야 strike
					if (Number[i] == Fit[j] && i == j) {
						strike++;
					} else if (Number[i] == Fit[j] && i != j) {
						ball++;
					}
				}
			}
			System.out.println(strike + "스타라이크" + ball + "볼");
			if (strike == 3) {
				loop = false;
			}
			counter++;
		} // while 종료
		System.out.println("횟수 : " + (counter - 1));
		System.out.println("Game Over");
	}
}
