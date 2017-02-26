package org.teamjly.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.teamjly.domain.NoticeVO;
@Repository
public class NoticeDAOImpl implements NoticeDAO{
	
	private String  NAME = "org.teamjly.mapper.NoticeMapper.";
	
	@Inject
	private SqlSession sqlSession; 
	

	@Override
	public void create(NoticeVO vo) throws Exception {
		sqlSession.insert(NAME + "create" , vo);
	}

	@Override
	public NoticeVO read(Integer nno) throws Exception {
		return sqlSession.selectOne(NAME + "read" , nno);
	}

	@Override
	public void update(NoticeVO vo) throws Exception {
		sqlSession.update(NAME + "update" , vo);	
	}

	@Override
	public void delete(Integer nno) throws Exception {
		sqlSession.delete(NAME + "delete" , nno);		
	}

	@Override
	public List<NoticeVO> getList() throws Exception {
		return sqlSession.selectList(NAME + "list");
	}

}
