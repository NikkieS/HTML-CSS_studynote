<%@page import="model.MemberInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 page</title>

<!-- 절대경로 : /OpenProject/css~~~ --> <!-- 상대경로 : ../css/~~~ --> <!-- 배포경로: request.getContextPath()/css~~~ -->
<link rel="stylesheet" href="<%= request.getContextPath() %>/css/default.css" type="text/css">

<style>
</style>
</head>
<body>
	<!-- header module화 -->
	<%@ include file="/include/header.jsp" %> <!-- jsp container에서 돌기 때문에 / (root)만 잡아주면 된다 -->
	
	<div>
		<h1>회원가입</h1>
		<form action="<%=request.getContextPath() %>/member/memberLogForm.jsp" method="post">
			<table id="reg">
			<tr>
			    <td>ID</td>
			    <td><input type = "email" name="rid" value="" required></td>
			</tr>
			<tr>
			    <td>PW</td>
			    <td><input type = "password" name="rpw" required></td>
			</tr>
			<tr>
		       	<td></td>
		       	<td><input id="btn_submit" type = "submit" value = "가입하기"><input id="btn_rest" type = "reset" value = "초기화"></td>
	   		</tr>
			</table>
		</form>
	</div>
	
	<!-- footer module화 -->
	<%@ include file="/include/footer.jsp" %>
</body>
</html>
<%
	String rid = request.getParameter("rid");
	String rpw = request.getParameter("rpw");
	
	application.setAttribute("memberInfo", new MemberInfo(rid, rpw));
%>