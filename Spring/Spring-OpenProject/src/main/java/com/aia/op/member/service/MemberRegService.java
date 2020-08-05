package com.aia.op.member.service;

import java.io.File;
import java.io.IOException;
//import java.sql.Connection;
//import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.aia.op.member.dao.MemberDaoInterface;
//import com.aia.op.jdbc.ConnectionProvider;
//import com.aia.op.member.dao.MemberDao;
//import com.aia.op.member.dao.MybatisMemberDao;
import com.aia.op.member.model.Member;
import com.aia.op.member.model.MemberRegRequest;

@Service
public class MemberRegService {
	
//	@Autowired
//	MemberDao dao;
	
//	@Autowired
//	MybatisMemberDao dao;
	
	private MemberDaoInterface dao;
	@Autowired
	private SqlSessionTemplate sessionTemplate;
	
	public int memberReg(MemberRegRequest regRequest, HttpServletRequest request) {
		
		dao = sessionTemplate.getMapper(MemberDaoInterface.class);
		
		int resultCnt = 0;
		
		// Dao 메소드에 전달할 객체: 입력할 데이터 모두 설정하는 절차가 필요.
		Member member = regRequest.toMember(); // DB의 파일 타입은 Multipart가 아니기때문에 file타입을 제외한 변수들을 먼저 설정 해 줌
		
		// mybatis 수정 0805
		// Connection conn = null;
		
		try {
			// mybatis 수정 0805
			// conn = ConnectionProvider.getConn();
			MultipartFile file = regRequest.getPhoto();	
			System.out.println("입력 전 IDX ===> " + member.getIdx());
			
			// 사진이 있다면 사진 파일을 물리적으로 저장하고, 없다면 기본 이미지 파일의 경로를 저장한다.
			if(file != null && !file.isEmpty() && file.getSize()>0) {
				
				// 서버 내부의 경로
				String uri = request.getSession().getServletContext().getInitParameter("memberUploadPath");
				
				// 시스템의 실제(절대) 경로
				String realPath = request.getSession().getServletContext().getRealPath(uri);
				
				// 저장할 이미지 파일의 새로운 이름 생성
				String newFileName = System.nanoTime() + "_" + file.getOriginalFilename();
				
				// 서버의 저장소에 실제 저장
				File saveFile = new File(realPath, newFileName);
				file.transferTo(saveFile);
				System.out.println("저장 완료: "+newFileName);
				
				// 데이터베이스에 저장할 Member 객체의 데이터를 완성한다.
				member.setUphoto(newFileName);
			} else {
				member.setUphoto("default.png");
			}
			
			// mybatis 수정 0805
			// resultCnt = dao.insertMember(conn, member);
			resultCnt = dao.insertMember(member);
			System.out.println("입력 전 IDX ===> " + member.getIdx());
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
//			finally {
//			if(conn != null) {
//				try {
//					conn.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//		}
		
		return resultCnt;
	}
}
