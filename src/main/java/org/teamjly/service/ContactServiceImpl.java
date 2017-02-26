package org.teamjly.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.teamjly.domain.ContactVO;
import org.teamjly.persistence.ContactDAO;

@Service
public class ContactServiceImpl implements ContactService{
	
	@Inject
	private ContactDAO dao;
	
	@Override
	public List<ContactVO> getContactList() {
		List<ContactVO> list = null;
		
		try{
			list = dao.list();
		}catch (Exception e){
			e.printStackTrace();
		}
		return list;
		
	}

	@Override
	public void register(ContactVO vo) {
		try{
			dao.create(vo);
		} catch(Exception e){
			e.printStackTrace();
		}
		
	}

	@Override
	public ContactVO view(Integer cno) {
		ContactVO vo = null;
		
		try{
			vo = dao.read(cno);
		} catch(Exception e){
			e.printStackTrace();
		}
		return vo;
	}

	@Override
	public void Modify(ContactVO vo) {

		try{
			dao.update(vo);
		} catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public void remove(Integer cno) {

		try{
			dao.delete(cno);
		}catch (Exception e){
			e.printStackTrace();
		}
	}


	@Override
	public List<ContactVO> getContactMemberList(Integer mno) {
		List<ContactVO> list = null;
		
		try{
			list = dao.memberlist(mno);
		}catch (Exception e){
			e.printStackTrace();
		}
		return list;
		
	}
	
	
}
