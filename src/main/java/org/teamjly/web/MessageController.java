package org.teamjly.web;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.teamjly.domain.ContactVO;
import org.teamjly.service.ContactService;


@Controller
@RequestMapping("/front")
public class MessageController {
	
	private static final Logger logger = LoggerFactory.getLogger(MessageController.class);
	
	@Inject
	ContactService contactService;
	
	@GetMapping("/sendMessage")
	public void sendMessageGet() throws Exception{
		logger.info("들어왔다.");
	}
	
	@PostMapping("/sendMseesage")
	public String sendMessagePost(ContactVO vo) throws Exception{
		logger.info("Post 들어왔다. : VO : " + vo);
		contactService.register(vo);
		return "redirect:/front/MessageList";
	}
	
	@GetMapping("MessageList")
	public void MessageListGet() throws Exception{
		
	}
}
