package phoneBook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnProvider {
	
	public static Connection getConnection() throws SQLException {
		Connection conn = null;
		
		//2. 데이터베이스 연결
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "scott";
		String pw = "tiger";
		
		// Connection 객체 생성
		
		conn = DriverManager.getConnection(url, user, pw);
		
		return conn;
	}
}
