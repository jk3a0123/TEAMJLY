package org.teamjly.web;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.teamjly.domain.NoticeVO;
import org.teamjly.persistence.NoticeDAO;
import org.teamjly.service.NoticeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class NoticeDAOServiceTest {
	
	@Inject
	NoticeDAO dao;
	
	@Inject
	NoticeService service;
	
	
	@Test
	public void createTest() throws Exception{
		
		NoticeVO vo = new NoticeVO();
		
		vo.setTitle("daoTest title");
		vo.setContent("daoTest content");
		vo.setMno(1);
		vo.setViews(0);
		
		dao.create(vo);

	}
	
	@Test
	public void readTest()throws Exception{
		System.out.println(dao.read(3));
		
	}
	
	@Test
	public void updateTest()throws Exception{
		NoticeVO vo = new NoticeVO();
		vo.setTitle("updateTest title");
		vo.setContent("updateTest content");
		vo.setMno(1);
		vo.setViews(1);
		vo.setNno(3);
		dao.update(vo);	
	}
	
	@Test
	public void deleteTest()throws Exception{
		dao.delete(3);
	}
	
	@Test
	public void ListTest() throws Exception{
		List<NoticeVO> list = dao.getList();
		for(int i = 0 ; i < list.size(); i++){
			System.out.println(list.get(i));
		}
	}
	
	
	// ---------------------- Service --------------------------
	
	@Test
	public void registerTest()throws Exception{
		NoticeVO vo = new NoticeVO();
		vo.setTitle("regTest title");
		vo.setContent("regTest content");
		vo.setMno(1);
		vo.setViews(0);
		service.register(vo);
	}
	
	@Test
	public void viewTest()throws Exception{
		System.out.println(service.view(5));
	}
	
	@Test
	public void modifyTest()throws Exception{
		NoticeVO vo = new NoticeVO();
		vo.setNno(5);
		vo.setTitle("regTest title1");
		vo.setContent("regTest content1");
		vo.setMno(1);
		vo.setViews(1);
		service.modify(vo);
	}
	
	@Test
	public void removeTest()throws Exception{
		service.remove(5);
	}
	
	

}
