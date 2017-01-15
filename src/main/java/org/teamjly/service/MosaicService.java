package org.teamjly.service;

import java.util.List;

import org.teamjly.domain.MosaicVO;

public interface MosaicService {

	public void register(MosaicVO vo);
	
	public MosaicVO view(Integer ino);
	
	public void modify(MosaicVO vo);
	
	public void remove(Integer ino);
	
	public List<MosaicVO> getlist();
	
}
