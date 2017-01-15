package org.teamjly.web;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.teamjly.domain.BoardVO;
import org.teamjly.persistence.BoardDAO;
import org.teamjly.service.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class BoardDAOTest {

	@Inject
	private BoardDAO boardDAO;
	
	@Inject
	private BoardService boardService;
	
	@Test
	public void createTest() throws Exception{
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
	
	@Test
	public void readTest() throws Exception{
		System.out.println(boardDAO.read(1));
	}
	
	@Test
	public void updateTest() throws Exception{
		BoardVO vo = new BoardVO();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
		vo.setBno(1);
		vo.setUpdatedate(dateFormat.parse("2017-01-15 18:10:00"));
		boardDAO.update(vo);
		System.out.println("Update Test Success");
	}
	
	@Test
	public void deleteTest() throws Exception{
		boardDAO.delete(2);
		System.out.println("Delete Success");
	}
	
	@Test
	public void listTest() throws Exception{
		List<BoardVO> list = boardDAO.list();
		for(int i = 0 ; i < list.size(); i++){
			System.out.println(list.get(i));
		}
	}
	
	
//	---------------------Service Test--------------------------------
	
	@Test
	public void registerTest() throws Exception{
		BoardVO vo = new BoardVO();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
		vo.setTitle("test3");
		vo.setWriter("test3");
		vo.setOpendate(dateFormat.parse("2017-01-15 17:00:05"));
		vo.setClosedate(dateFormat.parse("2017-01-15 17:00:05"));
		vo.setBoardimage("test3");
		boardService.register(vo);
		System.out.println("BoardService Success");
	}
	
	@Test
	public void viewTest() throws Exception{
		System.out.println(boardService.view(3));
	}

	@Test
	public void modifyTest() throws Exception{
		BoardVO vo = new BoardVO();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
		vo.setBno(3);
		vo.setUpdatedate(dateFormat.parse("2017-01-15 19:10:00"));
		boardService.modify(vo);
		System.out.println("Modify Test");
	}
	
	@Test
	public void removeTest() throws Exception{
		boardService.remove(6);
		System.out.println("Remove Success");
	}
	
}
