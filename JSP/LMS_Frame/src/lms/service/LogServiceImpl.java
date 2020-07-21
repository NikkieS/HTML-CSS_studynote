package lms.service;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbcp.ConnectionProvider;
import lms.dao.AdminDao;
import lms.dao.StudentDao;
import lms.dao.TeacherDao;

	
public class LogServiceImpl implements Service {

	// 자신이 사용할 Dao/Model/Service resurve 파일 번호를 항상 공유해주세용!
	StudentDao sDao;
	TeacherDao tDao;
	AdminDao aDao;
	
	@Override
	public String getViewPage(HttpServletRequest request, HttpServletResponse response) {
		int resultCnt = 0;
		Connection conn = null;
		String type = request.getParameter("loginType");
		String uid = request.getParameter("uid");
		String upw = request.getParameter("upw");
		
		try {
			conn = ConnectionProvider.getConnection();
			if(type.equals("sLogin")) {
				sDao = sDao.getInstance();
				resultCnt = sDao.selectById(conn, uid, upw);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		request.setAttribute("result", resultCnt);
		return "/WEB-INF/views/loginConfirm.jsp";
	}

}
