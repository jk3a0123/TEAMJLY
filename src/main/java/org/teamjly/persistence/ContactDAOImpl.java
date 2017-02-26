package org.teamjly.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.teamjly.domain.ContactVO;

@Repository
public class ContactDAOImpl implements ContactDAO{
	
	@Inject
	private SqlSession sqlSession;
	
	private final String NAME = "org.teamjly.mapper.contactMapper.";
	
	@Override
	public void create(ContactVO vo) throws Exception {
		sqlSession.insert(NAME+"create",vo);
		
	}

	@Override
	public ContactVO read(Integer cno) throws Exception {
		return sqlSession.selectOne(NAME+"read",cno);
	}

	@Override
	public void update(ContactVO vo) throws Exception {
		sqlSession.update(NAME+"update", vo);
	}

	@Override
	public void delete(Integer cno) throws Exception {
		sqlSession.delete(NAME+"delete",cno);
	}

	@Override
	public List<ContactVO> list() throws Exception {
		return sqlSession.selectList(NAME+"list");
	}
	
}
