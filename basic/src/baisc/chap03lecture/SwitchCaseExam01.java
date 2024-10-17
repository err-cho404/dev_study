package baisc.chap03lecture;

public class SwitchCaseExam01 {
	public static void main(String[] args) { //가능하면 switch~case 구문을 사용하지 않길 권장, else if 구문이나 if 구문 사용을 권장(성능 이슈)
		int jumsu = 65;
		
		switch (jumsu / 10) {
		case 10:
			System.out.println("100,000원 지급"); //-> 9,10이 값이 같으면 생략 가능
			break;
		case 9:
			System.out.println("100,000원 지급");
			break;
		case 8:
			System.out.println("10,000원 지급");
			break;
		case 7:
			System.out.println("1,000원 지급");
			break;
		case 6:
			System.out.println("100원 지급");
			break;

		default:  // 생략 가능
			System.out.println("등찍스매싱 지급");
			break;
		}
	}
}
