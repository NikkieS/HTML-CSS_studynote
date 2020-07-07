<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	// 1. 데이터베이스 로드
	// 2. Connection 생성
	// 3. Statement
	// 4. ResultSet
	// 5. close()
	
	// 1. 데이터베이스 로드
	Class.forName("oracle.jdbc.driver.OracleDriver");

	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	// DB Connection 정보
	String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl ";
	String user = "scott";
	String pw = "tiger";
	
	try{
		// 2. Connection 생성
		conn = DriverManager.getConnection(dbUrl, user, pw);
		
		// 3. Statement 생성
		stmt = conn.createStatement();
		String sql = "select * from emp order by ename desc";
		
		// select의 결과 ResultSet 객체에 저장
		rs = stmt.executeQuery(sql);
		
		// 결과 출력
		while(rs.next()){
			out.println();
		}
	} catch(SQLException ex){
		//예외처리
		
	} finally{
		
	}
%>

</body>
</html>