package phoneBook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class pbDao {
	
	String getKey() {
		Statement stmt = null;
		Connection conn = null;
		ResultSet rs = null;
		String key = null;
		
		try {
			conn = ConnProvider.getConnection();
			
			stmt = conn.createStatement();
			String sql = "select phonebook_pidx_seq.nextval from dual";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				key = rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			
			if(rs != null) {
				try {
					rs.close();
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

		return key;
	}
	
	public int basicInsert(pbDto info) {
		PreparedStatement pstmt = null;
		Connection conn = null;
		int resultCnt = 0;
		
		try {
			conn = ConnProvider.getConnection();
			
			String sql = "insert into phonebook (pidx, pname, pnum, padd, pemail) "
					+ " values (?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, info.getPidx());
			pstmt.setString(2, info.getPname());
			pstmt.setString(3, info.getPnum());
			pstmt.setString(4, info.getPadd());
			pstmt.setString(5, info.getPemail());
	
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
	
	public int univInsert(pbDto info) {
		PreparedStatement pstmt = null;
		Connection conn = null;
		int resultCnt = 0;
		
		try {
			conn = ConnProvider.getConnection();
			
			String sql = "insert into phonebook (pidx, pname, pnum, padd, pemail, ptype, pumajor, puyear) "
					+ " values (?, ?, ?, ?, ?, ?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, info.getPidx());
			pstmt.setString(2, info.getPname());
			pstmt.setString(3, info.getPnum());
			pstmt.setString(4, info.getPadd());
			pstmt.setString(5, info.getPemail());
			pstmt.setString(6, info.getPtype());
			pstmt.setString(7, info.getPumajor());
			pstmt.setInt(8, info.getPuyear());
			
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
	
	public int comInsert(pbDto info) {
		PreparedStatement pstmt = null;
		Connection conn = null;
		int resultCnt = 0;
		
		try {
			conn = ConnProvider.getConnection();
			
			String sql = "insert into phonebook (pidx, pname, pnum, padd, pemail, ptype, pcomname, pcomdept, pcomjob) "
					+ " values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, info.getPidx());
			pstmt.setString(2, info.getPname());
			pstmt.setString(3, info.getPnum());
			pstmt.setString(4, info.getPadd());
			pstmt.setString(5, info.getPemail());
			pstmt.setString(6, info.getPtype());
			pstmt.setString(7, info.getPcomname());
			pstmt.setString(8, info.getPcomdept());
			pstmt.setString(9, info.getPcomjob());
			
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
	
	public int cafeInsert(pbDto info) {
		PreparedStatement pstmt = null;
		Connection conn = null;
		int resultCnt = 0;
		
		try {
			conn = ConnProvider.getConnection();
			
			String sql = "insert into phonebook (pidx, pname, pnum, padd, pemail, ptype, pcafename, pcafenickname) "
					+ " values (?, ?, ?, ?, ?, ?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, info.getPidx());
			pstmt.setString(2, info.getPname());
			pstmt.setString(3, info.getPnum());
			pstmt.setString(4, info.getPadd());
			pstmt.setString(5, info.getPemail());
			pstmt.setString(6, info.getPtype());
			pstmt.setString(7, info.getPcafename());
			pstmt.setString(8, info.getPcafenickname());
			
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
	
	public int basicEdit(pbDto info, Connection conn) {
		PreparedStatement pstmt = null;
		int resultCnt = 0;
		
		try {
			String sql = "update phonebook set pname = ?, pnum = ?, padd = ?, pemail = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, info.getPname());
			pstmt.setString(2, info.getPnum());
			pstmt.setString(3, info.getPadd());
			pstmt.setString(4, info.getPemail());
			
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
		}
		return resultCnt;
	}
	
	public int univEdit(pbDto info, Connection conn) {
		PreparedStatement pstmt = null;
		int resultCnt = 0;
		
		try {
			String sql = "update phonebook set pname = ?, pnum = ?, padd = ?, pemail = ?, ptype = ? "
					+ " pumajor = ?, puyear = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, info.getPname());
			pstmt.setString(2, info.getPnum());
			pstmt.setString(3, info.getPadd());
			pstmt.setString(4, info.getPemail());
			pstmt.setString(5, info.getPtype());
			pstmt.setString(6, info.getPumajor());
			pstmt.setInt(7, info.getPuyear());
			
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
		}
		return resultCnt;
	}
	
	public int comEdit(pbDto info, Connection conn) {
		PreparedStatement pstmt = null;
		int resultCnt = 0;
		
		try {
			String sql = "update phonebook set pname = ?, pnum = ?, padd = ?, pemail = ?, ptype = ? "
					+ " pcomname = ?, pcomdept = ?, pcomjob = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, info.getPname());
			pstmt.setString(2, info.getPnum());
			pstmt.setString(3, info.getPadd());
			pstmt.setString(4, info.getPemail());
			pstmt.setString(5, info.getPtype());
			pstmt.setString(6, info.getPcomname());
			pstmt.setString(7, info.getPcomdept());
			pstmt.setString(8, info.getPcomjob());
			
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
		}
		return resultCnt;
	}
	
	public int cafeEdit(pbDto info, Connection conn) {
		PreparedStatement pstmt = null;
		int resultCnt = 0;
		
		try {
			String sql = "update phonebook set pname = ?, pnum = ?, padd = ?, pemail = ?, ptype = ? "
					+ " pcafename = ?, pcafenickname = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, info.getPname());
			pstmt.setString(2, info.getPnum());
			pstmt.setString(3, info.getPadd());
			pstmt.setString(4, info.getPemail());
			pstmt.setString(5, info.getPtype());
			pstmt.setString(6, info.getPcafename());
			pstmt.setString(7, info.getPcafenickname());
			
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
		}
		return resultCnt;
	}
	
	public int Delete(String pname) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int resultCnt = 0;
		
		try {
			conn = ConnProvider.getConnection();
			
			String sql = "delete from phonebook where pname = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pname);
			
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
	
	public List<pbDto> Search(String pname){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Connection conn = null;
		
		List<pbDto> list = new ArrayList<>();
		
		try {
			conn = ConnProvider.getConnection();
			
			String sql = "select * from phonebook where pname like '%'||?||'%'";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pname);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				list.add(new pbDto(rs.getString("pidx"),
									rs.getString("pname"),
									rs.getString("pnum"),
									rs.getString("padd"),
									rs.getString("pemail"),
									rs.getString("ptype"),
									rs.getString("pumajor"),
									rs.getInt("puyear"),
									rs.getString("pcomname"),
									rs.getString("pcomdept"),
									rs.getString("pcomjob"),
									rs.getString("pcafename"),
									rs.getString("pcafenickname")));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
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
		
		return list;
	}
	
	public List<pbDto> basicList(){
		Statement stmt = null;
		ResultSet rs = null;
		Connection conn = null;
		
		List<pbDto> list = new ArrayList<>();
		
		try {
			conn = ConnProvider.getConnection();
			String sql = "select pidx, pname, pnum, padd, pemail from phonebook";
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			int resultCnt = 0;
			
			while(rs.next()) {
				list.add(new pbDto(rs.getString("pidx"),
									rs.getString("pname"),
									rs.getString("pnum"),
									rs.getString("padd"),
									rs.getString("pemail")));
				resultCnt++;
			}
			
			if(resultCnt<1) {
				System.out.println("저장된 데이터가 없습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			if(stmt != null) {
				try {
					stmt.close();
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
		return list;
	}
	
	public List<pbDto> univList(){
		Statement stmt = null;
		ResultSet rs = null;
		Connection conn = null;
		
		List<pbDto> list = new ArrayList<>();
		
		try {
			conn = ConnProvider.getConnection();
			String sql = "select pidx, pname, pnum, padd, pemail, ptype, pumajor, puyear from phonebook where ptype = 'univ'";
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			int resultCnt = 0;
			
			while(rs.next()) {
				list.add(new pbDto(rs.getString("pidx"),
									rs.getString("pname"),
									rs.getString("pnum"),
									rs.getString("padd"),
									rs.getString("pemail"),
									rs.getString("ptype"),
									rs.getString("pumajor"),
									rs.getInt("puyear")));
				resultCnt++;
			}
			
			if(resultCnt<1) {
				System.out.println("저장된 데이터가 없습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			if(stmt != null) {
				try {
					stmt.close();
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
		return list;
	}
	
	public List<pbDto> comList(){
		Statement stmt = null;
		ResultSet rs = null;
		Connection conn = null;
		
		List<pbDto> list = new ArrayList<>();
		
		try {
			conn = ConnProvider.getConnection();
			String sql = "select pidx, pname, pnum, padd, pemail, ptype, pcomname, pcomdept, pcomjob from phonebook where ptype = 'com'";
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			int resultCnt = 0;
			
			while(rs.next()) {
				list.add(new pbDto(rs.getString(1),
									rs.getString(2),
									rs.getString(3),
									rs.getString(4),
									rs.getString(5),
									rs.getString(6),
									rs.getString(7),
									rs.getString(8),
									rs.getString(9)));
				resultCnt++;
			}
			
			if(resultCnt<1) {
				System.out.println("저장된 데이터가 없습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			if(stmt != null) {
				try {
					stmt.close();
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
		return list;
	}
	
	public List<pbDto> cafeList(){
		Statement stmt = null;
		ResultSet rs = null;
		Connection conn = null;
		
		List<pbDto> list = new ArrayList<>();
		
		try {
			conn = ConnProvider.getConnection();
			String sql = "select pidx, pname, pnum, padd, pemail, ptype, pcafename, pcafenickname from phonebook where ptype = 'cafe'";
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			int resultCnt = 0;
			
			while(rs.next()) {
				list.add(new pbDto(rs.getString(1),
									rs.getString(2),
									rs.getString(3),
									rs.getString(4),
									rs.getString(5),
									rs.getString(6),
									rs.getString(7),
									rs.getString(8)));
				resultCnt++;
			}
			
			if(resultCnt<1) {
				System.out.println("저장된 데이터가 없습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			if(stmt != null) {
				try {
					stmt.close();
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
		return list;
	}

	
	public int SearchCount(String pname, Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int rowCnt = 0;
		
		try {
			conn = ConnProvider.getConnection();
			
			String sql = "select count(*) from phonebook where pname=?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, pname);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				rowCnt=rs.getInt(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowCnt;
	}

	public pbDto SearchName(String pname, Connection conn) {
		pbDto data = null;
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = ConnProvider.getConnection();
			
			String sql = "select * from phonebook where pname = ?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, pname);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				data = new pbDto(rs.getString("pidx"),
								rs.getString("pname"),
								rs.getString("pnum"),
								rs.getString("padd"),
								rs.getString("pemail"),
								rs.getString("ptype"),
								rs.getString("pumajor"),
								rs.getInt("puyear"),
								rs.getString("pcomname"),
								rs.getString("pcomdept"),
								rs.getString("pcomjob"),
								rs.getString("pcafename"),
								rs.getString("pcafenickname"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return data;
	}
}
