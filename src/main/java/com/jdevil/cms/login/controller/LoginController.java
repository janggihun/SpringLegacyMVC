package com.jdevil.cms.login.controller;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.jdevil.cms.global.dto.MemberDto;
import com.jdevil.cms.login.service.LoginService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class LoginController {
	
//	@Autowired
//	LoginService loginService; 
	@Autowired
	private SqlSession sqlSession;
	@GetMapping("/login")
	public String main() {

		return "global/login";
	}

	@PostMapping("/login")
	public String login(MemberDto memberDto) {

		System.out.println(memberDto);
		Map<String, Object> result = sqlSession.selectOne("selectNow");
		
		System.out.println("°á°ú : " + result);
//		loginService.idcheck(memberDto);	
		return "redirect:/page1/body";
	}

}
