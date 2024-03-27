package com.jdevil.cms.page2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page2")
public class Page2Controller {

	@GetMapping("/main")
	public String page1Main() {
		
		return "page2/main";
	}

}
