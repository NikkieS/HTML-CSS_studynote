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
<title>게시판 page</title>

<!-- 절대경로 : /OpenProject/css~~~ --> <!-- 상대경로 : ../css/~~~ --> <!-- 배포경로: request.getContextPath()/css~~~ -->
<link rel="stylesheet" href="<%= request.getContextPath() %>/css/default.css" type="text/css">

<style>
</style>
</head>
<body>
	<!-- header module화 -->
	<%@ include file="/include/header.jsp" %> <!-- jsp container에서 돌기 때문에 / (root)만 잡아주면 된다 -->
	
	<div>
		<h1>게시판</h1>
	</div>
	
	<!-- footer module화 -->
	<%@ include file="/include/footer.jsp" %>
</body>
</html>
<%
	}
%>