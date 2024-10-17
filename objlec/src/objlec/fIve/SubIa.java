package objlec.fIve;

import java.io.Serializable;

public interface SubIa extends Ia, Serializable {
	/*public abstract int aaa();
	int bbb();
	void ccc(); */
}

//의미론적인 인터페이스 -> 인터페이스의 내용이 하나도 없는 인터페이스 :  Serializable  가 대표적
//함수형 인터페이스 -> 인터페이스 내용에 추상메서드가 하나만 있는 인터페이스 : @FunctionalInterface라는 어노테이션을 붙인다.(선택사항)
//lambda 식으로 구현하는 클래스를 만드는 대사이 된다.
//=>면접볼때 용어를 적어서 외워가기


new SubIa();// ->인터페이스는 new 생성불가
