package org.teamjly.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.teamjly.domain.AttendVO;
import org.teamjly.persistence.AttendDAO;

@Service
public class AttendServiceImpl implements AttendService {
	
	@Inject
	private AttendDAO dao;
	
	@Override
	public List<AttendVO> getList() {
		List<AttendVO> list = null;
		
		try {
			list = dao.list();
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public void register(AttendVO vo) {
		try {
			dao.create(vo);
			
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public AttendVO view(Integer ano) {
		AttendVO vo = null;
		
		try {
			vo = dao.read(ano);
		} catch (Exception e){
			e.printStackTrace();
		} 
		
		return vo;
	}

	@Override
	public void modify(AttendVO vo) {
		try{
			dao.update(vo);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public void remove(Integer ano) {
		
		try {
			dao.delete(ano);
		} catch (Exception e){
			e.printStackTrace();
		}
	}

}
