package kr.co.yangdoll.calcu;

import java.util.Scanner;

// 숫자를 입력 받는 역할의 일꾼
public class NumInput {
	public int dataInput() {
		System.out.println("화면에 숫자를 입력해주세요.");
		Scanner s = new Scanner(System.in); //입력받을 준비
		int inNumData = s.nextInt();
		return inNumData;
	}
}
