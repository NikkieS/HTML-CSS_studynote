package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Report;


public class ReportDao {
	private ReportDao() {
	}
	private static ReportDao dao = new ReportDao();
	public static ReportDao getInstance() {
		return dao;
	}

	public int insertReport(Connection conn, Report report) throws SQLException {
		PreparedStatement pstmt = null;
		int resultCnt = 0;
		
		String sql = "insert into report values (report_seq.nextVal, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, report.getUname());
			pstmt.setString(2, report.getStn());
			pstmt.setString(3, report.getReport());
			
			resultCnt = pstmt.executeUpdate();
		} finally {
			if(pstmt != null) {
				pstmt.close();
			}
		}
		
		return resultCnt;
	}
}
