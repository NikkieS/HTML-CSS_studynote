package member.service;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdbc.ConnProvider;
import member.dao.MemberDao;
import service.Service;

public class IdCheckServiceImpl implements Service {
	
	MemberDao dao;
	
	@Override
	public String getViewPage(HttpServletRequest request, HttpServletResponse response) {
		String result = "N";
		String id = request.getParameter("uid");
		Connection conn = null;
		
		try {
			conn = ConnProvider.getConn();
			dao = MemberDao.getInstance();
			int resultCnt = dao.selectById(conn, id);
			
			if(resultCnt < 1) {
				result="Y";
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		request.setAttribute("idCheck", result);
		
		return "/WEB-INF/views/member/idCheck.jsp";
	}
}
