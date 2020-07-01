<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 한글 깨짐 현상 처리 : 데이터를 요청해 오기 전에 처리해줘야 함 -->
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request Form JSP</title>
</head>
<body>
	<h1>전송결과</h1>
	<hr>
	<table border="1">
		<tr>
			<td>이름</td>
			<td><%= request.getParameter("username") %></td>
		</tr>
		<tr>
			<td>직업</td>
			<td><%= request.getParameter("job") %></td>
		</tr>
		<tr>
			<td>관심사항</td>
			<td> 
				<% 
					String[] interests = request.getParameterValues("interest");
					for(int i=0; i<interests.length; i++){
						out.println(interests[i]+"<br>"); // java<br>
					}
				%></td>
			<%-- <%= request.getParameter("interest") %> </td>--%>
		</tr>
		<tr>
			<td>요청 메소드</td>
			<td><%= request.getMethod() %></td>
		</tr>
		<tr>
			<td>쿠키 정보</td>
			<td><%  
					/* Cookie : getName(), getValue() */
					Cookie[] cookies = request.getCookies();
					for(int i=0; i<cookies.length; i++){
						out.println(cookies[i].getName()+"="+cookies[i].getValue()+"<br>");
					}
				%></td>
		</tr>
		<tr>
			<td>요청 정보 URL</td>
			<td><%= request.getProtocol() %> <br>
				<%= request.getRequestURL() %> <br> <!-- URL: 전체 주소 -->
				<%= request.getRequestURI() %> <!-- URI: 8080포트 뒤 주소 (a.k.a 사용자의 요청) -->
			</td>
		</tr>
	</table>
</body>
</html>