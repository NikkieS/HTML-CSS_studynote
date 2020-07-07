<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	request.setAttribute("price", 10000);
	request.setAttribute("now", new Date());
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL fmt tag</title>
</head>
<body>
	날짜 포맷팅<br>
	<fmt:formatDate value="${now }" pattern="yyyy.MM.dd H:mm:ss"/> <br>
	<fmt:formatDate value="${now }" pattern="yyyy.MM.dd H:mm"/> <br>
	<br>
	
	<fmt:timeZone value="Hongkong">
	날짜와 시간을 동시 표현<br>
	<fmt:formatDate value="${requestScope.now }" type="both"/> <br>
	<fmt:formatDate value="${requestScope.now }" type="both" dateStyle="full" timeStyle="full"/> <br>
	<fmt:formatDate value="${requestScope.now }" type="both" dateStyle="short" timeStyle="short"/> <br>
	</fmt:timeZone>
	<br>
	
	날짜표현<br>
	<fmt:formatDate value="${requestScope.now }"/> <br>
	original: <fmt:formatDate value="${now }" type="time"/> <br>
	short: <fmt:formatDate value="${now }" type="time" timeStyle="short"/> <br>
	full: <fmt:formatDate value="${now }" type="time" timeStyle="full"/> <br>
	short: <fmt:formatDate value="${now }" type="date" dateStyle="short"/> <br>
	full: <fmt:formatDate value="${now }" type="date" dateStyle="full"/><br>
	
	<hr>
	
	<fmt:formatNumber value="${price}" type="currency" /> <br>
	
	<fmt:formatNumber value="${price}" type="number" var="numberType"/>
	${numberType } <br>
	
	통화: <fmt:formatNumber value="${price}" type="currency"/>
	<fmt:formatNumber value="${price}" type="currency" currencySymbol="$"/> <br>
	
	퍼센트: <fmt:formatNumber value="${price/30000 }" type="percent"/>
	<fmt:formatNumber value="${price/30000 }" type="percent" groupingUsed="false" /> <br>
	
	패턴: <fmt:formatNumber value="${price }" pattern="00000.00"/> <br>
	<hr>
	<br>
	
	
	<c:forEach var="id" items="<%= java.util.TimeZone.getAvailableIDs() %>">
	${id}<br/>
	</c:forEach>
	

</body>
</html>