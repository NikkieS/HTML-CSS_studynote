<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Open Project</title>

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>

<link rel="stylesheet" href="${pageContext.request.contextPath}/css/default.css">
</head>
<body>
	<!-- header module화 -->
	<%@ include file="/WEB-INF/views/include/header.jsp" %>
	
	<div>
		<h1 id=header>로그인</h1>
		<hr>
		<form method="post">
			<input type="text" name="redirUri" value="${header.referer}" style="width: 50%;">
			
			<table class="table">
				<tr>
					<td>아이디(email)</td>
					<td>
						<input type="email" name="uid" value="${cookie.uid.value}" required>
					</td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="upw" required></td>
				</tr>
				<tr>
					<td>아이디 기억하기</td>
					<td><input type="checkbox" name="remember" value="r" ${cookie.uid != null? 'checked' : ''}> 아이디 기억하기</td>
				</tr>
				<tr>
					<td></td>
					<td>
						<input type="submit" value="로그인">
						<input type="reset" value="초기화">
					</td>
				</tr>
			</table>
		</form>
	</div>
	
	<!-- footer module화 -->
	<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>