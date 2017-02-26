package org.teamjly.web;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.teamjly.service.BoardService;

@Controller
@RequestMapping("/front")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	private BoardService boardService;
	

	@GetMapping("/list")
	public void getList(Model model){
		
		logger.info("get board list...");

		model.addAttribute("list", boardService.getlist());
	
	}
	
}
