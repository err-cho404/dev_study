package kr.co.yangdoll.sungjuk;

public class SungJukProcess {

	public static void main(String[] args) {
		SungJukDataInPut dataInput = new SungJukDataInPut();
		String irum = dataInput.hakbunNIrum("이름");
		String hakbun = dataInput.hakbunNIrum("학번 숫자형태 4자리");
		
		int kor = dataInput.jumsuInput("국어");
		int eng = dataInput.jumsuInput("영어");
		int mat = dataInput.jumsuInput("수학");
		
		System.out.println("=== 입력한 정보 ===");
		System.out.println("학번 : " + hakbun + "\t이름 : " + irum );
		System.out.println("국어 : " + kor + "\t영어 : " + eng + "\n수학 : " + mat );
		
		SunJukCalcu totAvg = new SunJukCalcu();
		int total = totAvg.total(kor, eng, mat);
		double average = totAvg.average(total);
		System.out.println("총점 : " + total + " \t\t평균 : " + average);
	}

}
