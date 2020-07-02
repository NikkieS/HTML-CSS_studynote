<%@page import="util.CookieBox"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	String uid = request.getParameter("id");
	String check = request.getParameter("save");
	Cookie c = new Cookie("id", uid);
	
	if(uid!=null && check!=null){
		response.addCookie(CookieBox.createCookie("id", uid, "/web/", 60));
	}else{
		
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login info</title>
</head>
<body>
	<h1>쿠키 생성</h1> <br>
</body>
</html>