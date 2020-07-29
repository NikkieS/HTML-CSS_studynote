<%@page import="util.CookieBox"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	String uid = request.getParameter("id");
	String check = request.getParameter("save");
	Cookie c = new Cookie("id", uid);
	
	if(uid!=null && check!=null){
		// response.addCookie(CookieBox.createCookie("id", uid, "/web/", 60));
		response.addCookie(CookieBox.createCookie("id", uid, "/web/", 60));
	}else{
		
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 정보 JSP</title>
</head>
<body>
	<h1>전송결과</h1>
	<hr>
	<ul>
		<li>아이디: <%= request.getParameter("id") %></li>
		<li>비밀번호: <%= request.getParameter("pw") %></li>
	</ul>
	<%-- <table border="1">
		<tr>
			<td>아이디(이메일)</td>
			<td><%= request.getParameter("id") %></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><%= request.getParameter("pw") %></td>
		</tr>
	</table> --%>
</body>
</html>