package kr.co.yangdoll.firstweb.service;

import java.sql.SQLException;
import java.util.List;

import kr.co.yangdoll.firstweb.vo.SimpleBoardVo;

public interface SimpleBoardService {
	public int delete(long serNum)throws SQLException;
	public int save(SimpleBoardVo vo)throws SQLException;
	public int update(SimpleBoardVo vo)throws SQLException;
	
	
	public int getCount() throws SQLException;
	public SimpleBoardVo getBoardOne(long serNum)throws SQLException;
	public List<SimpleBoardVo> getBoardPageList(int  start, int end)throws SQLException;
}
