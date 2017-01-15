package org.teamjly.persistence;

import java.util.List;

import org.teamjly.domain.MemberVO;

public interface MemberDAO {
	
	public List<MemberVO> list() throws Exception;
	
	public void create(MemberVO vo) throws Exception;
	
	public MemberVO read(Integer mno) throws Exception;
	
	public void update(MemberVO vo) throws Exception;
	
	public void delete(Integer mno) throws Exception;
}
