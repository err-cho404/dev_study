package objlec.one;

import java.util.Date;

import org.hamcrest.object.HasEqualValues;
import org.hamcrest.text.IsEqualCompressingWhiteSpace;

public class MemberVOTwo { //부모 클래스는 Object이다.-> public class MemeberVO extends Object {
	private String memid; //필드가 기본타입이 아닌 필드는 null로 초기화가 된다.
	public String pwd;
	public Date birth; //Date-sqㅣ과 util 두개가 있음
	public boolean gender;
	private int age; //필드는 생성되는 시점에서 기본 값으로 초기화된다.
	
	public int getAge() {
		//만약 자격이 있다면 age를 반환하고 그렇지 않으면 0반환
		return age;
	}

	public void setAge(int age) {
		//만약 자격이 있다면 age에 값을 할당하게 한다.
		this.age = age;
	}
	
	//접근 제한자,지정자,한정자 public, private, protected, default(없는 것)
	public MemberVOTwo(String memid, String pwd, Date birth, boolean gender, int age) {
		super();
		this.memid = memid;
		this.pwd = pwd;
		this.birth = birth;
		this.gender = gender;
		this.age = age;
	}//사용자 정의 생성자->기본생성자를 만들어 줘야한다.
	
	public MemberVOTwo() {
//		super -> 안만들어도 자동으로 컴파일러가 만들어줌
	}

	@Override
	public String toString() {
		return "MemberVOTwo [memid=" + memid + ", pwd=" + pwd + ", birth=" + birth + ", gender=" + gender + ", age="
				+ age + "]";
	}
	@Override
	public HasEqualValues
	
	
	

/*	public String infoPrint() {
		this.age = 500;
		return this.memid + "\t" + this.pwd + "\t" + this.birth + "\t" + this.gender + "\t" + this.age;
	}*/
	
}
//관련성 있는 데이터들과 데이터를 처리하는 관련 기능들을 하나로 묶어서 묶음 데이터를 만들었다. (=캡슐화)
