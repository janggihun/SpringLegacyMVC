package com.jdevil.cms.global.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GlobalController {

	@GetMapping("/")
	public String home() {

		return "global/main";
	}

	@GetMapping("/login")
	public String main() {

		return "global/login";
	}
	@PostMapping("/login")
	public String login(String userId, String userPw) {
		
		System.out.println(userId + userPw);
		
		return "redirect:/page1/main";
	}
}