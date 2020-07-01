<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>pagecontrol.jsp</title>
</head>
<body>
	<h1>안녕하세요. pagecontrol 페이지입니다.</h1>
	<%--
		response.sendRedirect("../hello.jsp"); // 다른 페이지로 이동시키는 역할
	--%>
	
	<jsp:forward page="../hello.jsp"/>
</body>
</html>