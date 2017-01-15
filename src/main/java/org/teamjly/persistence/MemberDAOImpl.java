package org.teamjly.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.teamjly.domain.MemberVO;

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
		// TODO Auto-generated method stub

	}

	@Override
	public MemberVO read(Integer mno) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub

	}

}
