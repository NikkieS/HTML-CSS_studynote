package com.aia.mm.dao;

import java.util.List;

import com.aia.mm.model.Member;

public interface MemberDao {

	List<Member> selectList();	// public은 생략가능 (자동)

}
