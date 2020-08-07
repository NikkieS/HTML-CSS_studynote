package com.aia.mm.service;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.mm.dao.MemberDao;
import com.aia.mm.model.Member;

@Service
public class MemberDeleteService {
	
	private MemberDao dao;
	
	@Autowired
	private SqlSessionTemplate template;
	
	public int deleteMember(int idx, HttpServletRequest request) {
		
		dao = template.getMapper(MemberDao.class);
		
		int result = 0;
		
		Member member = dao.selectByIdx(idx);
		
		// 사진 파일도 물리적인 삭제 필요!!
		String photo = member.getUphoto();
		
		if(photo != null && photo.length()>0 && photo.equals("default.png")) {
			String uri = "/upload";
			String realPath = request.getSession().getServletContext().getRealPath(uri);
			
			File oldPhoto = new File(realPath, member.getUphoto());
			
			if(oldPhoto.exists()) {
				oldPhoto.delete();
			}
		}
		
		result = dao.deleteMember(idx);
		
		return result;
	}
}
