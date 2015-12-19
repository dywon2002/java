package co.kr.mlec.day07.exam;

import java.util.Random;
import java.util.Scanner;

class AnswerVO {

	int num[] = new int[3];

}

public class BaseballGame {

	static Scanner sc = new Scanner(System.in);
	// 답 생성

	void randomNum() {
		Random random = new Random();
		AnswerVO answer = new AnswerVO();

		while (true) {
			answer.num[0] = random.nextInt(9) + 1;

			answer.num[1] = random.nextInt(9) + 1;

			answer.num[2] = random.nextInt(9) + 1;

			if (answer.num[0] != answer.num[1] && answer.num[1] != answer.num[2] && answer.num[2] != answer.num[0]) {
				break;
			}
		}

		System.out.println("확인용 답 : " + answer.num[0] + " " + answer.num[1] + " " + answer.num[2]);
	}

	// 종료
	void exit() {

		String go = sc.next();

		if (go.equals("N")) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {

		BaseballGame game = new BaseballGame();

		System.out.print("야구게임을 시작합니다. (Y/N) : ");
		String go = sc.next();

		// 난수발생
		game.randomNum();

		// 정답 입력
		AnswerVO answer = new AnswerVO();
		int[] call = new int[3];

		System.out.println("숫자 세개를 입력하세요 (입력형식 : 1 2 3) : ");
		call[0] = sc.nextInt();
		call[1] = sc.nextInt();
		call[2] = sc.nextInt();

		// 정답 값과 콜값을 비교

		// 종료
		game.exit();
	}

}
