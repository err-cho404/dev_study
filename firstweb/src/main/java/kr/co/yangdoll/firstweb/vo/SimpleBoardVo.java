package kr.co.yangdoll.firstweb.vo;

import java.util.Objects;

public class SimpleBoardVo {
	private long serNum; //테이블에 프라이머리키로 설정된 컬럼
	private String title; 
	private String contents;
	private String irum;
	private String password;
	private long readCount; 
	private String regiDate;
	public SimpleBoardVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SimpleBoardVo(long serNum, String title, String contents, String irum, String password, long readCount,
			String regiDate) {
		super();
		this.serNum = serNum;
		this.title = title;
		this.contents = contents;
		this.irum = irum;
		this.password = password;
		this.readCount = readCount;
		this.regiDate = regiDate;
	}
	public long getSerNum() {
		return serNum;
	}
	public void setSerNum(long serNum) {
		this.serNum = serNum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getIrum() {
		return irum;
	}
	public void setIrum(String irum) {
		this.irum = irum;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getReadCount() {
		return readCount;
	}
	public void setReadCount(long readCount) {
		this.readCount = readCount;
	}
	public String getRegiDate() {
		return regiDate;
	}
	public void setRegiDate(String regiDate) {
		this.regiDate = regiDate;
	}
	@Override
	public int hashCode() {
		return Objects.hash(contents, irum, password, readCount, regiDate, serNum, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SimpleBoardVo other = (SimpleBoardVo) obj;
		return Objects.equals(contents, other.contents) && Objects.equals(irum, other.irum)
				&& Objects.equals(password, other.password) && readCount == other.readCount
				&& Objects.equals(regiDate, other.regiDate) && serNum == other.serNum
				&& Objects.equals(title, other.title);
	}
	@Override
	public String toString() {
		return "SimpleBoardVo [serNum=" + serNum + ", title=" + title + ", contents=" + contents + ", irum=" + irum
				+ ", password=" + password + ", readCount=" + readCount + ", regiDate=" + regiDate + "]";
	}
	
	
}
