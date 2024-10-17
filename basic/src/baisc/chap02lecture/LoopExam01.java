package baisc.chap02lecture;

public class LoopExam01 {
	public static void main(String[] args) {
//		반복구문-> for,while
		System.out.println("choyoun");
		System.out.println("choyoun");
		System.out.println("choyoun");
		System.out.println("choyoun");
		System.out.println("choyoun");
		System.out.println("================");
		
//		수정시 빼먹을 일 없이 더 안전한 방법이다.
		String irum = "choyoun";
		System.out.println(irum);
		System.out.println(irum);
		System.out.println(irum);
		System.out.println(irum);
		System.out.println(irum);
		
		System.out.println("================");
		
//		for 반복구문 i<5 만 바꿔주면 간단하게 수정가능
		for(int i=0; i<5; i=i+1){
			System.out.println(irum);
		}
	}
}
