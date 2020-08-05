<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Open Project</title>

<link rel="stylesheet" href="<c:url value='/css/default.css'/>">

</head>
<body>
	<%@ include file="/WEB-INF/views/include/header.jsp" %>
	
	<div>
		<h1 class="header">회원수정</h1>
		<hr>
		
		<form id="editForm" method="post" enctype="multipart/form-data">
			<!-- member.getIdx 부분 -->
			<input type="hidden" name="idx" value="${member.idx}">
			<table class="table">
				<tr>
					<td>아이디(email)</td>
					<td>
						<input type="email" name="uid" id="uid" value="${member.uid}" readonly>
					</td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="upw" required></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="uname" value="${member.uname}" required></td>
				</tr>
				<tr>
					<td>사진</td>
					<td><input type="file" name="uphoto">
						<br>
						현재 파일 : ${member.uphoto}
						<input type="hidden" name="oldFile" value="${member.uphoto}">
					</td>
				</tr>
				<tr>
					<td></td>
					<td>
						<input type="submit" value="수정 완료">
						<input type="reset" value="초기화">
					</td>
				</tr>
			</table>
		</form>
	</div>
	
	<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>