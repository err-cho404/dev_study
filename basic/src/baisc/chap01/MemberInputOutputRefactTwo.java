package baisc.chap01;

import java.util.Scanner;

public class MemberInputOutputRefactTwo {
	public static void main(String[] args) {
		
		/* String[] messages = {"아이디","비번","이름","주소","생년월일"}; 출력할 문자열들을 하나로 묶어준다{0,1,2,3,4} */
		String[] yangMessages = "아이디 비번 이름 생년월일 주소".split(" ");
		
		for(int i=0; i<yangMessages.length ; i=i+1){ //for 구문을 이용해서 문자열의 묶음안에 있는 문자열의 개수 만큼 반복을 명령, 컴퓨터는 0번부터 시작
			
			inputOutput(yangMessages[i]);   // 조건만들때 i<5 -> messages.length / messages.size / messages.length() / messages.size() ->숫자보다 변수가 낫다
		}
	
	}
	public static void inputOutput(String msg) {
		Scanner scan = new Scanner(System.in);
		System.out.println( msg + "입력");
		String inputData = scan.next();
		System.out.println("입력한" + msg + " : " + inputData);
	}
}
