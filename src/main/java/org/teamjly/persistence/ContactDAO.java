package org.teamjly.persistence;

import java.util.List;

import org.teamjly.domain.ContactVO;

public interface ContactDAO {
	
	public void create(ContactVO vo) throws Exception;
	
	public ContactVO read(Integer cno) throws Exception;
	
	public void update(ContactVO vo) throws Exception;
	
	public void delete(Integer cno) throws Exception;
	
	public List<ContactVO> list() throws Exception;
}
