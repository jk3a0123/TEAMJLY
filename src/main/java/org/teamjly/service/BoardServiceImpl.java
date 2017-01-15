package org.teamjly.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.teamjly.domain.BoardVO;
import org.teamjly.persistence.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	BoardDAO boardDAO;
	
	@Override
	public void register(BoardVO vo){
		try {
			boardDAO.create(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public BoardVO view(Integer bno){
		BoardVO vo = new BoardVO();
		try {
			vo = boardDAO.read(bno);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}

	@Override
	public void modify(BoardVO vo){
		try {
			boardDAO.update(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void remove(Integer bno){
		try {
			boardDAO.delete(bno);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<BoardVO> getlist(){
		List<BoardVO> result = null;
		try {
			result = boardDAO.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
