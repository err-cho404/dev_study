package baisc.chap02lecture;

public class LoopExam05 {

	public static void main(String[] args) {
/*		int count = 0;
		int i = 30;
		for(;true;) {
			if(i>50) {
				break; //가장 가까운 곳의 반복문을 탈출
			}
			System.out.println(i);
			i= i+1;
		}
//		System.out.println("반복 횟수 : " + count);
		*/
		for(int j=0; j<10 ; j=j+1) {
			if((j & 1) == 1) { //->홀수냐는 뜻
				continue; // 반복조건을 다시 따져라 java에서는 거의 사용 하지 않으나 python에서는 잘 사용하면 좋다.
			}
			System.out.println("짝수입니다."+ j);
		}
	}
}
