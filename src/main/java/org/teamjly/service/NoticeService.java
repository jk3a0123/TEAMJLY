package org.teamjly.service;

import java.util.List;

import org.teamjly.domain.NoticeVO;


public interface NoticeService {
	
	public void register(NoticeVO vo);
	
	public NoticeVO view(Integer nno);
	
	public void modify(NoticeVO vo);
	
	public void remove(Integer nno);
	
	public List<NoticeVO> getList();

}
