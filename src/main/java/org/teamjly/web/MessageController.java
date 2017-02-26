package org.teamjly.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MessageController {
	
	private static final Logger logger = LoggerFactory.getLogger(MessageController.class);
	
	
	@ResponseBody
	@GetMapping("/send")
	public void Testing() throws Exception{
		logger.info("들어왔다.");
	}
}
