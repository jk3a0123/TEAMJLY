package org.teamjly.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.teamjly.domain.MemberVO;
import org.teamjly.persistence.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Inject
	private MemberDAO dao;
	
	@Override
	public List<MemberVO> getListMember() {
		List<MemberVO> list = null;
		
		try {
			list = dao.list();
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public void register(MemberVO vo) {
		try {
			dao.create(vo);
			
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public MemberVO view(Integer mno) {
		
		MemberVO vo = null;
		
		try {
			vo = dao.read(mno);
		} catch (Exception e){
			e.printStackTrace();
		} 
		
		return vo;
	}

	@Override
	public void modify(MemberVO vo) {
		
		try{
			dao.update(vo);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public void remove(Integer mno) {
		
		try {
			dao.delete(mno);
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
}
