package com.jdevil.cms.login.controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.jdevil.cms.global.dto.MemberDto;
import com.jdevil.cms.login.service.LoginService;

import lombok.extern.slf4j.Slf4j;





@Controller
@Slf4j
public class LoginController {

	@Autowired
	LoginService loginService;

	@GetMapping("/login")
	public String main() {

		return "global/login";
	}

	@PostMapping("/login")
	public String login(MemberDto memberDto, Model model, HttpSession session) {


		HashMap<String, Object> rMap = loginService.idcheck(memberDto);
		

		log.info("aaa");
		if (rMap != null) {

			session.setAttribute("userId", memberDto.getUserId());
			return "redirect:/page1/main";
		}

		return "redirect:/login";
	}

}
