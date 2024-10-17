package kr.co.yangdoll.sungjuk;

public class SunJukCalcu {
	public int total(int kor, int eng , int mat) {
		int result = 0;
		result = kor + eng + mat;
		return result;
	}
	public double average(int total) {
		double result = 0.0;
		result = total / 3.0 ;
		return result;
	}
}
