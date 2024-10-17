package baisc.chap02lecture;

public class LoopExamReal01 {
	public static void main(String[] args) {
		String[] names = "김마리 홍마리 양마리 이마리 박마리 최마리".split(" ");
		System.out.println("이름 배열의 개수" + names.length);
		System.out.println("마지막 이름 : " + names[names.length-1]);
		for(int i=0; i<names.length; i+=1) {
			System.out.print(names[i] + " 반갑습니다.\t");
		}
	}
}
