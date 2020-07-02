<%@page import="util.CookieBox"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>쿠키 정보 수정</h1>
	<%
		// cookie가 있으면 덮어쓰고 없으면 생성
		/* Cookie cookie = new Cookie("uid", "hot");
		cookie.setPath("/web/");
		
		response.addCookie(cookie); */
		response.addCookie(CookieBox.createCookie("uid", "HOT", "/web/", -1));
		
	%>
	<br>
	<a href="viewCookie.jsp">쿠키값 확인</a> <br>
	<a href="deleteCookie.jsp">쿠키 삭제</a>
</body>
</html>