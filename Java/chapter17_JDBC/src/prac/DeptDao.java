package prac;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DeptDao {
	// DAO = Data Access Object
	// 데이터베이스 처리 하는 클래스
	
	// MVC = Model, View, Controller
	// model : Service, DAO
	// 데이터베이스 
	
	public int deptInsert(Dept dept){	
		PreparedStatement pstmt = null;
		Connection conn = null;
		int resultCnt = 0;
		
		try {
			conn = ConnProvider.getConnection();
			//3. SQL 처리
			String sql = "insert into dept (deptno, dname, loc) "
					+ " values (?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());
			
			resultCnt = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		}
		return resultCnt;
	}
	
	public int deptEdit(Dept newDept, Connection conn){
		PreparedStatement pstmt = null;
		int resultCnt = 0;
		
		try {
			//3. SQL 처리
			String sql = "update dept set dname = ?, loc = ? where deptno = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, newDept.getDname());
			pstmt.setString(2, newDept.getLoc());
			pstmt.setInt(3, newDept.getDeptno());
			
			resultCnt = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		return resultCnt;
	}
	
	public int deptDelete(String dname) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int resultCnt = 0;
		
		try {
			conn = ConnProvider.getConnection();
			//3. SQL 처리
			String sql = "delete from dept where dname = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dname);
			
			resultCnt = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		}
		return resultCnt;
	}
	
	public List<Dept> deptList() {
		// VO : Value Object
		// DTO : Data Transfer Object
		
		// DAO 클래스 추가
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Connection conn = null;
		
		List<Dept> deptList = new ArrayList<>();
		
		try {
			conn = ConnProvider.getConnection();
			//3. SQL 처리
			String sql = "select rownum, deptno, dname, loc from dept order by deptno asc";
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			int resultCnt = 0;
			
			System.out.println("부서번호\t      부서이름\t          위치\t");
			System.out.println("-----------------------------------------");		
			
			while(rs.next()) {
				Dept dept = new Dept(
						rs.getInt("deptno"),
						rs.getString("dname"),
						rs.getString("loc"));
				
				deptList.add(dept);
				
//				System.out.print(rs.getInt("rownum") + "\t");
//				System.out.print(rs.getInt("deptno") + "\t");
//				System.out.printf("%11s", rs.getString("dname") + "\t");
//				System.out.printf("%10s", rs.getString("loc") + "\n");
				resultCnt++;
			}
			if(resultCnt<1) {
				System.out.println("검색 결과가 없습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
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
		return deptList;
	}
	
	public List<Dept> deptSearch(String dname) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Connection conn = null;
		
		List<Dept> deptList = new ArrayList<>();
		
		try {
			conn = ConnProvider.getConnection();
			//3. SQL 처리
			String sql = "select * from dept where dname like '%'||?||'%'";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  dname);
			
			rs = pstmt.executeQuery();
			
			System.out.println("부서번호\t 부서이름\t\t  위치\t");
			System.out.println("----------------------------------");		
			
			while(rs.next()) {
				deptList.add(new Dept(rs.getInt("deptno"),
									rs.getString("dname"),
									rs.getString("loc")));
			}
			System.out.println("----------------------------------");	
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
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
		return deptList;
	}
	

	public int deptSearchCount(String dname, Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int rowCnt = 0;
		
		try {
			conn = ConnProvider.getConnection();
			
			String sql = "select count(*) from dept where dname=?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dname);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				rowCnt=rs.getInt(1);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rowCnt;
	}
	
	public Dept deptSearchName(String dname, Connection conn) {
		Dept dept = null;
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = ConnProvider.getConnection();
			
			String sql = "select * from dept where dname = ?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dname);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dept = new Dept(rs.getInt(1),
								rs.getString(2),
								rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return dept;
	}
}
