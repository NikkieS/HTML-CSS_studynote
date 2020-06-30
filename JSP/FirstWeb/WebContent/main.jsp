<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Include 지시어 테스트</title>
<style>
	header{
		text-align: center;
	}
	#wrap{
		overflow: hidden;
	}
	#news{
		width: 45%;
		float: left;
	}
	#shopping{
		width: 45%;
		float: right;
	}
	footer{
		clear: both;
	}
</style>
</head>
<body>
	<%@ include file="include/header.jsp" %>
	<div id="wrap">
		<%@ include file="include/news.jsp" %>
		<%@ include file="include/shopping.jsp" %>
	</div>
	<!-- footer가 먼저 실행 된 후 body가 실행 됨 -->
	<jsp:include page="include/footer.jsp">
		<jsp:param value="cool@gmail.com" name="email"/>
		<jsp:param value="02-1234-1234" name="tel"/>
	</jsp:include>
</body>
</html>