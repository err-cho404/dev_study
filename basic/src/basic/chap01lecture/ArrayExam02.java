package baisc.chap01lecture;

public class ArrayExam02 {
	public static void main(String[] args) {
		int[] jumsus = {100,15,75,95,100,97};
		System.out.println("국어 점수" + jumsus[0]);
		System.out.println("국민윤리 점수" + jumsus[5]);
		System.out.println("국민윤리 점수" + jumsus[6-1]);
		System.out.println("마지막 과목(국윤) 점수" + jumsus[jumsus.length-1]);
	}
}
