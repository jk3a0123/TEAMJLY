package org.teamjly.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.teamjly.domain.ReplyVO;


public interface ReplyDAO {
	
	public void create(ReplyVO vo) throws Exception;
	
	public List<ReplyVO> read(Integer bno) throws Exception;
	
	public void update(ReplyVO vo) throws Exception;
	
	public void delete(Integer bno )throws Exception;
	
}
