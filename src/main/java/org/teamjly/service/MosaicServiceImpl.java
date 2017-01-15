package org.teamjly.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.teamjly.domain.MosaicVO;
import org.teamjly.persistence.MosaicDAO;

@Service
public class MosaicServiceImpl implements MosaicService {

	@Inject
	private MosaicDAO mosaicDAO;
	
	@Override
	public void register(MosaicVO vo) {
		try {
			mosaicDAO.create(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public MosaicVO view(Integer ino) {
		MosaicVO result = null;
		try {
			result = mosaicDAO.read(ino);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public void modify(MosaicVO vo) {
		try {
			mosaicDAO.update(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void remove(Integer ino) {
		try {
			mosaicDAO.delete(ino);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<MosaicVO> getlist() {
		List<MosaicVO> result = null;
		try {
			result = mosaicDAO.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
