package org.teamjly.service;


import java.util.List;

import org.teamjly.domain.ReplyVO;


public interface ReplyService {
	
	public void register(ReplyVO vo);
	
	public List<ReplyVO> view (Integer bno);
	
	public void modify(ReplyVO vo);
	
	public void remove(Integer bno);
	
	

}
