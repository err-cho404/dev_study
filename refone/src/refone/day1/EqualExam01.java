package refone.day1;

public class EqualExam01 {
	public static void main(String[] args) {
		String strOne = new String("김마리");
		String strTwo = new String("김마리");
		System.out.println("strOne =>" + strOne + "\nstrTwo =>" + strTwo);
		System.out.println("--------- '==' 연산자를 사용했을때 -----------");
		if(strOne==strTwo) { //1차 비교(변수에 들어있는 값만 비교한다.)
			System.out.println("두 자료는 같다");
		}else {
			System.out.println("두 자료는 다르다");
		}
		System.out.println("--------- 객체 비교 equals 메서드를 사용했을때 -----------");
		if(strOne.equals(strTwo)) { //2차 비교(변수가 가르키는 곳에 값을 비교한)
			System.out.println("두 자료는 같다");
		}else {
			System.out.println("두 자료는 다르다");
		}
	}
}
