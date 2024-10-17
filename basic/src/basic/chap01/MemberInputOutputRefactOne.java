package baisc.chap01;

import java.util.Scanner;

public class MemberInputOutputRefactOne {
	public static void main(String[] args) {
//		String id, password, irum, address, birthday;//입력된 자료를 보관할 변수 선언
//		Scanner scan = new Scanner(System.in);
//		System.out.println("아이디 입력");//입력해야할 정보 알려준다.->모니터에 안냇말 출력
//		id = scan.next();
//		System.out.println("입력한 아이디 : " + id );
		
//		System.out.println("비번 입력");
//		password= scan.next();
//		System.out.println("입력한 비번 : " + password );
		inputOutput("아이디");
		inputOutput("비번");
		inputOutput("이름");
		inputOutput("주소");
		inputOutput("생년월일");
	}
	
	public static void inputOutput(String msg) {
		Scanner scan = new Scanner(System.in);//키보드로 부터 입력받을 준비
		System.out.println( msg + "입력");
		String inputData = scan.next();
		System.out.println("입력한" + msg + " : " + inputData);
		
	}
}
