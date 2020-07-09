<%@page import="guestbook.model.MessageListView"%>
<%@page import="guestbook.service.GetMessageListService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	int pageNum = 1;	// 페이지가 null 값이 들어와도 첫페이지 1로 설정
	String pageNumber = request.getParameter("page");
	if(pageNumber != null){
		pageNum = Integer.parseInt(pageNumber);
	}
	GetMessageListService service = GetMessageListService.getInstance();
	
	// MessageListView 불러오기
	MessageListView view = service.getMessageList(pageNum);
	
	request.setAttribute("listView", view);
%>
<jsp:forward page="list_view.jsp"/>

