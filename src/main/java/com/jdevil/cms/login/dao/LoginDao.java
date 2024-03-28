package com.jdevil.cms.login.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jdevil.cms.global.dto.MemberDto;

@Repository
public class LoginDao {

	@Autowired
	SqlSession sqlSession;
	
	public void idcheck(MemberDto memberDto) {
		
		sqlSession.selectOne("selectNow");
	};

	
	
}
