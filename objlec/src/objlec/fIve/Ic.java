package objlec.fIve;

public class Ic implements Ia {

	@Override
	public int aaa() {
		System.out.println("맨처음 만듦 500반환");
		return 500;
	}

	@Override
	public int bbb() {
		int result = 0;
		System.out.println("맨처음 만든 두번째 메서드 300반환");
		result = 300;
		return result;
	}

	@Override
	public void ccc() {
		System.out.println("맨처음 만든 세번째 메서드 반환없음");
		return;//<=생략해도 무방함
	}

}
//사용되어지는 클래스를 만들 때 인터페이스를 만들고 그 인터페이스를 구현하는 클래스에 기능을 담으면 된다.