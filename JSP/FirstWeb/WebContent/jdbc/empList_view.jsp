<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EMP LIST</title>
<style>
	table{
		width: 80%
	}
	table td{
		padding: 10px;
		text-align: center;
	}
</style>
</head>
<body>
	<%-- ${empList } --%>
	<table border=1>
		<tr>
			<th>사원번호</th>
			<th>사원이름</th>
			<th>급여</th>
			<th>직급</th>
		</tr>
		
		<!-- empList가 비어있음/null 일때 체크 -->
		<c:if test = "${empty empList }">
			<tr>
				<td colspan="4">데이터가 존재하지 않습니다.</td>
			</tr>
		</c:if>
		
		<c:if test = "${not empty empList }">
			<c:forEach items="${empList}" var="emp">
			<tr>
				<td>${emp.empno}</td>
				<td>${emp.ename}</td>
				<td>${emp.sal}</td>
				<td>${emp.job}</td>
			</tr>
			</c:forEach>
		</c:if>
	</table>
</body>
</html>