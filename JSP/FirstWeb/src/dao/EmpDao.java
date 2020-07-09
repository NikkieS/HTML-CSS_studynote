package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Emp;

// DAO : Data Access Object
public class EmpDao {
	
	// 외부에서 객체 생성 하는것을 막는다.
	// 생성자의 접근제어지시자 사용
	private EmpDao() {
	}
	
	// 사용할 인스턴스 하나를 생성한다
	// static: 내부호출, private: 외부참조 변경 제어
	private static EmpDao dao = new EmpDao();
	
	// EmpDao 인스턴스의 참조값을 반환하는 메소드
	// 
	public static EmpDao getInstance() {
		return dao;
	}
	
	// Connection 객체를 불러와서 연속적인 transaction 처리
	public List<Emp> getList(Connection conn) throws SQLException{
		Statement stmt = null;
		ResultSet rs = null;
		
		List<Emp> empList = new ArrayList<Emp>();
		
		stmt=conn.createStatement();
		String sql = "select * from emp order by ename desc";
		
		// select의 결과 ResultSet 객체에 담기
		rs = stmt.executeQuery(sql);
		
		// 결과 출력
		while(rs.next()){
			empList.add(new Emp(rs.getInt("empno"), rs.getString("ename"), rs.getInt("sal"), rs.getString("job")));
		}
		
		return empList;
	}
}
