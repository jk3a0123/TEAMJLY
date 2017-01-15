package org.teamjly.web;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.teamjly.domain.MosaicVO;
import org.teamjly.persistence.MosaicDAO;
import org.teamjly.service.MosaicService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class MosaicDAOTest {

	@Inject
	private MosaicDAO mosaicDAO;
	
	@Inject
	private MosaicService mosaicService;
	
	
	@Test
	public void createTest() throws Exception{
		MosaicVO vo = new MosaicVO();
		vo.setBno(3);
		vo.setMosaicimage("test2");
		mosaicDAO.create(vo);
		System.out.println("Mosaic Create Test Success");
	}
	
	@Test
	public void readTest() throws Exception{
		System.out.println(mosaicDAO.read(1));
	}
	
	@Test
	public void updateTest() throws Exception{
		MosaicVO vo = new MosaicVO();
		vo.setIno(1);
		vo.setMosaicimage("test2");
		mosaicDAO.update(vo);
	}
	
	@Test
	public void deleteTest() throws Exception{
		mosaicDAO.delete(2);
	}
	
	@Test
	public void listTest() throws Exception{
		List<MosaicVO> list = mosaicDAO.list();
		for(int i = 0 ; i < list.size(); i++){
			System.out.println(list.get(i));
		}
	}
	
	
//--------------------- Mosaic Service Test ------------------------	
	
	@Test
	public void registerTest() throws Exception{
		MosaicVO vo = new MosaicVO();
		vo.setBno(3);
		vo.setMosaicimage("test5");
		mosaicService.register(vo);
	}
	
	@Test
	public void viewTest() throws Exception{
		System.out.println(mosaicService.view(3));
	}
	
	@Test
	public void modifyTest() throws Exception{
		MosaicVO vo = new MosaicVO();
		vo.setIno(3);
		vo.setMosaicimage("test4");
		mosaicService.modify(vo);
	}
	
	@Test
	public void removeTest() throws Exception{
		mosaicService.remove(1);
	}
	
	@Test
	public void getListTest() throws Exception{
		List<MosaicVO> list = mosaicService.getlist();
		for(int i = 0 ; i < list.size(); i ++){
			System.out.println(list.get(i));
		}
	}
	
	
}
