package org.teamjly.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.teamjly.domain.MemberVO;
import org.teamjly.persistence.MemberDAO;
import org.teamjly.service.MemberServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class MemberDAOTest {
	
	@Inject
	private MemberDAO dao;
	
	@Inject
	private MemberServiceImpl service;
	@Test
	public void MemberlistTest() throws Exception{
		System.out.println(dao.list());
	}
	
	@Test
	public void MemberCreateTest() throws Exception{
		MemberVO vo = new MemberVO();
		vo.setId("난테스트");
		vo.setPassword("password");
		vo.setNickname("난닉네임");
		vo.setProfile_image("난 이미지");
		
		dao.create(vo);
		System.out.println(vo);
	}
	
	@Test
	public void MemberReadTest() throws Exception{
		System.out.println(dao.read(2));
	}
	
	@Test
	public void MemberUpdateTest() throws Exception{
		MemberVO vo = new MemberVO();
		vo.setPassword("password2");
		vo.setNickname("난닉네임2");
		vo.setProfile_image("난 이미지2");
		vo.setMno(2);
		
		dao.update(vo);
		System.out.println(vo);
	}
	
	@Test
	public void MemberDeleteTest() throws Exception{

		dao.delete(1);
		System.out.println(dao.list());
	}
	
	//========================================================== Service ===================================================================//
	
	@Test
	public void MemberGetListTest() throws Exception{
		System.out.println(service.getListMember());
	}
	
	@Test
	public void MemberRegisterTest() throws Exception{
		MemberVO vo = new MemberVO();
		vo.setId("난테스트");
		vo.setPassword("password");
		vo.setNickname("난닉네임");
		vo.setProfile_image("난 이미지");
		
		service.register(vo);
		System.out.println(vo);
		System.out.println(service.getListMember());
	}
	
	@Test
	public void MemberViewTest() throws Exception{
		System.out.println(service.view(3));
		System.out.println(service.getListMember());
	}
	
	@Test
	public void MemberModifyTest() throws Exception{
		MemberVO vo = new MemberVO();
		vo.setPassword("password2");
		vo.setNickname("난닉네임2");
		vo.setProfile_image("난 이미지2");
		vo.setMno(3);
		
		service.modify(vo);
		System.out.println(vo);
		System.out.println(service.getListMember());
	}
	
	@Test
	public void MemberRemoveTest() throws Exception{
		
		service.remove(3);
		System.out.println(dao.list());
	}
}
