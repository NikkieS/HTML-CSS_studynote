<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="requestInfo" class="model.RequestMemberInfo" scope="page"/>
<jsp:setProperty property="*" name="requestInfo"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 정보 JSP</title>
</head>
<body>
	<h1>전송결과</h1>
	<hr>
	<ul>
		<li>아이디: <%=requestInfo.getId() %> <%--= request.getParameter("id") --%></li>
		<li>비밀번호: <%=requestInfo.getPw() %> <%--= request.getParameter("pw") --%></li>
		<li>이름: <%=requestInfo.getUserName() %> <%--= request.getParameter("userName") --%></li>
	</ul>
	<%-- <table border="1">
		<tr>
			<td>아이디</td>
			<td><%= request.getParameter("id") %></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><%= request.getParameter("pw") %></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><%= request.getParameter("userName") %></td>
		</tr>
	</table> --%>
</body>
</html>