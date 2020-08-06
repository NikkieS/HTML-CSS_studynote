package com.aia.op.member.service;

import java.io.File;
//import java.sql.Connection;
//import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.aia.op.jdbc.ConnectionProvider;
//import com.aia.op.member.dao.MemberDao;
import com.aia.op.member.dao.MemberDaoInterface;
import com.aia.op.member.model.Member;

@Service
public class MemberDeleteService {

//	@Autowired
//	MemberDao dao;
	
	private MemberDaoInterface dao;
	
	@Autowired
	private SqlSessionTemplate sessionTemplate;
	
	public String memberDelete(int idx, HttpServletRequest request) {
		
		dao = sessionTemplate.getMapper(MemberDaoInterface.class);
		
		int resultCnt = 0;
		String msg = null;
		//Connection conn = null; // mybatis 수정 0806
		Member member = null;
		
		// mybatis 수정 0806
		//conn = ConnectionProvider.getConn();
		//member = dao.selectByIdx(conn, idx);
		member = dao.selectByIdx(idx);
		
		//resultCnt= dao.deleteMember(conn, idx);
		resultCnt = dao.memberDelete(idx);
		
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
		
		return msg;
	}
}
