package com.aia.op.member.service;

import java.sql.SQLException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.op.member.dao.MemberDaoInterface;
import com.aia.op.member.model.Member;
import com.aia.op.member.model.MemberListView;

//import com.aia.op.member.dao.JdbcTemplateMemberDao;

@Service
public class MemberListService2 {

//	@Autowired
//	JdbcTemplateMemberDao dao;
	
	private MemberDaoInterface dao;
	
	@Autowired
	private SqlSessionTemplate sessionTemplate;
	
	public MemberListView getView(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		
		dao = sessionTemplate.getMapper(MemberDaoInterface.class);
		
		Map<String, Object> search = new HashMap<String, Object>();
		
		// 검색 데이터 : searchType, keyword
		String searchType = request.getParameter("searchType");
		if(searchType != null && !searchType.isEmpty()) {
			search.put("searchType", searchType);
		}
		String keyword = request.getParameter("keyword");
		if(keyword != null && !keyword.isEmpty()) {
			search.put("keyword", keyword);
		}
		
		MemberListView listView = null;
		
		// 전체 회원수 구하기
		// int totalCnt = dao.selectTotalCount();
		int totalCnt = dao.totalCount(search);
		
		// 한 페이지당 노출할 회원수
		final int MEMBER_CNT_PER_PAGE = 2;
		
		// 현재 페이지 번호
		int currentPage = 1;	// default = 1
		String page = request.getParameter("page");
		// 현재 페이지가 따로 잡히는 경우 -> 디폴트 값이 아닌 잡히는 페이지 번호로 치환
		if(page != null) {
			try {
				currentPage = Integer.parseInt(page);
			} catch(NumberFormatException e) {
				System.out.println("숫자 타입의 문자열이 전달되지 않아 예외 발생");
			}
		}
		
		// 게시물의 첫번째 행의 index
		int startRow = 0; 
		
		// 한 페이지에 누출할 리스트
		List<Member> memberList = null;
		
		// 전체 회원수가 0보다 많으면
		if(totalCnt > 0) {
			startRow = (currentPage-1)*MEMBER_CNT_PER_PAGE;
			System.out.println("startRow = "+startRow);
			
			search.put("startRow", startRow);
			search.put("count", MEMBER_CNT_PER_PAGE);
			//memberList = dao.selectList(startRow, MEMBER_CNT_PER_PAGE);
			memberList = dao.selectList(search);
			
		} else {
			currentPage = 0;
			memberList = Collections.emptyList();
		}
		
		listView = new MemberListView(totalCnt, currentPage, memberList, MEMBER_CNT_PER_PAGE, startRow);

		
		return listView;
	}
}
