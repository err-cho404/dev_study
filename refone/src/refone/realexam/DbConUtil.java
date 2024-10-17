package refone.realexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbConUtil {
	 public static Connection getConnection() {
		  Connection con = null;
		  try {
			  Class.forName("oracle.jdbc.driver.OracleDriver");
			  con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "id", "pwd");
			 
		  	} catch (ClassNotFoundException e) {
		  		e.printStackTrace();
		  	} catch (SQLException e) {
		  		e.printStackTrace();
		  	}
		return con;   
	   }
	   
	   // 사용한 자원을 반납(닫아주는 역할의 메서드)
	 public static void resourceClose(ResultSet rs, PreparedStatement pstmt, Connection con) {
		 if (rs != null) {try{ rs.close(); }catch (SQLException e) { e.printStackTrace();} }
		 if (pstmt != null) {try{ rs.close(); }catch (SQLException e) { e.printStackTrace();} }
		 if (con != null) {try{ rs.close(); }catch (SQLException e) { e.printStackTrace();} }
		 
	 }

	public static void resourceClose(PreparedStatement pstmt, Connection con) {
		// TODO Auto-generated method stub
		
	}
}
