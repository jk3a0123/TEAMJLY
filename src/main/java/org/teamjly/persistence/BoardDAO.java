package org.teamjly.persistence;

import java.util.List;

import org.teamjly.domain.BoardVO;

public interface BoardDAO {
	// C R U D List
	
	public void create(BoardVO vo) throws Exception;
	
	public BoardVO read(Integer bno) throws Exception;
	
	public void update(BoardVO vo) throws Exception;
	
	public void delete(Integer bno) throws Exception;
	
	public List<BoardVO> list() throws Exception;
	
}
