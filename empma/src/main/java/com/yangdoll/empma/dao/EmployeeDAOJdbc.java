package com.yangdoll.empma.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.yangdoll.empma.DbConUtil;
import com.yangdoll.empma.vo.EmployeeVO;

public class EmployeeDAOJdbc implements EmployeeDAO{
	public int add(EmployeeVO vo)throws SQLException{
		int result = 0;
		Connection  con = DbConUtil.getConnection();
		PreparedStatement pstmt = 
			con.prepareStatement("insert into employees values(?, ?, ?, ? ,? ,sysdate,?,?,?,?,?)");
		pstmt.setInt(1, vo.getEMPLOYEE_ID());
		pstmt.setString(2, vo.getFIRST_NAME());
		pstmt.setString(3, vo.getLAST_NAME());
		pstmt.setString(4, vo.getEMAIL());
		pstmt.setString(5, vo.getPHONE_NUMBER());
		pstmt.setString(6, vo.getJOB_ID());
		pstmt.setDouble(7, vo.getSALARY());

	 	if( vo.getCOMMISSION_PCT() == null){
	 		pstmt.setString(8, null);
	 	}else{
	 		pstmt.setDouble(8,vo.getCOMMISSION_PCT());
	 	}
	 	if ( vo.getMANAGER_ID() == null){
	 		pstmt.setString(9, null);
	 	}else{
	 		pstmt.setDouble(9,vo.getMANAGER_ID());
	 	}
	 	if (vo.getDEPARTMENT_ID() != null ){
	 		pstmt.setDouble(10, vo.getDEPARTMENT_ID());
	 	}else{
	 		pstmt.setString(10,null);
	 	}
	 	
	 	result = pstmt.executeUpdate();
		
		DbConUtil.resourceClose(pstmt, con);
		return result;
		}
}
