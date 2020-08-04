<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Open Project</title>

<link rel="stylesheet" href="<c:url value="/css/default.css" />">

</head>
<body>
	<%@ include file="/WEB-INF/views/include/header.jsp" %>
	
	<div>
		<h1 class="header">회원수정</h1>
		<hr>
		<h3>
			<c:if test="${result gt 0}">
				<div>
					회원수정 완료
				</div>
				${member}
			</c:if>
			
			<c:if test="${result lt 1}">
				<div>
					회원수정 실패
				</div>
			</c:if>
		</h3>
	</div>
	
	<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>