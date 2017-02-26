package org.teamjly.web;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.teamjly.domain.ContactVO;
import org.teamjly.service.ContactService;


@Controller
@RequestMapping("/front")
public class MessageController {
	
	private static final Logger logger = LoggerFactory.getLogger(MessageController.class);
	
	@Inject
	ContactService contactService;
	
	@GetMapping("/sendMessage")
	public void sendMessageGet(@RequestParam("mno")String mno,Model model) throws Exception{
		logger.info("들어왔다.");
//		logger.info(""+mno);
//		
//		model.addAttribute("mno", mno);
	}
	
	@PostMapping("/sendMseesage")
	public String sendMessagePost(ContactVO vo) throws Exception{
		logger.info("Post 들어왔다. : VO : " + vo);
		contactService.register(vo);
		return "redirect:/front/list";
	}
	
	@GetMapping("/messageList")
	public void MessageListGet(@RequestParam("mno")Integer mno,Model model) throws Exception{
		logger.info("여긴 메세지 리스트");
		model.addAttribute("contactVO", contactService.getContactMemberList(mno));
	}
	
	@GetMapping("/messageView")
	public void messageViewGet(@RequestParam("cno")Integer cno,Model model) throws Exception{
		logger.info("여긴 메세지 뷰");
		model.addAttribute("contactVO", contactService.view(cno));
	}
	
}
