package org.teamjly.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.teamjly.domain.ReplyVO;
import org.teamjly.domain.ReplyVO;
import org.teamjly.persistence.ReplyDAO;
import org.teamjly.service.ReplyService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class ReplyDAOServiceTest {
	
	@Inject
	ReplyDAO dao;
	
	@Inject
	ReplyService service;
	
	@Test
	public void createTest() throws Exception{
		
		ReplyVO vo = new ReplyVO();
		
		vo.setBno(3);
		vo.setMno(1);
		vo.setContent("daoTest hello");
		
		dao.create(vo);

	}
	
	@Test
	public void readTest()throws Exception{
		System.out.println(dao.read(3));
		
	}
	
	@Test
	public void updateTest()throws Exception{
			ReplyVO vo = new ReplyVO();
			vo.setContent("update Test hello");
			vo.setBno(3);
			vo.setMno(1);
			vo.setRno(3);
			dao.update(vo);
	}
	
	@Test
	public void deleteTest()throws Exception{
		dao.delete(3);
	}

	// ----------------service --------------------
	
	@Test
	public void registerTest()throws Exception{
		ReplyVO vo = new ReplyVO();
		vo.setBno(3);
		vo.setMno(1);
		vo.setContent("regTest content");
		service.register(vo);
	}
	
	@Test
	public void viewTest()throws Exception{
		System.out.println(service.view(3));
	}
	
	@Test
	public void modifyTest()throws Exception{
		ReplyVO vo = new ReplyVO();
		vo.setRno(4);
		vo.setContent("modifyTest content");
		vo.setMno(1);
		vo.setBno(3);
		service.modify(vo);

	}
	
	@Test
	public void removeTest()throws Exception{
		service.remove(3);
	}
	

}
