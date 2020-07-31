<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 처리</h1>
	
	<table>
		<tr>
			<td>아이디</td>
			<td>${login.uid }</td>	<!-- @ModelAttribute(value="login") 으로 변경해 주었기 때문에 클래스명이 아닌 이름으로 설정 -->
		</tr>
		<tr>
			<td>비밀번호</td>
			<td>${login.upw}</td>
		</tr>
	</table>

</body>
</html>