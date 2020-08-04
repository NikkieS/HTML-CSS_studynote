package com.aia.op.member.service;

import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.op.jdbc.ConnectionProvider;
import com.aia.op.member.dao.MemberDao;
import com.aia.op.member.model.Member;

@Service
public class MemberDeleteService {

	@Autowired
	MemberDao dao;
	
	public String memberDelete(int idx, HttpServletRequest request) {
		int resultCnt = 0;
		String msg = null;
		Connection conn = null;
		Member member = null;
		
		try {
			conn = ConnectionProvider.getConn();
			member = dao.selectByIdx(conn, idx);
			
			resultCnt= dao.deleteMember(conn, idx);
			
			String photo = member.getUphoto();
			
			// 회원정보 삭제 시 파일도 삭제
			if(photo != null && photo.length()>0 && !photo.equals("default.png")) {
				// 서버 내부 경로
				String uri = request.getSession().getServletContext().getInitParameter("memberUploadPath");
				
				// 시스템의 실제(절대) 경로
				String realPath = request.getSession().getServletContext().getRealPath(uri);
				
				// 기존 파일을 삭제
				File oldFile = new File(realPath, member.getUphoto());
				
				// 파일이 존재하면
				if(oldFile.exists()) {
					oldFile.delete();
				}
			}
			
			msg = resultCnt > 0? "정상적으로 삭제되었습니다." : "요청하신 회원의 정보가 존재하지 않습니다.";
		} catch(SQLException e) {
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
		
		return msg;
	}
}
