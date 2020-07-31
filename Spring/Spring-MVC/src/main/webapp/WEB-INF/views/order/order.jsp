<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문</title>
</head>
<body>
	<h1>주문내역</h1>
	<hr>
	<div>
		<!-- class의 이름으로 불러온다 -->
		주소: ${orderCommand.address.address1} ${orderCommand.address.address2} (${orderCommand.address.zipcode})
	</div>
	<c:forEach items="${orderCommand.orderItems}" var="item">
	<div>
		상품명: ${item.itemId} /
		수량: ${item.number} /
		주의사항: ${item.remark}
	</div>
	</c:forEach>
</body>
</html>