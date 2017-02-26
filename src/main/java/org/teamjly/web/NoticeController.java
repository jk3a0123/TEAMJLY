package org.teamjly.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public void noticeRegister(){
		logger.info("register start");
	}
	
	
	
	
	
	
}
