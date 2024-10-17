package baisc.chap03lecture;

import java.util.Scanner;

public class IfExam03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int jumsu = 0;
		boolean check = true;
		while(check) {
			System.out.println("점수를 입력[0~100]");
			jumsu = scanner.nextInt();
			if(jumsu < 101 && jumsu > -1) {
				check = false;
			}
		}
		
		if(jumsu >= 90) {
			System.out.println("100,000원 자동이체");
		}else if (jumsu >= 80) {
			System.out.println("10,000원 자동이체");
		}else if (jumsu >= 70) {
			System.out.println("1,000원 자동이체");
		}else if (jumsu >= 60) {
			System.out.println("100원 자동이체");
		}else {
			System.out.println("등짝스매싱");
		}  //위의 모든 조건에서 만족을 하면 블럭을 수행하고 이곳으로 온다.
	}
}
