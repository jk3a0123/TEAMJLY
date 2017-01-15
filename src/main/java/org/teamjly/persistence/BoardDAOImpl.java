package org.teamjly.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.teamjly.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSession sqlSession;
	
	private final String NAME = "org.teamjly.mapper.BoardMapper.";

	@Override
	public void create(BoardVO vo) throws Exception {
		sqlSession.insert(NAME + "create", vo);
	}

	@Override
	public BoardVO read(Integer bno) throws Exception {
		return sqlSession.selectOne(NAME + "read", bno);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		sqlSession.update(NAME + "update", vo);
	}

	@Override
	public void delete(Integer bno) throws Exception {
		sqlSession.delete(NAME + "delete", bno);
	}

	@Override
	public List<BoardVO> list() throws Exception {
		return sqlSession.selectList(NAME + "list");
	}
	
	
	
}
