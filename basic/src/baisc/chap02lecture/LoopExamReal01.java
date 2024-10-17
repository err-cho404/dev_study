package baisc.chap02lecture;

public class LoopExamReal01 {
	public static void main(String[] args) {
		String[] names = "양우영 홍길동 홍길순 양재옥 김말동 김수한무거북이와두루미".split(" ");
		System.out.println("이름 배열의 개수" + names.length);
		System.out.println("마지막 이름 : " + names[names.length-1]);
		for(int i=0; i<names.length; i+=1) {
			System.out.print(names[i] + " 반갑습니다.\t");
		}
	}
}
