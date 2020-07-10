<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>과제 제출</h1>
	<form action="upload2.jsp" method="post" enctype="multipart/form-data"> <!-- enctype: 파일을 서버로 보낼 때 기본적으로 폼테그에 들어가야하는 속성 -->
		이름: <input type="text" name="uname"><br>
		학번: <input type="text" name="stn"><br>
		과제 파일: <input type="file" name="report"><br>
		<input type="submit" value="제출하기">
	</form>
</body>
</html>