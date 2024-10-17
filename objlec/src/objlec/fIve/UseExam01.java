package objlec.fIve;

public class UseExam01 {
//	static Ia obj03;
	public static void main(String[] args) {
		B obj01 = new B();
		
		A obj02 = new B();//슈퍼클래스A와 서브클래스B의 관계 B에 A,B,C 클래스를 모두 담을 수 있어 유연함
		
//		Ia obj03 = new Ic(); //인터페이스 Ia  구현클래스 Ic의 관계
		Ia obj03 = new IcNew();
		obj03.aaa();//->버림 void
		int result = obj03.aaa();//->값을 저장
		int result2 = obj03.bbb();
		obj03.ccc();
/*		
		Ia obj04 = new Ic();
		obj03.aaa();//->버림 void
		int result3 = obj04.aaa();//->값을 저장
		int result4 = obj04.bbb();
		obj04.ccc();
		아래메서드는 위의 기능을 분리해서 만듦
*/		
		splitMeth(new Ic());
		splitMeth(new IcNew());
	}
	public static void splitMeth(Ia obj/*인터페이스 타입으로 obj변수를 정의함<=다형성*/) {
		obj.aaa();//->버림 void
		int result3 = obj.aaa();//->값을 저장
		int result4 = obj.bbb();
		obj.ccc();
		
	}
}
