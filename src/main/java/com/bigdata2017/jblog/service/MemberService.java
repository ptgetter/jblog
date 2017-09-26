package com.bigdata2017.jblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigdata2017.jblog.repository.BlogDao;
import com.bigdata2017.jblog.repository.CategoryDao;
import com.bigdata2017.jblog.repository.MemberDao;
import com.bigdata2017.jblog.vo.MemberVo;

@Service
public class MemberService {
	
	@Autowired
	private MemberDao memberDao;
	@Autowired
	private BlogDao blogDao;
	@Autowired
	private CategoryDao categoryDao;

	public MemberVo getUser(String email, String password) {
		return null;
	}

	public boolean join(MemberVo vo) {
		int count = memberDao.insert(vo);
		
		return false;
	}

}
