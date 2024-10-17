package objlec.one;

import java.util.Date;

public class MemberVOOne { //부모 클래스는 Object이다.-> public class MemeberVO extends Object {
	public String memid; //필드가 기본타입이 아닌 필드는 null로 초기화가 된다.
	public String pwd;
	public Date birth; //Date-sqㅣ과 util 두개가 있음
	public boolean gender;
	public int age; //필드는 생성되는 시점에서 기본 값으로 초기화된다.
	
	public String infoPrint() {
		return this.memid + "\t" + this.pwd + "\t" + this.birth + "\t" + this.gender + "\t" + this.age;
	}
}
//관련성 있는 데이터들과 데이터를 처리하는 관련 기능들을 하나로 묶어서 묶음 데이터를 만들었다. (=캡슐화)
