package refone.day1;

public class StringExam01 {
	public static void main(String[] args) {
		String testData = "나는 12시 전에 이미 배고프다";
			
		for(int i=0 ; i<5 ; i=i+1) {
			testData = testData + i; //데이터 변경이 빈번하게 이루어지면 StringBuffer, StringBuilder사용
			System.out.println(testData);
		}//반복문에 의해서 원래 저장된 문자열이 자주 변경이된다->잘못 사용된 경우
		
			System.out.println("======= 제대로 사용하는 방법=========");
			StringBuilder testData2 = new StringBuilder("나는 12시 전에 이미 배고프다");
			System.out.println(testData2);
			for(int i=0 ; i<5 ; i=i+1) {
				testData2 = testData2.append(i);
				System.out.println(testData2);
			}
	}
}