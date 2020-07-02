<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 page</title>

<!-- 절대경로 : /OpenProject/css~~~ --> <!-- 상대경로 : ../css/~~~ --> <!-- 배포경로: request.getContextPath()/css~~~ -->
<link rel="stylesheet" href="<%= request.getContextPath() %>/css/default.css" type="text/css">

<style>
</style>
</head>
<body>
	<!-- header module화 -->
	<%@ include file="/include/header.jsp" %> <!-- jsp container에서 돌기 때문에 / (root)만 잡아주면 된다 -->
	
	<div>
		<h1>로그인</h1>
		<form action="login.jsp" method="post">
			<table id="login">
				<tr>
				    <td>ID</td>
				    <td><input type = "email" name="id"></td>
				</tr>
				<tr>
				    <td>PW</td>
				    <td><input type = "password" name="pw"></td>
				</tr>
				<tr>
				    <td>아이디 기억하기</td>
				    <td><input type = "checkbox" name="save"></td>
				</tr>
				<tr>
			       	<td></td>
			       	<td><input id="btn_submit" type = "submit" value = "로그인"></td>
		   		</tr>
			</table>
		</form>
	</div>
	
	<!-- footer module화 -->
	<%@ include file="/include/footer.jsp" %>
</body>
</html>