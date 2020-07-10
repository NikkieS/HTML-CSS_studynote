<%@page import="model.MemberInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%
	// String mId = (String)session.getAttribute("memberId");
	MemberInfo memberInfo = (MemberInfo)session.getAttribute("memberInfo");
	if(memberInfo == null){
		// response.sendRedirect("sessionLoginForm.jsp");
		%>
		<script>
			alert('사용자  전용 페이지 입니다.\n 로그인 해주세요.');
			location.href='../member/sessionLoginForm.jsp';
		</script>
		<%
	}
%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Page</title>
</head>
<body>
	<h1>회원을 위한 페이지입니다.</h1>
	<h3>로그인 아이디 <%--=memberInfo.getUid() --%></h3>
	<a href="logout.jsp">로그아웃</a>
</body>
</html>