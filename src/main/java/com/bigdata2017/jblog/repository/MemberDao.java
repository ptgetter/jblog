package com.bigdata2017.jblog.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bigdata2017.jblog.vo.MemberVo;

@Repository
public class MemberDao {

	@Autowired
	private SqlSession sqlSession;

	public int insert(MemberVo vo) {
		int count = sqlSession.insert("member.insert", vo);
		return count;
	}

}
