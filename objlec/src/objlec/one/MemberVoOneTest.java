package objlec.one;

import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class MemberVoOneTest {
	
	MemberVOTwo obj;
	
	@Before //다른 테스트를 수행하기 이전에 먼저 수행할 동작
	public void startSet() {
//		obj = new MemberVOTwo("aaaa","bbbb",new Date(), true, 19);
		obj = new MemberVOTwo();
	}
	
	@Test
	public void fileSetTest() {
		assertNotNull(obj);
//		obj.age = 19; //직접 필드에 접근해서 값을 읽거나 변경할 수 있다. <= 자료 숨김이 안됨
		obj.setAge(120);
//		String reultStr = obj.infoPrint();
//		System.out.println(reultStr);
		System.out.println(obj.toString());
		System.out.println("생성된 묶음자료의 나이" + obj.getAge());
	}
	
	@Test
	public void equalTest() {
		MemberVOTwo obj2 = new MemberVOTwo();
		obj2.setAge(120);
		System.out.println(obj2);
		
		obj.setAge(120);
		System.out.println(obj);
		
		System.out.println("비교 결과 =>" + obj2.equals(obj));
	}
	
	@Test
	public void bigTypeTest() {
		Object memVoObj = new MemberVOTwo();
		MemberVOTwo memVoEqu = new MemberVOTwo();
//		memVoEqu. ->MemberVOTwo 에서 정의된 정보와 상속받은 정보 모두 이용할 수 있다.
		
//		memVoObj. ->object 클래스에 정의된 정보 (필드와 메서드)만 사용할 수 있다.
		//		<= MemberVOTwo 에서 새롭게 정의된 정보를 사용하고자 한다면 형변화 해줘야한다.
		      // ((MemberVOTwo)memVoObj).   ->형변화 한 형태
		//상위타입으로 써주는게 좋다.
		
	}
}
	