package refone.realexam.dao;

import java.util.List;

import refone.realexam.vo.PracticeVo;

public interface PracticeDaoInter {
	int add(PracticeVo vo);
	int update(PracticeVo vo);
	int delete(String memberCode);
	int getCount();
	List<PracticeVo> getListAll();
	PracticeVo getOne(String memberCode);
	List<PracticeVo> getTeamList(String team);
}
