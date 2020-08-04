package member.service;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdbc.ConnProvider;
import member.dao.MemberDao;
import member.model.Member;
import service.Service;

public class MemberDelServiceImpl implements Service {
	
	MemberDao dao;

	@Override
	public String getViewPage(HttpServletRequest request, HttpServletResponse response) {
		int resultCnt = 0;
		Connection conn = null;
		String idx = request.getParameter("idx");
		
		try {
			conn = ConnProvider.getConn();
			dao = MemberDao.getInstance();
			Member member = dao.selectMember(conn, idx);
			
			if(member==null) {
				resultCnt=-1;
			}
			resultCnt = dao.deleteMember(conn, idx);
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		request.setAttribute("resultCode", resultCnt);
		return null;
	}
}
