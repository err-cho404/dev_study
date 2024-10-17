package baisc.chap01;

import java.util.Scanner;

public class MemberInputOuput {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("아이디를 이메일형식으로 입력하세요");
		String id = scan.next();
		System.out.println("입력한 아이디 : " + id);
		
		System.out.println("비밀번호를 입력하세요");
		String password = scan.next();
		System.out.println("입력한 비밀번호 : " + password);
		
		System.out.println("이름을 입력하세요");
		String irum = scan.next();
		System.out.println("입력한 이름 : " + irum);
		
		System.out.println("주소를 입력하세요");
		String address = scan.next();
		System.out.println("입력한 주소 : " + address );
		
		System.out.println("생년월일을 입력하세요");
		String birthday = scan.next();
		System.out.println("입력한 생년월일 : " + birthday );
		
	}

}
