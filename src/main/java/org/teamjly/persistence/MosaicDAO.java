package org.teamjly.persistence;

import java.util.List;

import org.teamjly.domain.MosaicVO;

public interface MosaicDAO {
	// C R U D List
	
	public void create(MosaicVO vo) throws Exception;
	
	public MosaicVO read(Integer ino) throws Exception;

	public void update(MosaicVO vo) throws Exception;
	
	public void delete(Integer ino) throws Exception;
	
	public List<MosaicVO> list() throws Exception;
	
}
