package com.aia.mm.service;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.aia.mm.dao.MemberDao;
import com.aia.mm.model.Member;
import com.aia.mm.model.MemberEditRequest;

@Service
public class MemberEditService {
	
	private MemberDao dao;
	
	@Autowired
	private SqlSessionTemplate template;
	
	public int editMember(MemberEditRequest editRequest, HttpServletRequest request) {
		
		dao = template.getMapper(MemberDao.class);
		
		Member member = editRequest.toMember();
		int result = 0;
		
		try {
			MultipartFile file = editRequest.getPhoto();
			
			if(file != null && !file.isEmpty() && file.getSize()>0) {
				//String uri = request.getSession().getServletContext().getInitParameter("memberUploadPath");
				String uri = "/upload";
				String realPath = request.getSession().getServletContext().getRealPath(uri);
				
				String newFileName = System.nanoTime() + "_" + file.getOriginalFilename();
				
				File saveFile = new File(realPath, newFileName);
				file.transferTo(saveFile);
				
				member.setUphoto(newFileName);
				
				File oldFile = new File(realPath, editRequest.getOldFile());
				
				if(oldFile.exists()) {
					oldFile.delete();
				}
			}
			else {
				member.setUphoto("default.png");
			}
			
			result = dao.editMember(member);
			
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
