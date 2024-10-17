package myprjOne.vo;

import java.util.Objects;

public class SampleVo {
	private String id ; // --not null
	private String pwd ;
	private String name ;
	private String gender ;
	private String address ;
	public SampleVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SampleVo(String id, String pwd, String name) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, gender, id, name, pwd);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SampleVo other = (SampleVo) obj;
		return Objects.equals(address, other.address) && Objects.equals(gender, other.gender)
				&& Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(pwd, other.pwd);
	}
	@Override
	public String toString() {
		return "SampleVo [id=" + id + ", pwd=" + pwd + ", name=" + name + ", gender=" + gender + ", address=" + address
				+ "]";
	}
	
}
