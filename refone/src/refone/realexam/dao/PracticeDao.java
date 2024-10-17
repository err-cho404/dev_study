package refone.realexam.dao;

import java.sql.PreparedStatement;
import java.util.List;

import refone.realexam.vo.PracticeVo;

public class PracticeDao implements PracticeDaoInter {
	public int add(PracticeVo vo) {
		int result = 0;
		String query = "insert into officemember values (?,?,?,?,?)";
		
		PreparedStatement pstmt = con.preparedStatemet(query);
		pstmt.setString(1,vo.getCode());
		pstmt.setString(2,vo.getmName());
		pstmt.setString(3,vo.getBirth());
		pstmt.setString(4,vo.getPhone());
		pstmt.setString(5,vo.getTeam());
		
		result = pstmt.executeUpdate();
		DatabaseConUtil.resourceClose(null,pstmt,con)
		
		return 0;
	}

	@Override
	public int update(PracticeVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String memberCode) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<PracticeVo> getListAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PracticeVo getOne(String memberCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PracticeVo> getTeamList(String team) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
