package com.aia.op.member.service;

import java.util.List;

import com.aia.op.member.dao.MemberDaoInterface;
import com.aia.op.member.model.Member;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberListJsonService {

	private MemberDaoInterface dao;
	
	@Autowired
	private SqlSessionTemplate sessionTemplate;
	
	public List<Member> getJson() {
		
		dao=sessionTemplate.getMapper(MemberDaoInterface.class);
		
		return dao.selectListJson();
	}
}
