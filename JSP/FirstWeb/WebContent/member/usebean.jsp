<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!--
	[jsp:useBean]
	id: 식별자
	class: 객체 생성
	scope: page(띄우기만 할때), request(forward할때), session(데이터 저장할때), application (default = page, 생략가능)
	scope객체에 class객체를 식별자 이름으로 저장
	class 객체가 있다면 -> 생성X, scope객체에서 가져와 사용
-->
<jsp:useBean id="memberInfo" class="model.LoginInfo" scope="application"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member folder</title>
</head>
<body>
	<h1><%= memberInfo %></h1>
</body>
</html>