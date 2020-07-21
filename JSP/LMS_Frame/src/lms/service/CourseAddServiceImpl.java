package lms.service;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class CourseAddServiceImpl implements Service {

	// 자신이 사용할 Dao/Model/Service resurve 파일 번호를 항상 공유해주세용!
	
	
	@Override
	public String getViewPage(HttpServletRequest request, HttpServletResponse response) {
		int resultCnt = 0;
		Connection conn = null;
		
		String name = null;
		String teacher = null;
		String content = null;
		String day = null;
		Date startTime = null;
		Date endTime = null;
		int totalPer = 0;
		int applyPer = 0;
		int tIdx = Integer.parseInt(request.getParameter("tIdx"));
		
		try {
			boolean isMultipart = ServletFileUpload.isMultipartContent(request);
			if(isMultipart) {
				DiskFileItemFactory factory = new DiskFileItemFactory();
				
				ServletFileUpload upload = new ServletFileUpload(factory);
				
				List<FileItem> items = upload.parseRequest(request);
				Iterator<FileItem> iter = items.iterator();
				
				while(iter.hasNext()) {
					FileItem item = iter.next();
					
					if(item.isFormField()) {
						String fname = item.getFieldName();
						String fvalue = item.getString("utf-8");
						
						if(fname.equals("name")) {
							name = fvalue;
						} else if(fname.equals("teacher")) {
							teacher = fvalue;
						} else if(fname.equals("content")) {
							content = fvalue;
						} else if(fname.equals("day")) {
							day = fvalue;
						} else if(fname.equals("startTime")) {
							startTime = Date.valueOf(fvalue);
						} else if(fname.equals("endTime")) {
							teacher = fvalue;
						} else if(fname.equals("teacher")) {
							teacher = fvalue;
						} else if(fname.equals("teacher")) {
							teacher = fvalue;
						}
						
					}
				}
			}
		} catch(FileUploadException e) {
			e.printStackTrace();
		} catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch(Exception e) {
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
		
		return "/WEB-INF/views/cAdd.jsp";
	}

}
