package baisc.chap02lecture;

public class LoopExam02 {
	
	public static void main(String[] args) {
		int sum1 = 0;
//		for(시작값 ; 반복종료결정감(논리); 증감값) {반복할 내용}
		for(int i=1; i<=10; i=i+2) {
		sum1 = sum1+i;
		}
		System.out.println("1부터 10까지의 홀수 합 : " + sum1);
		
		System.out.println("=============또 다른 방법============");
	
//		if 사용을 한 방법이나 위의 방법보다 효율이 떨어짐
		int sum2 = 0;
		for(int i=1; i<=10; i=i+1) {
			if(i%2 == 1) {
			sum2 = sum2+i;
			}			
		}
		System.out.println("1부터 10까지의 홀수 합 : " + sum2);
		
		System.out.println("=======홀수의 값과 짝수의 값을 따로따로 구하기======");
		
		int sumOdd1 = 0;
		int sumEven1 = 0;
		for(int i=1; i<=10; i=i+1) {
			if(i%2 == 1) {
				sumOdd1 = sumOdd1+i;
			}else {		
				sumEven1=sumEven1+i;
			}
		}
		System.out.println("1부터 10까지의 홀수 합 : " + sumOdd1);
		System.out.println("1부터 10까지의 짝수 합 : " + sumEven1);
		
		System.out.println("=============또 다른 방법============");
		
		int sumOdd2 = 0;
		int sumEven2 = 0;
		for(int i=1; i<=10; i=i+2) {
				sumOdd2 = sumOdd2+i;	
				sumEven2=sumEven2 + (i+1);
		}
		System.out.println("1부터 10까지의 홀수 합 : " + sumOdd2);
		System.out.println("1부터 10까지의 짝수 합 : " + sumEven2);
	}
}
