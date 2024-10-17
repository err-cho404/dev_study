package baisc.chap03lecture;

public class IfExam01 {
	public static void main(String[] args) {
		// if ( 판단조건 ) { 조건이 참일경우 수행할 문장 }
		int jumsu = 165;
		
		
		if( jumsu >= 60 && jumsu <= 100) {
			System.out.println("귀하는 합격했습니다. 축하합니다.");
		}
		if( jumsu >= 0 && jumsu < 60) {
			System.out.println("안타깝게도 귀하는 불합격하였습니다.");			
		}
		if( jumsu > 100 || jumsu < 0) {
			System.out.println("점수가 범위에서 벗어났습니다.");			
		}
	}
}
