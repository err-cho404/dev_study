package baisc.chap02lecture;

public class LoopExamReal03 {
	public static void main(String[] args) {
		String alphabat ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i = 0; i < alphabat.length(); i=i+1) {
			System.out.print(alphabat.charAt(i));
		}	
		System.out.println();
		for (int i= alphabat.length()-1; i > -1 ; i=i-1) {
			System.out.print(alphabat.charAt(i));
		}
		System.out.println();
		for (int i = 0 ; i < alphabat.length(); i=i+1) {
			System.out.print(alphabat.charAt(alphabat.length()-1-i));
		}
		
		System.out.println("\n======규칙에 따른 문자역 생성 for 구문 활용======");
		String alTwo="";
		for (int i=0 ; i<26 ; i=i+1) {
			 alTwo= alTwo+(char)(65+i);			
		}
		System.out.println("만들 문자열 => " + alTwo);			
		
		
		int size = alphabat.length();
		for (int i = 0; i < size; i=i+1) { //성능이슈가 생긴다면 사용할 수 있는 방법 size로 변수명 지정해 계속 alphabat갯수 세는 작업을 반복하지 않게해줌
			System.out.print(alphabat.charAt(i));
		/* 
		 && : 논리 and 연산자 => true&&false , true&&true , 1>2 && 3<4  조건이 둘다 맞으면 true 하나라도 틀리면 false
		 ||: 논리 or 연산자 => true || false, true || true, 1>2||3<4 조건이 하나라도 맞으면 true 
		 !: 논리 not 연산자 => ! true, !(5>6)->'5가6보다 크다는건 맞지않다'=> true 
		 */
		System.out.println("비트and 5&4 => "+ (5&4) );   
		System.out.println("비트and true&false=>"+(true&false)); 
		System.out.println("비트 not(~) : ~5=>" +(~5)  );
		System.out.println("비트 not(~) : ~127=>" +(~127)  );
		System.out.println("비트 not(~) : ~ -127=>" +(~ -127)  ); //not은 01011011->10100100 으로 뒤집는 개념 1 더해줘야함
		System.out.println("비트 왼쪽shift(<<) : 12<<2 =>" +( 12 << 2 )  ); //12<<2 => 12*2²
		System.out.println("비트 우측shift(<<) : 12>>2 =>" +( 12 >> 2 )  ); //12>>2 => 12/2²
		System.out.println("비트 우측shift(<<) : 12>>>2 =>" +( 12 >>> 2 )  ); //12>>>2 => 12/2³
		
		System.out.println("\n======음수를 우쉬프트======");
		
		System.out.println("비트 우측shift(<<) : -12>>2 =>" +( -12 >> 2 )  ); //12>>2 => 12/2²
		System.out.println("비트 우측shift(<<) : -12>>>2 =>" +( -12 >>> 2 )  ); //값이 다른식과 다르게 결과가 다름
		//아래 중요하지 않음
		System.out.println("비트 X-or(^) : 5 ^ 3 =>" + (5 ^ 3)  ); //5->101 3->011 같으면0 다르면1로 110이되고 이는 6임.	
		//이렇게는 절대쓰지 말기(증감연산자++,--)
		int num =10;
//		System.out.println("num의 증가 연산자 결과" + num++);
//		System.out.println("num의 증가 연산자 결과" + ++num);
		++num;
		System.out.println("num의 증가 연산자 결과" + num);
		
		System.out.println("num의 증가 연산자 결과" + ++num + ++num); //+ ++가 중첩이 됨, 사용자재
		int k = num++ + 2;//최악
		}
	}
}
