package com.weovercome.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weovercome.dao.MemberDao;
import com.weovercome.model.Member;



@Service
public class MemberListService {
	
	private MemberDao dao;

	@Autowired
	private SqlSessionTemplate template;
	
	public List<Member> getMemberList () {
		
		dao = template.getMapper(MemberDao.class);
		
		return dao.selectList();
	}
	
	
}
