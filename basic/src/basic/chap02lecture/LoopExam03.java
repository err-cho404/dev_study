package baisc.chap02lecture;

public class LoopExam03 {
	public static void main(String[] args) {
		int result = allSumCalcu(1, 10, 2);
		System.out.println("결과 : " + result);
		result = allSumCalcu(21, 100, 1);
		System.out.println("결과 : " + result);
	}	
	public static int allSumCalcu(int start, int end, int inc) {
		int result=0;
		for(int i = start; i < end+1; i = i+inc) {
			result = result + i;
		}
		return result;
	}
}
