package refone.realexam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import refone.realexam.DbConUtil;
import refone.realexam.vo.MemberVo;

public class MemberRefactDao implements MemberDaoInter{
	public int add(MemberVo vo) throws SQLException { // C : Create 작업 메서드 만듬
		int result = 0;
		String query = "insert into members values(?,?,?,?,?)";
		Connection con = DbConUtil.getConnection();

		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setString(1, vo.getMemId());
		pstmt.setString(2, vo.getPassword());
		pstmt.setString(3, vo.getiName());
		pstmt.setString(4, vo.getAddress());
		pstmt.setString(5, vo.getPhone());

		result = pstmt.executeUpdate();
		DbConUtil.resourceClose(null, pstmt, con);
		return result;
	}

	public int update(MemberVo vo) throws SQLException { // U : Update 작업 메서드 만듬
		int result = 0;
		String query = "update members SET iName = ?, address = ? WHERE memId = ?";
		Connection con = DbConUtil.getConnection();

		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setString(1, vo.getiName());
		pstmt.setString(2, vo.getAddress());
		pstmt.setString(3, vo.getMemId());

		result = pstmt.executeUpdate();
		DbConUtil.resourceClose(null, pstmt, con);
		return result;
	}

	public int delete(String memId) throws SQLException { // D : delete 작업 메서드 만듬
		int result = 0;
		String query = "delete from Members WHERE memId = ?";
		Connection con = DbConUtil.getConnection();

		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setString(1, memId);

		result = pstmt.executeUpdate();

		DbConUtil.resourceClose(null, pstmt, con);
		return result;
	}

	public int getCount() throws SQLException {
		int result = 0;
		String query = "select count(*) numCount from members";
		ResultSet rs = null;
		Connection con = DbConUtil.getConnection();
		PreparedStatement pstmt = con.prepareStatement(query);
		rs = pstmt.executeQuery();
		while (rs.next()) {
			result = rs.getInt("numCount");
		}

		DbConUtil.resourceClose(rs, pstmt, con);
		return result;

	}

	public List<MemberVo> getListAll() throws SQLException {
		List<MemberVo> list = new ArrayList<MemberVo>();
		String query = "select * from members";
		ResultSet rs = null;
		Connection con = DbConUtil.getConnection();
		PreparedStatement pstmt = con.prepareStatement(query);
		rs = pstmt.executeQuery();
		while (rs.next()) {
			MemberVo vo = new MemberVo();
			vo.setMemId(rs.getString("memid")/*1열(memid)의 데이터자료를 가져온다*/); //vo에 넣어준다
			vo.setPassword(rs.getString("password"));
			vo.setiName(rs.getString("iName"));
			vo.setAddress(rs.getString("address"));
			vo.setPhone(rs.getString("phone"));
			list.add(vo);
		}
		DbConUtil.resourceClose(rs, pstmt, con);
		return list;
	}
	public MemberVo getOne(String memId) throws SQLException {
		MemberVo vo = new MemberVo();
		String query = "select * from members where memid = ?";
		ResultSet rs = null;
		Connection con = DbConUtil.getConnection();
		PreparedStatement pstmt = con.prepareStatement(query);
		rs = pstmt.executeQuery();
		while (rs.next()) {
			vo.setMemId(rs.getString("memid")/*1열(memid)의 데이터자료를 가져온다*/); //vo에 넣어준다
			vo.setPassword(rs.getString("password"));
			vo.setiName(rs.getString("iName"));
			vo.setAddress(rs.getString("address"));
			vo.setPhone(rs.getString("phone"));
		}

	DbConUtil.resourceClose(rs, pstmt, con);
	return vo;

	}
	public List<MemberVo> getAddressList(String memid) throws SQLException {
		List<MemberVo> list = new ArrayList<MemberVo>();
		String query = "select * from members where address = ?";
		ResultSet rs = null;
		Connection con = DbConUtil.getConnection();
		PreparedStatement pstmt = con.prepareStatement(query);
		
		pstmt.setString(1, memid); //원하는 명단을 가져옴
		
		rs = pstmt.executeQuery();
		
		while (rs.next()) {
			MemberVo vo = new MemberVo();
			vo.setMemId(rs.getString("memid")/*1열(memid)의 데이터자료를 가져온다*/); //vo에 넣어준다
			vo.setPassword(rs.getString("password"));
			vo.setiName(rs.getString("iName"));
			vo.setAddress(rs.getString("address"));
			vo.setPhone(rs.getString("phone"));
			list.add(vo);
		}
		DbConUtil.resourceClose(rs, pstmt, con);
		return list;
	}
}