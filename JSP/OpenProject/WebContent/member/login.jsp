<%@page import="model.MemberInfo"%>
<%@page import="util.CookieBox"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	String uid = request.getParameter("id");
	String pw = request.getParameter("pw");
	String check = request.getParameter("save");
	// Cookie c = new Cookie("id", uid);
	
	/*
	String cname = "id";
	String cpath = request.getContextPath();
	
	if(uid!=null && check!=null){
		response.addCookie(CookieBox.createCookie(cname, uid, cpath, 60));
	}else{
		response.addCookie(CookieBox.createCookie(cname, uid, cpath, 0));
	} */
	
	// 세션에 데이터 저장
	session.setAttribute("memberInfo", new MemberInfo(uid, pw));
	
	response.sendRedirect(request.getContextPath()+"/member/mypage/mypage.jsp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login info</title>

<!-- 절대경로 : /OpenProject/css~~~ --> <!-- 상대경로 : ../css/~~~ --> <!-- 배포경로: request.getContextPath()/css~~~ -->
<link rel="stylesheet" href="<%= request.getContextPath() %>/css/default.css" type="text/css">

</head>
<body>
	<%-- <!-- header module화 -->
	<%@ include file="/include/header.jsp" %> <!-- jsp container에서 돌기 때문에 / (root)만 잡아주면 된다 -->
	
	<h1>쿠키 생성</h1> <br>
	<ul>
		<li>id: <%= uid %></li>
		<li>pw: <%= pw %></li>
		<li><%
				if(check!=null){
					out.println("아이디를 저장합니다.");
				}else{
					out.println("아이디를 저장합니다.");
				}
			%></li>
		<a href="<%= request.getContextPath() %>/mypage/mypage.jsp">My Page</a>
	</ul> --%>
</body>
</html>