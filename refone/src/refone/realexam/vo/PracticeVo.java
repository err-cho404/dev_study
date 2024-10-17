package refone.realexam.vo;

import java.util.Objects;

public class PracticeVo {
	
	String Code;
	String mName;
	String Birth;
	String Phone;
	String Team;
	public PracticeVo() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	public PracticeVo(String code, String mName, String birth, String phone, String team) {
		super();
		Code = code;
		this.mName = mName;
		Birth = birth;
		Phone = phone;
		Team = team;
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getBirth() {
		return Birth;
	}
	public void setBirth(String birth) {
		Birth = birth;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getTeam() {
		return Team;
	}
	public void setTeam(String team) {
		Team = team;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Birth, Code, Phone, Team, mName);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PracticeVo other = (PracticeVo) obj;
		return Objects.equals(Birth, other.Birth) && Objects.equals(Code, other.Code)
				&& Objects.equals(Phone, other.Phone) && Objects.equals(Team, other.Team)
				&& Objects.equals(mName, other.mName);
	}
	@Override
	public String toString() {
		return "PracticeVo [Code=" + Code + ", mName=" + mName + ", Birth=" + Birth + ", Phone=" + Phone + ", Team="
				+ Team + "]";
	}
	
	
}	


