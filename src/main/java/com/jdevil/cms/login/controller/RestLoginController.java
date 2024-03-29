package com.jdevil.cms.login.controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdevil.cms.global.dto.MemberDto;
import com.jdevil.cms.login.service.LoginService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/login")
@Slf4j
public class RestLoginController {

	@Autowired
	LoginService loginService;
	
	
	@GetMapping("/idPwCheck")
	public String idPwCheck(MemberDto memberDto, HttpSession session) {

		System.out.println("ajax Login 시작...");
		HashMap<String, Object> rMap = loginService.idcheck(memberDto);

		if (rMap != null) {

			session.setAttribute("userId", memberDto.getUserId());
			return "success";
		}else {
			
			return "failed";
		}

		
	}

}
