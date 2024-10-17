package baisc.chap03lecture;

import java.util.Scanner;
//점수가 잘못 입력되지 않도록 원천 봉쇄 -> while
public class IfExam0202 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int jumsu = 0;
		while (true) { //->무한반복
			System.out.println("국어점수[0-100]를 입력해주세요");
			jumsu = scan.nextInt();

			if (!(jumsu > 100 || jumsu < 0)) {
				break; //->해당 점수에 맞는 값을 넣었을때 빠져나옴
			}
			System.out.println("점수가 범위에서 벗어났습니다.");
		}
		if (59 < jumsu && jumsu < 101) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}
}
