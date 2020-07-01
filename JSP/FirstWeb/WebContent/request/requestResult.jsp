<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 한글 깨짐 현상 처리 : 데이터를 요청해 오기 전에 처리해줘야 함 -->
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request Form JSP</title>
</head>
<body>
	<h1>전송결과</h1>
	<hr>
	
	
	<jsp:forward page="forward2.jsp"/>
</body>
</html>