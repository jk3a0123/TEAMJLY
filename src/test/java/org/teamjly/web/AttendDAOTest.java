package org.teamjly.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.teamjly.domain.AttendVO;
import org.teamjly.persistence.AttendDAO;
import org.teamjly.service.AttendService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class AttendDAOTest {
	
	@Inject
	private AttendDAO dao;
	
	@Inject
	private AttendService service;
	
	@Test
	public void AttendlistTest() throws Exception{
		System.out.println(dao.list());
	}
	
	@Test
	public void AttendCreateTest() throws Exception{
		AttendVO vo = new AttendVO();
		vo.setBno(1);
		vo.setMno(1);
		dao.create(vo);
		System.out.println(vo);
		System.out.println(dao.list());
	}
	
	@Test
	public void AttendReadTest() throws Exception{
		System.out.println(dao.read(1));
		System.out.println(dao.list());
	}
	
	@Test
	public void AttendUpdateTest() throws Exception{
		AttendVO vo = new AttendVO();
		vo.setBno(2);
		vo.setMno(2);
		vo.setAno(1);
		dao.update(vo);
		System.out.println(vo);
		System.out.println(dao.list());
	}
	
	@Test
	public void AttendDeleteTest() throws Exception{

		dao.delete(1);
		System.out.println(dao.list());
		
	}
	//========================================================== Service ===================================================================//

	@Test
	public void AttendGetListTest() throws Exception{
		System.out.println(service.getList());
	}
	
	@Test
	public void AttendRegisterTest() throws Exception{
		AttendVO vo = new AttendVO();
		vo.setBno(1);
		vo.setMno(1);
		service.register(vo);
		System.out.println(service.getList());
	}
	
	@Test
	public void AttendViewTest() throws Exception{
		System.out.println(service.view(2));
	}
	
	@Test
	public void AttendModifyTest() throws Exception{
		AttendVO vo = new AttendVO();
		vo.setBno(3);
		vo.setMno(3);
		vo.setAno(2);
		service.modify(vo);
		System.out.println(service.getList());
	}
	
	@Test
	public void AttendRemoveTest() throws Exception{
		service.remove(2);
		System.out.println(service.getList());
	}
}
