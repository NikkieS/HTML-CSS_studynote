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
	
	<h3>회원 리스트</h3>
	<hr>
	<form action="" method="post">
		<table>
			<tr>
				<th>No.</th>
				<th>아이디</th>
				<th>비밀번호</th>
				<th>이름</th>
				<th>첨부파일</th>
			</tr>
			<tr>
			</tr>
		</table>
	</form>
	<c:if test="${not empty listView.memberList }">
	<table>
	<c:forEach items="${listView.memberList }" var="member">
			<tr>
				<td>${member.idx }</td>
				<td>${member.uid }</td>
				<td>${member.upw }</td>
				<td>${member.uname }</td>
				<td>${member.uphoto }</td>
			</tr>
	</c:forEach>
	</table>
	</c:if>
	
	<%-- <c:if test="${listView.pageTotalCount > 0 }">
	<div class="paging">
		<c:forEach begin="1" end="${listView.pageTotalCount }" var="num">
		<a href="memberList.jsp?page=${num }" ${listView.currentPage eq num? 'class"currentPage":'' }>[${num }]</a>
		</c:forEach>
	</div>
	</c:if> --%>
	<!-- footer module화 -->
	<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>