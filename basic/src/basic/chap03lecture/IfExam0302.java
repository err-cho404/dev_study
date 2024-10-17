package baisc.chap03lecture;

import java.util.Scanner;

public class IfExam0302 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int jumsu = 0;
		boolean check = true;
		while (check) {
			System.out.println("점수를 입력[0~100]");
			jumsu = scanner.nextInt();
			if (jumsu < 101 && jumsu > -1) {
				check = false;
			}
		}

		if (jumsu >= 90 && jumsu < 101) {
			System.out.println("100,000원 자동이체");
		}
		if (jumsu >= 80 && jumsu < 90) {
			System.out.println("10,000원 자동이체");
		}
		if (jumsu >= 70 && jumsu < 80) {
			System.out.println("1,000원 자동이체");
		}
		if (jumsu >= 60 && jumsu < 70) {
			System.out.println("100원 자동이체");
		}
		if (jumsu >= 0 && jumsu < 60) {
			System.out.println("용돈없음");
		}
	}
}
