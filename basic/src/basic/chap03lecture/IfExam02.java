package baisc.chap03lecture;

import java.util.Scanner;

public class IfExam02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("국어점수[0-100]를 입력해주세요");
		int jumsu = scan.nextInt();

		if (jumsu > 100 || jumsu < 0) {
			System.out.println("점수가 범위에서 벗어났습니다.");
		} else {
			if (59 < jumsu && jumsu < 101) {// ->계층형 if문 이라고 한다.
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		}
	}
}
