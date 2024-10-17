package baisc.chap03lecture;

import java.util.Scanner;

public class IfExam0303 {
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
		String[] messages = {
				"용돈없음",  // message의 0번
				"용돈없음",  // message의 1번
				"용돈없음",
				"용돈없음",
				"용돈없음",
				"용돈없음",		
				"100원",
				"1,000원",
				"10,000원",
				"100,000원",	
				"100,000원"  // message의 10번
		};
		System.out.println(jumsu + "\t" + messages[jumsu/10]); //->10으로 나누면 배열의 index 번호로 산출되어 내용출력
	}
}
