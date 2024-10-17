package baisc.chap02lecture;

public class LoopExam04 {
	public static void main(String[] args) {
		int sw = -1;
		int sum = 0;
		for(int i = 5 ; i < 12 ; i = i + 1) {
			sw = sw * (-1);
			sum =sum + (sw + i);
			System.out.println(i + "번째 sw에 들어있는 값" + sw);
			System.out.println(i + "번째 i와sw를 곱한 값" + (sw * i) );
		}
		System.out.println("최종결과" + sum );
	}
}
