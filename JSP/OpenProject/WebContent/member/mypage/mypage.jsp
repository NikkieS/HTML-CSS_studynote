<%@page import="model.MemberInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	MemberInfo memberInfo = (MemberInfo)session.getAttribute("memberInfo");
	if(memberInfo==null){
		response.sendRedirect(request.getContextPath()+"/member/memberLogForm.jsp");
	}else{
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Page</title>

<!-- 절대경로 : /OpenProject/css~~~ --> <!-- 상대경로 : ../css/~~~ --> <!-- 배포경로: request.getContextPath()/css~~~ -->
<link rel="stylesheet" href="<%= request.getContextPath() %>/css/default.css" type="text/css">

<style>
</style>
</head>
<body>
	<!-- header module화 -->
	<%@ include file="/include/loginHeader.jsp" %> <!-- jsp container에서 돌기 때문에 / (root)만 잡아주면 된다 -->
	
	<div>
		<h1>My Page</h1>
		<br>
		<h3>아이디: <%= memberInfo.getUid() %></h3>
		<h3>비밀번호: <%= memberInfo.getUpw() %></h3>
	</div>
	
	<!-- footer module화 -->
	<%@ include file="/include/footer.jsp" %>
</body>
</html>
<%
	}
%>