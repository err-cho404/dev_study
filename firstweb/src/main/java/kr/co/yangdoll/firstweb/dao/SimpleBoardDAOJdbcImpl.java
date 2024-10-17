package kr.co.yangdoll.firstweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.yangdoll.firstweb.DbConUtil;
import kr.co.yangdoll.firstweb.vo.SimpleBoardVo;

public class SimpleBoardDAOJdbcImpl implements SimpleBoardDAO{

	//필요한 자원 Connection, PreparedStatement, ResultSet필요하다.
	// Connection, PreparedStatement 자원은 테이블에 변경이 일어나는 곳에서 필요
	//  Connection, PreparedStatement, ResultSet자원은 변경이 일어나지 않는 읽기 에서 필요
	// 반드시 사용한 자원은 close로 닫아줘야 한다. 사용의 역순으로
	@Override
	public int delete(long serNum) throws SQLException {
		int result = 0;
		Connection  con = DbConUtil.getConnection();
		PreparedStatement pstmt = con.prepareStatement("delete from simpleboards where serNum = ?");
		pstmt.setLong(1, serNum);
		
		result = pstmt.executeUpdate();
		
		DbConUtil.resourceClose(pstmt, con);
		return result;
	}

	@Override
	public int save(SimpleBoardVo vo) throws SQLException {
		int result = 0;
		Connection  con = DbConUtil.getConnection();
		PreparedStatement pstmt = 
			con.prepareStatement("insert into simpleboards values(?, ?, ?, ? ,? ,0 ,sysdate)");
		pstmt.setLong(1, vo.getSerNum());
		pstmt.setString(2, vo.getTitle());
		pstmt.setString(3, vo.getContents());
		pstmt.setString(4, vo.getIrum());
		pstmt.setString(5, vo.getPassword());
		
		result = pstmt.executeUpdate();
		
		DbConUtil.resourceClose(pstmt, con);
		return result;
	}

	@Override
	public int update(SimpleBoardVo vo) throws SQLException {
		int result = 0;
		Connection  con = DbConUtil.getConnection();
		PreparedStatement pstmt = 
			con.prepareStatement("update simpleboards set  title= ?, contents = ?, password = ?   where serNum = ?");
		pstmt.setLong(4, vo.getSerNum());
		pstmt.setString(1, vo.getTitle());
		pstmt.setString(2, vo.getContents());
		pstmt.setString(3, vo.getPassword());
		
		result = pstmt.executeUpdate();
		
		DbConUtil.resourceClose(pstmt, con);
		return result;
	}
	
	@Override
	public void updateReadCount(long serNum) throws SQLException {
		Connection  con = DbConUtil.getConnection();
		PreparedStatement pstmt = 
			con.prepareStatement("update simpleboards set  readCount = readCount + 1   where serNum = ?");
		pstmt.setLong(1, serNum);
		
		pstmt.executeUpdate();
		
		DbConUtil.resourceClose(pstmt, con);
	}

	@Override
	public int getCount() throws SQLException {
		int result = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs =  null;
		con = DbConUtil.getConnection();
		pstmt = con.prepareStatement("select count(*) from simpleboards");
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			result = rs.getInt(1);
		}
		
		DbConUtil.resourceClose(rs, pstmt, con);
		return result;
	}

	@Override
	public SimpleBoardVo getBoardOne(long serNum) throws SQLException {
		SimpleBoardVo boardVo = null;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs =  null;
		con = DbConUtil.getConnection();
		pstmt = con.prepareStatement("select * from simpleboards where serNum = ?");
		pstmt.setLong(1, serNum);
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			boardVo = new SimpleBoardVo();
			boardVo.setSerNum( rs.getInt("serNum")  );
			boardVo.setTitle( rs.getString("title")  );
			boardVo.setContents( rs.getString("contents")  );
			boardVo.setIrum( rs.getString("irum") );   ;
			boardVo.setPassword( rs.getString("password")  );
			boardVo.setReadCount( rs.getInt("readCount") );
			boardVo.setRegiDate( rs.getString("regiDate")  );

		}
		
		DbConUtil.resourceClose(rs, pstmt, con);
		return boardVo;
	}

	@Override
	public List<SimpleBoardVo> getBoardPageList(int start, int end) throws SQLException {
		List<SimpleBoardVo> list = new ArrayList<SimpleBoardVo>();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs =  null;
		con = DbConUtil.getConnection();
		pstmt = con.prepareStatement("select * from  (select rownum num, imsi.* from   (select *   from simpleboards   order by  serNum desc ) imsi) where num >= ? and num <= ?");
		pstmt.setInt(1, start);
		pstmt.setInt(2, end);
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			SimpleBoardVo boardVo = new SimpleBoardVo();
			boardVo.setSerNum( rs.getInt("serNum")  );
			boardVo.setTitle( rs.getString("title")  );
			boardVo.setContents( rs.getString("contents")  );
			boardVo.setIrum( rs.getString("irum") );   ;
			boardVo.setPassword( rs.getString("password")  );
			boardVo.setReadCount( rs.getInt("readCount") );
			boardVo.setRegiDate( rs.getString("regiDate")  );
			list.add(boardVo);
		}
		
		DbConUtil.resourceClose(rs, pstmt, con);
		return list;
	}

	@Override
	public long getMaxNum() throws SQLException {
		long result = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs =  null;
		con = DbConUtil.getConnection();
		pstmt = con.prepareStatement("select max(serNum) from simpleboards");
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			result = rs.getInt(1);
		}
		
		DbConUtil.resourceClose(rs, pstmt, con);
		return result;
	}

	

}
