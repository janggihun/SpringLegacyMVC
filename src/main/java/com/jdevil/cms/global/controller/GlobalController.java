package com.jdevil.cms.global.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GlobalController {

	@GetMapping("/")
	public String home() {

		return "global/home";
	}

	@GetMapping("/main")
	public String main() {

		return "global/main";
	}
}