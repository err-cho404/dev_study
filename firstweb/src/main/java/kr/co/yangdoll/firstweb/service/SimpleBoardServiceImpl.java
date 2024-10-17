package kr.co.yangdoll.firstweb.service;

import java.sql.SQLException;
import java.util.List;

import kr.co.yangdoll.firstweb.dao.SimpleBoardDAO;
import kr.co.yangdoll.firstweb.dao.SimpleBoardDAOJdbcImpl;
import kr.co.yangdoll.firstweb.vo.SimpleBoardVo;

public class SimpleBoardServiceImpl implements SimpleBoardService{
	public SimpleBoardDAO dao;

	public SimpleBoardServiceImpl() {
		dao = new SimpleBoardDAOJdbcImpl();
	}
	
	public SimpleBoardServiceImpl(SimpleBoardDAO dao ) {
		this.dao = dao;
	}
	
	public int delete(long serNum)throws SQLException{
		return dao.delete(serNum);
	}
	public int save(SimpleBoardVo vo)throws SQLException{
		long maxNum = dao.getMaxNum();
		vo.setSerNum(maxNum+1);
		return dao.save(vo);
	}
	public int update(SimpleBoardVo vo)throws SQLException{
		return dao.update(vo);
	}


	public int getCount() throws SQLException{
		int result = 0;
		result = dao.getCount();
		//반환된 값을 가지고 후행작업을 할 수도 있다.
		return result;
	}
	public SimpleBoardVo getBoardOne(long serNum)throws SQLException{
		dao.updateReadCount(serNum);
		return dao.getBoardOne(serNum);
		
	}
	public List<SimpleBoardVo> getBoardPageList(int page, int limit)throws SQLException{
		List<SimpleBoardVo> list = null;
		//선행작업
		int end = page * limit;
		int start = end - limit + 1; //2
		list = dao.getBoardPageList(start, end);
		return list;
	}
}
