package org.teamjly.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.teamjly.domain.AttendVO;
@Repository
public class AttendDAOImpl implements AttendDAO {
	
	@Inject
	private SqlSession sqlSession;
	
	private final String NAME = "org.teamjly.mapper.attendMapper.";
	@Override
	public List<AttendVO> list() throws Exception {
		
		return sqlSession.selectList(NAME+"list");
	}

	@Override
	public void create(AttendVO vo) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(NAME+"create", vo);
	}

	@Override
	public AttendVO read(Integer ano) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAME+"read",ano);
	}

	@Override
	public void update(AttendVO vo) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update(NAME+"update", vo);
	}

	@Override
	public void delete(Integer ano) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.delete(NAME+"delete",ano);
	}

}
