package com.jdevil.cms.login.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdevil.cms.global.dto.MemberDto;
import com.jdevil.cms.login.dao.LoginDao;

@Service
public class LoginService {

	
	@Autowired
	LoginDao loginDao;
	
	public HashMap<String, Object> idcheck(MemberDto memberDto) {
		
		return loginDao.idcheck(memberDto);
		
	}

	
	
}
