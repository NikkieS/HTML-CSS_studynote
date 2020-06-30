<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
	</table>
</body>
</html>