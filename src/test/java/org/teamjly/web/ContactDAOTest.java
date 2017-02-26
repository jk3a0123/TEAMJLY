package org.teamjly.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.teamjly.persistence.ContactDAO;
import org.teamjly.service.ContactService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class ContactDAOTest {
	
	@Inject
	private ContactDAO dao;
	
	@Inject
	private ContactService service;
	
	@Test
	public void ContactlistTest() throws Exception{
		System.out.println(dao.list());
	}
	
	//=================================== Service ===========================
	
	@Test
	public void getContactlistTest() throws Exception{
		System.out.println(service.getContactList());
	}
	
	
	
}
