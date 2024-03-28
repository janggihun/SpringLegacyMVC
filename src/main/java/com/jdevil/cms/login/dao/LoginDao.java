package com.jdevil.cms.login.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jdevil.cms.global.dto.MemberDto;

@Repository
public class LoginDao {

	@Autowired
	SqlSession sqlSession;
	
	public HashMap<String , Object> idcheck(MemberDto memberDto) {
		
		return sqlSession.selectOne("idcheck",memberDto);
	};

	
	
}
