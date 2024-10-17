package baisc.chap03lecture;

import java.util.Scanner;

public class IfExam0304 {
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
				"등짝스매싱",		
				"100원",
				"1,000원",
				"10,000원",
				"100,000원",	
				"100,000원"  // messages의 5번 배열
		};
		int arrIndex = ((jumsu/10)-5 < 0 )?0:(jumsu/10)-5; // (jumsu/10)-5 < 0 )?0 -> true면 0을 반환, false면 : 뒤의 값 반환
		System.out.println(jumsu + "\t" + messages[arrIndex]); //->10으로 나누면 배열의 index 번호로 산출되어 내용출력
	}
}
