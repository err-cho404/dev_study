package objlec.two;

public class Bbbb extends Aaaa {
	/*
	 public void message() {
	 
		System.out.println("나는aaaa");
	}
	public abstract void message2(String data);
	*/
	
	@Override
	public void message() {
		System.out.println("나는bbbb");
	}

	@Override
	public void message2(String data) {
		System.out.println(data+"나는 Cccc클래스에서 구현하고 있다.");
	}
	
}
