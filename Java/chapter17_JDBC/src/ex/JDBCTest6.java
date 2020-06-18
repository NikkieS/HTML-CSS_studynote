package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest6 {

	public static void main(String[] args) {
		// JDBC 사용 객체
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			//0. 드라이버 LIB 추가
			//1. 데이터베이스 드라이버 로드
			// Class.forName(드라이버 클래스 전체이름-패키지 포함)
			// Oracle : oracle.jdbc.driver.OracleDriver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. 데이터베이스 연결
			// DriverManager.getConnection(URL, USER, PW)
			// URL : jdbc:oracle:thin:@주소:포트:데이터베이스이름
			// 주소 : localhost or 127.0.0.1
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";
			
			// Connection 객체 생성
			conn = DriverManager.getConnection(url, user, pw);
			
			//3. SQL 처리
			// Statement or PreparedStatement
			// pstmt =conn.prepareStatement(SQL 문장)
			String sql = "insert into dept (deptno, dname, loc) "
					+ " values (?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,  70);
			pstmt.setString(2, "마케팅");
			pstmt.setString(3,  "서울");
			
			int resultCnt = pstmt.executeUpdate();
			
			if(resultCnt>0) {
				System.out.println(resultCnt + "행이 정상적으로 입력되었습니다.");
			} else {
				System.out.println("입력이 되지않았습니다. 확인후 재 시도해주세요.");
			}
			
			//4. 데이터베이스 연결 종료
			pstmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		

	}

}