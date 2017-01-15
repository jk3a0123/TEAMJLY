package org.teamjly.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.teamjly.domain.MosaicVO;

@Repository
public class MosaicDAOImpl implements MosaicDAO {

	@Inject
	private SqlSession sqlSession;
	
	private final String NAME = "org.teamjly.mapper.MosaicMapper.";
	
	@Override
	public void create(MosaicVO vo) throws Exception {
		sqlSession.insert(NAME + "create", vo);
	}

	@Override
	public MosaicVO read(Integer ino) throws Exception {
		return sqlSession.selectOne(NAME + "read", ino);
	}

	@Override
	public void update(MosaicVO vo) throws Exception {
		sqlSession.update(NAME + "update", vo);
	}

	@Override
	public void delete(Integer ino) throws Exception {
		sqlSession.delete(NAME + "delete", ino);
	}

	@Override
	public List<MosaicVO> list() throws Exception {
		return sqlSession.selectList(NAME + "list");
	}

}
