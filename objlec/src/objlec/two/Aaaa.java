package objlec.two;

/*public class Aaaa extends Object{*/
public abstract class Aaaa extends Object { /*-> 추상클래스*/
	public void message() {
		System.out.println("나는aaaa"); //->messsage()를 쓰면 나오는 결과
	}
	public void message(String data) { //->messsage("나는aaaa")를 쓰면 나오는 결과 ->오버로딩
		System.out.println("나는aaaa");
	}
	public abstract void message2(String data); //abstract가 들어가면 abstract로 맞춰줘야함
}
//public abstract -> 추상메서드로만 이루어진것 -> 인터페이스