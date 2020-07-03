<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if(session.getAttribute("memberInfo")==null){
		response.sendRedirect(request.getContextPath()+"/member/memberLogForm.jsp");
	}else{
		session.invalidate();
		response.sendRedirect(request.getContextPath()+"/member/memberLogForm.jsp");}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>logout info</title>
</head>
<body>
	<h1>로그아웃 되었습니다.</h1> <br>
</body>
</html>
