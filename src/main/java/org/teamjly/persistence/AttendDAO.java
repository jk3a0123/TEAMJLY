package org.teamjly.persistence;

import java.util.List;

import org.teamjly.domain.AttendVO;

public interface AttendDAO {
	
public List<AttendVO> list() throws Exception;
	
	public void create(AttendVO vo) throws Exception;
	
	public AttendVO read(Integer ano) throws Exception;
	
	public void update(AttendVO vo) throws Exception;
	
	public void delete(Integer ano) throws Exception;
}
