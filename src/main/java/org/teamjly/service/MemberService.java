package org.teamjly.service;

import java.util.List;

import org.teamjly.domain.MemberVO;

public interface MemberService {
	
	public List<MemberVO> getListMember();
	
	public void register(MemberVO vo);
	
	public MemberVO view(Integer mno);
	
	public void modify(MemberVO vo);
	
	public void remove(Integer mno);
	
}
