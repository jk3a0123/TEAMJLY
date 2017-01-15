package org.teamjly.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.teamjly.domain.NoticeVO;
import org.teamjly.persistence.NoticeDAO;

@Service
public class NoticeServiceImpl implements NoticeService {
	
	
	@Inject
	private NoticeDAO dao;
	

	@Override
	public void register(NoticeVO vo) {
		try{
			dao.create(vo);
		}catch(Exception e){
			e.printStackTrace();		
		}
	}

	@Override
	public NoticeVO view(Integer nno) {
		NoticeVO vo = null;
		try{
			vo = dao.read(nno);
		}catch(Exception e){
			e.printStackTrace();
		}
		return vo;
	}

	@Override
	public void modify(NoticeVO vo) {
		try{
			dao.update(vo);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public void remove(Integer nno) {
		try{
			dao.delete(nno);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public List<NoticeVO> getList() {
		List<NoticeVO> list = null;
		try{
			list = dao.getList();
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}

}
