package org.teamjly.service;

import java.util.List;

import org.teamjly.domain.BoardVO;

public interface BoardService {

	public void register(BoardVO vo);
	
	public BoardVO view(Integer bno);
	
	public void modify(BoardVO vo);
	
	public void remove(Integer bno);
	
	public List<BoardVO> getlist();
	
	
}
