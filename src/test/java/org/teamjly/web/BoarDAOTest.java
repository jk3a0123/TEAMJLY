package org.teamjly.web;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.teamjly.domain.BoardVO;
import org.teamjly.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class BoarDAOTest {

	@Inject
	private BoardDAO boardDAO;
	
	@Test
	public void createTest() throws Exception {
		BoardVO vo = new BoardVO();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
		vo.setTitle("test1");
		vo.setWriter("test1");
		vo.setOpendate(dateFormat.parse("2017-01-15 17:00:05"));
		vo.setClosedate(dateFormat.parse("2017-01-15 17:00:05"));
		vo.setBoardimage("test1");
		boardDAO.create(vo);
//		'test','test', '2017-01-15 17:00:00', '2017-01-15 17:00:00', 'test'
	}
	
	
}
