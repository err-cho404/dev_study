package baisc.chap01lecture;

public class ArrayExam01 {
	public static void main(String[] args) {
		double[] aaa; //배열(같은 종류의 여러개의 자료)의 선언 ->실수형 자료들이 묶여있는 배열 aaa ->double aaa[] =>c언어에서 쓰던 방법
		aaa = new double[] {10.5, 20.5, 30.5}; //선언한 배열에 자료

		double[] bbb = {12.5, 24.5, 36.5, 42.5}; //주로 사용하는 방법, 선언과 배열을 같이 함
		
//		String[] names = "홍마리 김마리 이마리 강마리".split(" ");
		String[] names;
		names = new String[] {"홍마리", "김마리", "이마리", "강마리"};
	}
}
