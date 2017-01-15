package org.teamjly.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.teamjly.domain.ReplyVO;

@Repository
public class ReplyDAOImpl implements ReplyDAO {
	
	private String  NAME = "org.teamjly.mapper.ReplyMapper.";
	
	@Inject
	private SqlSession sqlSession; 
	

	@Override
	public void create(ReplyVO vo) throws Exception {
		sqlSession.insert(NAME + "create" , vo);

	}

	@Override
	public List<ReplyVO> read(Integer bno) throws Exception {
		return sqlSession.selectList(NAME + "read" , bno);
	}

	@Override
	public void update(ReplyVO vo) throws Exception {
		sqlSession.update(NAME + "update" , vo);

	}

	@Override
	public void delete(Integer bno) throws Exception {
		sqlSession.delete(NAME+"delete" , bno);

	}

}
