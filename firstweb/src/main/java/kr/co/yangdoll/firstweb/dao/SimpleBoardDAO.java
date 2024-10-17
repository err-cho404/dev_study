package kr.co.yangdoll.firstweb.dao;

import java.sql.SQLException;
import java.util.List;

import kr.co.yangdoll.firstweb.vo.SimpleBoardVo;

public interface SimpleBoardDAO {
	// 테이블에 자료의 변경이 이루어지는 메서드들 : 반환되는 타입 int 
	int delete(long serNum)throws SQLException; //테이블의 자료 삭제
	int save(SimpleBoardVo vo)throws SQLException; //테이블에 자료를 저장
	int update(SimpleBoardVo vo)throws SQLException; //테이블의 자료 수정
	
	// 테이블의 자료 변경이 이루어지지 않고 자료의 내용을 읽어오는 메서드들
	int getCount() throws SQLException; //게시글의 개수를 읽어온다.
	SimpleBoardVo getBoardOne(long serNum)throws SQLException;
	List<SimpleBoardVo> getBoardPageList(int start, int end)throws SQLException;
	void updateReadCount(long serNum)throws SQLException;
	long getMaxNum()throws SQLException;
}
