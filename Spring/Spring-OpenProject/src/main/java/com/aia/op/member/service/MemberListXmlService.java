package com.aia.op.member.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.op.member.dao.MemberDaoInterface;
import com.aia.op.member.model.MemberXml;
import com.aia.op.member.model.MemberXmlList;

@Service
public class MemberListXmlService {
	
	private MemberDaoInterface dao;
	
	@Autowired
	private SqlSessionTemplate sessionTemplate;
	
	public MemberXmlList getXml() {
		
		dao=sessionTemplate.getMapper(MemberDaoInterface.class);
		
		List<MemberXml> memberList = dao.selectListXml();
		MemberXmlList list = new MemberXmlList(memberList);
		
		return list;
		
		// return new MemberXmlList(dao.selectListXml()); 
	}
}
