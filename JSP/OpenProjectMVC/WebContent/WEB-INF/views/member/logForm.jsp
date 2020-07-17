<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="<c:url value="/css/default.css"/>" type="text/css">

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<style>
	.check_ok{
		color: blue;
	}
	.check_not{
		color: red;
	}
	#idchk{
		display: none;
	}
</style>
</head>
<body>
	<!-- header module화 -->
	<%@ include file="/WEB-INF/views/include/header.jsp" %>
	
	<div>
		<h1 id=header>로그인</h1>
		<hr>
		<form action="memberLog.do" method="post">
			<table>
				<tr>
					<td>아이디(email)</td>
					<td>
						<input type="email" name="uid" id="uid" required>
					</td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="upw" required></td>
				</tr>
				<tr>
					<td>아이디 기억하기</td>
					<td><input type="checkbox" name="save" id="idsave"></td>
				</tr>
				<tr>
					<td></td>
					<td>
						<input type="submit" value="로그인" id="logForm">
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