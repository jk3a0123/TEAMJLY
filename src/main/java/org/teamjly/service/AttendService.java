package org.teamjly.service;

import java.util.List;

import org.teamjly.domain.AttendVO;

public interface AttendService {
	
	public List<AttendVO> getList();
	
	public void register(AttendVO vo);
	
	public AttendVO view(Integer ano);
	
	public void modify(AttendVO vo);
	
	public void remove(Integer ano);
	
}
