package com.jdevil.cms.login.controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
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

		System.out.println("id 확인중...");

		HashMap<String, Object> rMap = loginService.idcheck(memberDto);
		log.info("id확인중");
		System.out.println("확인완료");
		if (rMap != null) {

			session.setAttribute("userId", memberDto.getUserId());
			return "page1/body";
		}

		return "redirect:/login";
	}

}
