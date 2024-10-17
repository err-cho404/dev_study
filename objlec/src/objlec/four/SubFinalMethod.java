package objlec.four;

//클래스와 클래스 간에는 단일 상속(extend)받을 수 있다. 인터페이스는 여러개 상속(extends)
public class SubFinalMethod extends FinalMethodExam {
	
	@Override
	public void nonFinalMethod() {
		System.out.println("나는 final이 없는 메서드");
		System.out.println("SubClass에서 추가된 내용");
	}
	
	@Override
	public final void finalMethod() { //부모(슈퍼) 클래스에 메서드에 final이 붙어있기 때문에
		System.out.println("나는 final메서드");
	}
}
