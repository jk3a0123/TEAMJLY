package org.teamjly.web;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.teamjly.domain.MemberVO;
import org.teamjly.service.BoardService;
import org.teamjly.service.MemberService;

@Controller
@RequestMapping("/front")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	private BoardService boardService;
	
	@Inject
	private MemberService memberService;
	
	@GetMapping("/memberRegister")
	public void memberRegisterGet() throws Exception{
		logger.info("get board memberRegister...");
	}
	
	@PostMapping("/memberRegister")
	public String memberRegisterPost(MemberVO vo) throws Exception{
		logger.info("get board memberRegister... :" + vo);
		memberService.register(vo);
		
		return "redirect:/front/list";
	}
	
	@GetMapping("/list")
	public void getList(Model model){
		
		logger.info("get board list...");

		model.addAttribute("list", boardService.getlist());

		
	
	}
	
	

	
	
	
	
	
	
}
