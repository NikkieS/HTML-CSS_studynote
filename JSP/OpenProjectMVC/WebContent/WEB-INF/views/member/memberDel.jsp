<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<c:url value="/css/default.css"/>" type="text/css">

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<style>
</style>
</head>
<body>
	<!-- header module화 -->
	<%@ include file="/WEB-INF/views/include/header.jsp" %>
	
	<c:if test="${resultCode == 1 }">
		<h1>회원 정보가 삭제되었습니다.</h1>
	</c:if>
	<c:if test="${resultCode == -1 }">
		<h1>삭제할 회원의 정보가 존재하지 않습니다.</h1>
	</c:if>
	
	<!-- footer module화 -->
	<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>
