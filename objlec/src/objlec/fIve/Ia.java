package objlec.fIve;


//인터페이스에 정의된 필드는 기본적으로 모두 추상 메서드이다. 굳이 public abstract를 붙일 필요 없음
//인터페이스에 필드를 정의할 수 있으며 이 필드는 static final이 된다.
public interface Ia {
//	double pi = 3.14; ->static final 필드(pi)를 상수(상수필드 pi)라고 한다.
	//무조건 프로그램에서 고정되야하는 값일 때
	public abstract int aaa();
	int bbb();
	void ccc();
}
