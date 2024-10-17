package com.yangdoll.empma.vo;

import java.util.Objects;

public class EmployeeVO {
	private Integer EMPLOYEE_ID; //NOT NULL ,
	private String FIRST_NAME;
	private String LAST_NAME; //NOT NULL ENABLE,
	private String EMAIL; //NOT NULL ENABLE,
	private String PHONE_NUMBER;
	private String HIRE_DATE; //NOT NULL ENABLE, 입력 폼에서 입력되는 내용이 아닌 자동으로 생성되는 내용이므로 not null
	private String JOB_ID; //NOT NULL ENABLE,
	private Double SALARY;
	private Double COMMISSION_PCT ; //double의 참조타입 Double을 사용
	private Integer MANAGER_ID; // int의 참조타입 Integer
	private Integer DEPARTMENT_ID;
	//long->Long  / boolean->Boolean, char->Character
	public EmployeeVO() {
	}

	/*
	 * public EmployeeVO(Integer eMPLOYEE_ID, String lAST_NAME, String eMAIL, String
	 * jOB_ID) { super(); EMPLOYEE_ID = eMPLOYEE_ID; LAST_NAME = lAST_NAME; EMAIL =
	 * eMAIL; JOB_ID = jOB_ID; }
	 */
	public EmployeeVO(Integer eMPLOYEE_ID, String fIRST_NAME, String lAST_NAME, String eMAIL, String pHONE_NUMBER,
			String jOB_ID, Double sALARY, Double cOMMISSION_PCT, Integer mANAGER_ID, Integer dEPARTMENT_ID) {
		super();
		EMPLOYEE_ID = eMPLOYEE_ID;
		FIRST_NAME = fIRST_NAME;
		LAST_NAME = lAST_NAME;
		EMAIL = eMAIL;
		PHONE_NUMBER = pHONE_NUMBER;
		JOB_ID = jOB_ID;
		SALARY = sALARY;
		COMMISSION_PCT = cOMMISSION_PCT;
		MANAGER_ID = mANAGER_ID;
		DEPARTMENT_ID = dEPARTMENT_ID;
	}
	public Integer getEMPLOYEE_ID() {
		return EMPLOYEE_ID;
	}
	public void setEMPLOYEE_ID(Integer eMPLOYEE_ID) {
		EMPLOYEE_ID = eMPLOYEE_ID;
	}
	public String getFIRST_NAME() {
		return FIRST_NAME;
	}
	public void setFIRST_NAME(String fIRST_NAME) {
		FIRST_NAME = fIRST_NAME;
	}
	public String getLAST_NAME() {
		return LAST_NAME;
	}
	public void setLAST_NAME(String lAST_NAME) {
		LAST_NAME = lAST_NAME;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getPHONE_NUMBER() {
		return PHONE_NUMBER;
	}
	public void setPHONE_NUMBER(String pHONE_NUMBER) {
		PHONE_NUMBER = pHONE_NUMBER;
	}
	public String getHIRE_DATE() {
		return HIRE_DATE;
	}
	public void setHIRE_DATE(String hIRE_DATE) {
		HIRE_DATE = hIRE_DATE;
	}
	public String getJOB_ID() {
		return JOB_ID;
	}
	public void setJOB_ID(String jOB_ID) {
		JOB_ID = jOB_ID;
	}
	public Double getSALARY() {
		return SALARY;
	}
	public void setSALARY(Double sALARY) {
		SALARY = sALARY;
	}
	public Double getCOMMISSION_PCT() {
		return COMMISSION_PCT;
	}
	public void setCOMMISSION_PCT(Double cOMMISSION_PCT) {
		COMMISSION_PCT = cOMMISSION_PCT;
	}
	public Integer getMANAGER_ID() {
		return MANAGER_ID;
	}
	public void setMANAGER_ID(Integer mANAGER_ID) {
		MANAGER_ID = mANAGER_ID;
	}
	public Integer getDEPARTMENT_ID() {
		return DEPARTMENT_ID;
	}
	public void setDEPARTMENT_ID(Integer dEPARTMENT_ID) {
		DEPARTMENT_ID = dEPARTMENT_ID;
	}
	@Override
	public int hashCode() {
		return Objects.hash(COMMISSION_PCT, DEPARTMENT_ID, EMAIL, EMPLOYEE_ID, FIRST_NAME, HIRE_DATE, JOB_ID, LAST_NAME,
				MANAGER_ID, PHONE_NUMBER, SALARY);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeVO other = (EmployeeVO) obj;
		return Objects.equals(COMMISSION_PCT, other.COMMISSION_PCT)
				&& Objects.equals(DEPARTMENT_ID, other.DEPARTMENT_ID) && Objects.equals(EMAIL, other.EMAIL)
				&& Objects.equals(EMPLOYEE_ID, other.EMPLOYEE_ID) && Objects.equals(FIRST_NAME, other.FIRST_NAME)
				&& Objects.equals(HIRE_DATE, other.HIRE_DATE) && Objects.equals(JOB_ID, other.JOB_ID)
				&& Objects.equals(LAST_NAME, other.LAST_NAME) && Objects.equals(MANAGER_ID, other.MANAGER_ID)
				&& Objects.equals(PHONE_NUMBER, other.PHONE_NUMBER) && Objects.equals(SALARY, other.SALARY);
	}
	@Override
	public String toString() {
		return "EmployeeVO [EMPLOYEE_ID=" + EMPLOYEE_ID + ", FIRST_NAME=" + FIRST_NAME + ", LAST_NAME=" + LAST_NAME
				+ ", EMAIL=" + EMAIL + ", PHONE_NUMBER=" + PHONE_NUMBER + ", HIRE_DATE=" + HIRE_DATE + ", JOB_ID="
				+ JOB_ID + ", SALARY=" + SALARY + ", COMMISSION_PCT=" + COMMISSION_PCT + ", MANAGER_ID=" + MANAGER_ID
				+ ", DEPARTMENT_ID=" + DEPARTMENT_ID + "]";
	}
	
}