package com.yangdoll.empma.dao;

import java.sql.SQLException;

import com.yangdoll.empma.vo.EmployeeVO;

public interface EmployeeDAO {
	//Employees 테이블에 넘겨받은 자료를 저장 (insert)
	public int add(EmployeeVO vo)throws SQLException;
	
}
	