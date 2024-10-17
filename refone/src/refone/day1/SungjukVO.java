package refone.day1;

import java.util.Objects;
// @Data
public class SungjukVO { // Data를 표현하는 클래스 정의
	int hakbun;
	String irum;
	int kor;
	int eng;
	int mat;  
	int sum;
	double average; // -> 데이터 로만 묶여있는 위의 것들을 VO(value object)class나 ntt나 빈클래스 라고 함. =>  캡슐화
	public SungjukVO() { //class 이름과 동일한 메서드 반환되는 클래스 없음->기본 생성자 메서드
		super();
		// TODO Auto-generated constructor stub
		
	}
	public SungjukVO(int hakbun, String irum, int kor, int eng, int mat, int sum, double average) {
		super();
		this.hakbun = hakbun;
		this.irum = irum;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.sum = sum;
		this.average = average;
	}
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getIrum() {
		return irum;
	}
	public void setIrum(String irum) {
		this.irum = irum;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	@Override
	public int hashCode() {
		return Objects.hash(average, eng, hakbun, irum, kor, mat, sum);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SungjukVO other = (SungjukVO) obj;
		return Double.doubleToLongBits(average) == Double.doubleToLongBits(other.average) && eng == other.eng
				&& hakbun == other.hakbun && Objects.equals(irum, other.irum) && kor == other.kor && mat == other.mat
				&& sum == other.sum;
	}
	
	
	
}


