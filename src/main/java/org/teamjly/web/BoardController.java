package org.teamjly.web;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.teamjly.domain.BoardVO;
import org.teamjly.service.BoardService;

@Controller
@RequestMapping("/front")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	private BoardService boardService;
	

	@GetMapping("/boardlist")
	public void getList(Model model){
		logger.info("get board list...");
		model.addAttribute("list", boardService.getlist());	
	}
	
	@GetMapping("/boardview")
	public void pageView(Integer bno , Model model){
		logger.info("view called....");
		logger.info("bno :" + bno);
		model.addAttribute("view", boardService.view(bno));
	}
	@GetMapping("/boardregister")
	public void pageRegister(){
		logger.info("register called...");
	}
	@PostMapping("/boardregister")
	public String postRegister(BoardVO vo , RedirectAttributes rttr){
		logger.info("post reg called....");
		logger.info("vo :" + vo );
		rttr.addFlashAttribute("result", "registertrue");
		boardService.register(vo);
		return "redirect:boardlist";
	}
	
	@GetMapping("/boardmodify")
	public void pageModify(Integer bno , Model model){
		logger.info("modify called...");
		logger.info("bno:"  + bno);
		model.addAttribute("modify", boardService.view(bno));
		
	}
	
	@PostMapping("/boardmodify")
	public String postModify(BoardVO vo , RedirectAttributes rttr){
		logger.info("post modify called...");
		logger.info("vo :" + vo);
		rttr.addFlashAttribute("result", "modifytrue");
		return "redirect:boardlist";
		
	}
	
	@PostMapping("/boarddelete")
	public String pageDelete(Integer bno , RedirectAttributes rttr){
		logger.info("delete called...");
		boardService.remove(bno);
		rttr.addFlashAttribute("result", "deletetrue");
		return "redirect:boardlist";
		
	}

	
}
