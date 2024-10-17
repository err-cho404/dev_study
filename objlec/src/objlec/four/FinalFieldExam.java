package objlec.four;

public class FinalFieldExam {
	public int nonFinalField;
	
	
	
	//final 정의하는 시점에서 초기화를 하거나 정의하는 시점에서 초기화하지 않았다면 생성되는 시점에서 반드시 초기화가 되어야한다.
	public final int finalFieldOne=50; //final 정의하는 시점에서 초기화
	
	public final int finalFieldTwo; //final 정의하는 시점에서 초기화를 하거나 정의하는 시점에서 초기화하지 않았다면 생성되는 시점에서 반드시 초기화
	
	
	
	//static final 정의하는 시점에서 반드시 초기화를 해야한다.
	public static final int finalStaticField=500;



	public FinalFieldExam() { // new FinalFieldExam();
		super();
		finalFieldTwo = 100; //100으로 고정
	}
	public FinalFieldExam(int num) { // new FinalFieldExam(500);
		super();
		finalFieldTwo = num; //500이 나옴 -> 사용자가 지정해 fix 시키겠다.
	}
	
	public void changeField() {
		nonFinalField = 500;
		
		finalFieldOne = 500; //한번 값이 들어가면 변경이 안됨
		finalFieldTwo = 700;
		finalStaticField = 800;
	}
	
	public void parFinal(int num /*final int num*/) { //몰라도 됨,컴파일러가 알아서 필요한 시점에서 final을 붙여줌 

	}
}