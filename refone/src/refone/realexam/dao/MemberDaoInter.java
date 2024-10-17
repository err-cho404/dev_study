package refone.realexam.dao;

import java.sql.SQLException;
import java.util.List;

import refone.realexam.vo.MemberVo;

public interface MemberDaoInter {
	int add(MemberVo vo) throws SQLException;
	int update(MemberVo vo) throws SQLException;
	int delete(String memId) throws SQLException;
	int getCount() throws SQLException;
	List<MemberVo> getListAll() throws SQLException;
	MemberVo getOne(String memId) throws SQLException;
	List<MemberVo> getAddressList(String memid) throws SQLException;
}
