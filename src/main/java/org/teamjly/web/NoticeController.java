package org.teamjly.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.teamjly.domain.NoticeVO;
import org.teamjly.service.NoticeService;

@Controller
@RequestMapping("/front")
public class NoticeController {

	Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private NoticeService noticeService;
	
	
	
	@GetMapping("/notice") // 공지사항 첫페이지 가는 곳
	public void notice(Model model){
		logger.info("notice page ");
		model.addAttribute("list", noticeService.getList());
	}
	
	@GetMapping("/noticeview")	// 클릭시 nno 값을 받어 view 페이지로 간다.
	public void noticeView(@RequestParam("nno")Integer nno, Model model){
		logger.info("nno : " + nno);
		model.addAttribute("view", noticeService.view(nno));
	}
	
	@GetMapping("/noticeregister") // 공지사항 등록 페이지로 간다.
	public void noticeRegisterPage(){
		logger.info("register start");
	}
	
	@PostMapping("/noticeregister")   // 등록할때 mno 값은 Cookie 에 저장해서 거기서 따로 가져와서 set 해줘야 한다.
	public String noticeRegister(NoticeVO vo){
		logger.info("Notice 등록 해보자");
		logger.info("vo : " + vo);
		noticeService.register(vo);
		return "redirect:notice";
	}
	
	
	
	
}
