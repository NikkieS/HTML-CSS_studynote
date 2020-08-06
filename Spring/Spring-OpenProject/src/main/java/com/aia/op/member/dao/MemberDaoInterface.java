package com.aia.op.member.dao;

import java.util.List;
import java.util.Map;

import com.aia.op.member.model.Member;
import com.aia.op.member.model.MemberXml;

public interface MemberDaoInterface {

	public Member selectByIdPw(String uid, String pw);
	
	// 전체 회원리스트 JSON
	public List<Member> selectListJson();
	
	// 전체 회원리스트 XML
	public List<MemberXml> selectListXml();
	
	// idx 기반으로 검색한 회원의 정보 반환
	public Member selectByIdx(int idx);
	
	// 회원가입
	public int insertMember(Member member);
	
	// 회원 삭제
	public int memberDelete(int idx);
	
	// 전체 회원수 : 검색 포함
	public int totalCount(Map search);
	
	// 전체 회원리스트
	public List<Member> selectList(Map search);
}
