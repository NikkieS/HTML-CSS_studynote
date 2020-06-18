package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class practice {

	public static void main(String[] args) {
		Connection conn= null;
		ResultSet rs = null;
		Statement stmt = null;
		// DB 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
			System.out.println("Oracle 드라이버 로드 성공");
			
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";
			
			// 데이터베이스에 접속
			conn = DriverManager.getConnection(url, user, pw);
			System.out.println("데이터베이스에 접속했습니다.");
			
			// Statement
			stmt = conn.createStatement();
			
			// 1. EMP 테이블에 새로운 사원 정보를 입력하는 프로그램을 작성해보자.
			String sql1 = "insert into emp(empno, ename, job, sal) "
					+ " values(1111, '박지성', 'ANALYST', 3500)";
			
			// 2. EMP 테이블의 모든 데이터를 출력하는 프로그램을 작성해보자.
			String sql2 = "select * from emp";
			rs = stmt.executeQuery(sql2);
			while(rs.next()) {
				System.out.println(rs.getInt("empno")+"\t");
				System.out.println(rs.getInt("empno")+"\t");
				System.out.println(rs.getInt("empno")+"\t");
				System.out.println(rs.getInt("empno")+"\t");
			}
			int resultCnt = stmt.executeUpdate(sql1);
			System.out.println(resultCnt + "개 행이 입력되었습니다.");
			
			// close
			rs.close();
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}

	}

}
