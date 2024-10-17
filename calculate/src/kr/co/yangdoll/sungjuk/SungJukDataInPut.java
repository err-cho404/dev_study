package kr.co.yangdoll.sungjuk;

import java.util.Scanner;

public class SungJukDataInPut {
	public String hakbunNIrum(String message) {
		String result = "";
		System.out.println(message + "을 입력해주세요.");
		Scanner scan = new Scanner(System.in);
		result = scan.next(); /* 문자열은 next()로 받음 */
		return result;
	}

	public int jumsuInput(String message) {
		// 메서드 안에 결과물 타입의 변수를 선언하고 기본값으로 초기화 한 후 반화구문 작성
		int result = 0;
		System.out.println(message + "을[를]0~100 의 정수로 성적을 입력해주세요.");
		Scanner scan = new Scanner(System.in);
		result = scan.nextInt(); /* 숫자는 nextInt()로 받음 */
		return result;
	}
	/*
	간단하게 변환한다면
	public int jumsuInput() { 
	Scanner scan = new Scanner(System.in); 
	result = scan.nextInt(); }
	 */
}