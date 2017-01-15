package org.teamjly.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.teamjly.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Inject
	private SqlSession sqlSession;
	
	private final String NAME = "org.teamjly.mapper.memberMapper.";
	@Override
	public List<MemberVO> list() throws Exception {
		
		return sqlSession.selectList(NAME+"list");
	}

	@Override
	public void create(MemberVO vo) throws Exception {
		sqlSession.insert(NAME+"create", vo);

	}

	@Override
	public MemberVO read(Integer mno) throws Exception {
		
		return sqlSession.selectOne(NAME+"read",mno);
	}

	@Override
	public void update(MemberVO vo) throws Exception {
		sqlSession.update(NAME+"update", vo);

	}

	@Override
	public void delete(Integer mno) throws Exception {
		sqlSession.delete(NAME+"delete",mno);

	}

}
