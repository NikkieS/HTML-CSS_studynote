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
	
	// 어플리케이션 데이터 불러오기
	String msg = "";
	MemberInfo m = (MemberInfo) application.getAttribute("memberInfo");
	m.mPush();
	if(m.getList().containsKey(uid) && m.getList().get(uid)==pw){
		msg="아이디 확인";
		response.sendRedirect(request.getContextPath()+"/member/mypage/mypage.jsp");
	}else{
		msg="없는 아이디 입니다. 먼저 가입해 주세요";
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
	<!-- header module화 -->
	<%@ include file="/include/header.jsp" %> <!-- jsp container에서 돌기 때문에 / (root)만 잡아주면 된다 -->
	
	<h1><%= msg %></h1> <br>
	
	<a href="<%= request.getContextPath() %>/member/memberRegForm.jsp">회원가입하기</a>
	
</body>
</html>
<%
	}
%>