package refone.realexam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import refone.realexam.DbConUtil;
import refone.realexam.vo.MemberVo;

public class MemberDao {
   public int add(MemberVo vo) throws SQLException, ClassNotFoundException { // C : Create 작업 메서드 만듬
      int result = 0;
      String query = "insert into members values(?,?,?,?,?)";

      Class.forName("oracle.jdbc.driver.OracleDriver"); // DB연결 드라이버 로딩 <= DB연결 프로그램 실행
      Connection con = DbConUtil.getConnection(); // DB서버에
                                                                                          // 접속
      PreparedStatement pstmt = con.prepareStatement(query);
      pstmt.setString(1, vo.getMemId());
      pstmt.setString(2, vo.getPassword());
      pstmt.setString(3, vo.getiName());
      pstmt.setString(4, vo.getAddress());
      pstmt.setString(5, vo.getPhone());

      result = pstmt.executeUpdate();
      DbConUtil.resourceClose(pstmt,con);
      return result;
   }
   
   public int update(MemberVo vo) throws ClassNotFoundException, SQLException { // U : Update 작업 메서드 만듬
      int result = 0;
      String query = "update members SET iName = ?, address = ? WHERE memId = ?";
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con = DbConUtil.getConnection();
      PreparedStatement pstmt = con.prepareStatement(query);
      pstmt.setString(1, vo.getiName());
      pstmt.setString(2, vo.getAddress());
      pstmt.setString(3, vo.getMemId());

      result = pstmt.executeUpdate();
      DbConUtil.resourceClose(pstmt,con);
      return result;
   }
   
   public int delete(String memId) throws ClassNotFoundException, SQLException { // D : delete 작업 메서드 만듬
      int result = 0;
      String query = "delete from Members WHERE memId = ?";
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con = DbConUtil.getConnection();
      PreparedStatement pstmt = con.prepareStatement(query);
      pstmt.setString(1, memId);

      result = pstmt.executeUpdate();
      DbConUtil.resourceClose(pstmt,con);
      return result;
   }
}