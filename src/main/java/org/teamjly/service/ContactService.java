package org.teamjly.service;

import java.util.List;

import org.teamjly.domain.ContactVO;

public interface ContactService {
	
	public List<ContactVO> getContactList();
	
	public void register(ContactVO vo);
	
	public ContactVO view(Integer cno);
	
	public void Modify(ContactVO vo);
	
	public void remove(Integer cno);
}
