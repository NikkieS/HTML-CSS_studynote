<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<h1 id="header">Open Project</h1>
<ul id="nav">
	<li><a href="<%= request.getContextPath() %>/member/memberRegForm.do">회원가입</a></li>
	<li><a href="<%= request.getContextPath() %>/member/memberList.do">회원리스트</a></li>
	<li><a href="<%= request.getContextPath() %>/member/memberLogForm.jsp">로그인</a></li>
	<li><a href="<%= request.getContextPath() %>/member/mypage/mypage.jsp">마이페이지</a></li>
	<li><a href="<%= request.getContextPath() %>/guestbook/list.jsp">방명록(비회원)</a></li>
	<li><a href="<%= request.getContextPath() %>/board/list.jsp">방명록(회원)</a></li>
</ul>