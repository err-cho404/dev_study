package com.yangdoll.empma;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbConUtil {
   // DB 연결을 담당하는 메서드(모든 메서드에서 공통적으로 들어가야 하기 때문에 분리)
   public static Connection getConnection() {
      Connection con = null;
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         con =  DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "userone", "userone");
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      } catch (SQLException e) {
         e.printStackTrace();
      }
      
      return con;
   }
      
   //자원을 반납(닫아주는) 역할의 메서드
   public static void resourceClose(ResultSet rs, PreparedStatement pstmt, Connection con) {
      if( rs != null) { try { rs.close(); } catch (SQLException e) {e.printStackTrace();}}
      if( pstmt != null) { try { pstmt.close(); } catch (SQLException e) {e.printStackTrace();}}
      if( con != null) { try { con.close(); } catch (SQLException e) {e.printStackTrace();}}
   }

   public static void resourceClose(PreparedStatement pstmt, Connection con) {
      if( pstmt != null) { try { pstmt.close(); } catch (SQLException e) {e.printStackTrace();}}
      if( con != null) { try { con.close(); } catch (SQLException e) {e.printStackTrace();}}
   }
}