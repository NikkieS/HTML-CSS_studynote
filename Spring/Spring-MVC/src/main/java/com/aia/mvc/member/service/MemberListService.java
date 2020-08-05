package com.aia.mvc.member.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.aia.op.jdbc.ConnectionProvider;
//import com.aia.op.member.dao.MemberDao;
//import com.aia.op.member.model.Member;
//import com.aia.op.member.model.MemberListView;

//@Service
public class MemberListService {

//	@Autowired
//	MemberDao dao;
//	
//	public MemberListView getView(HttpServletRequest request, HttpServletResponse response) {
//		
//		MemberListView listView = null;
//		Connection conn = null;
//		
//		try {
//			conn = ConnectionProvider.getConn();
//			
//			// 전체 회원수 구하기
//			int totalCnt = dao.selectTotalCount(conn);
//			
//			// 한 페이지당 노출할 회원수
//			final int MEMBER_CNT_PER_PAGE = 2;
//			
//			// 현재 페이지 번호
//			int currentPageNumber = 1;	// default = 1
//			String page = request.getParameter("page");
//			// 현재 페이지가 따로 잡히는 경우 -> 디폴트 값이 아닌 잡히는 페이지 번호로 치환
//			if(page != null) {
//				try {
//					currentPageNumber = Integer.parseInt(page);
//				} catch(NumberFormatException e) {
//					System.out.println("숫자 타입의 문자열이 전달되지 않아 예외 발생");
//				}
//			}
//			
//			// 게시물의 첫번째 행의 index
//			int startRow = 0; 
//			
//			// 한 페이지에 누출할 리스트
//			List<Member> memberList = null;
//			
//			if(totalCnt > 0) {
//				startRow = (currentPageNumber-1)*MEMBER_CNT_PER_PAGE;
//				memberList = dao.selectList(conn, startRow, MEMBER_CNT_PER_PAGE);
//			} else {
//				currentPageNumber = 0;
//				memberList = Collections.emptyList();
//			}
//			
//			listView = new MemberListView(totalCnt, currentPageNumber, memberList, MEMBER_CNT_PER_PAGE, startRow);
//		} catch(SQLException e) {
//			e.printStackTrace();
//		}
//		
//		return listView;
//	}
}
