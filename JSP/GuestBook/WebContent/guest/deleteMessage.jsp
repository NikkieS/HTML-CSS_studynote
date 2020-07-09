<%@page import="guestbook.service.DeleteMessageService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String pw = request.getParameter("pw");
	int mid = Integer.parseInt(request.getParameter("mid"));
	
	// 1. DeleteMessageService 
	// 2. dao.selectMessage(mid) -> 게시물 존재 여부 확인  & 입력된 비밀번호 확인
	// 3. dao.deleteMessage()
	
	DeleteMessageService service = DeleteMessageService.getInstance();
	int resultCnt = service.deleteMessage(mid, pw);
	
	request.setAttribute("resultCode", resultCnt);
%>

<jsp:forward page="deleteMessage_view.jsp"/>