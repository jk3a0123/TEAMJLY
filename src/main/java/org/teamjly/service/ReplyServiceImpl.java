package org.teamjly.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.teamjly.domain.ReplyVO;
import org.teamjly.persistence.ReplyDAO;

@Transactional
@Service
public class ReplyServiceImpl implements ReplyService {

	@Inject
	private ReplyDAO dao;
	
	
	@Override
	public void register(ReplyVO vo) {
		try{
			dao.create(vo);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	@Override
	public List<ReplyVO> view(Integer bno) {
		List<ReplyVO> list = null;
		try{
			list = dao.read(bno);
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void modify(ReplyVO vo) {
		try{
			dao.update(vo);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	@Override
	public void remove(Integer bno) {
		try{
			dao.delete(bno);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
