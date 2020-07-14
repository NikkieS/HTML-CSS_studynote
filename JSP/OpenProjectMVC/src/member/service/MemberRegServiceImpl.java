package member.service;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import jdbc.ConnProvider;
import member.dao.MemberDao;
import member.model.Member;
import service.Service;

public class MemberRegServiceImpl implements Service {

	@Override
	public String getViewPage(HttpServletRequest request, HttpServletResponse response) {
		
		// 파일 업로드 : 사진
		// 사용자 데이터 받기: uid, upw, uname, uphoto(경로)
		
		int resultCnt = 0;
		MemberDao dao=null;
		
		// 데이터 베이스에 입력할 데이터 변수
		String uid=null;
		String upw=null;
		String uname=null;
		String uphoto=null;
		
		Connection conn = null;
		
		try {
			// 1. multipart/form-data 여부 확인
			boolean isMultipart = ServletFileUpload.isMultipartContent(request);
			if (isMultipart){
				// 2. 메모리나 파일로 업로드 파일 보관하는 FileItem의 Factory 설정
				DiskFileItemFactory factory = new DiskFileItemFactory();
				
				// 3. 업로드 요청을 처리하는 ServletFileUpload 생성
				ServletFileUpload upload = new ServletFileUpload(factory);
				
				// 4. 업로드 요청 파싱해서 FileItem 목록 구함
				List<FileItem> items = upload.parseRequest(request);
				Iterator<FileItem> iter = items.iterator();
				
				while(iter.hasNext()){
					FileItem item = iter.next();
					
					// 5. FileItem이 폼 입력 항목인지 여부에 따라 알맞은 처리
					// isFormField()
					if(item.isFormField()){ // 텍스트 입력인 경우
						String name = item.getFieldName();
						String value = item.getString("utf-8");
						
						if(name.equals("uid")) {
							uid = value;
						} else if(name.equals("upw")) {
							upw = value;
						} else if(name.equals("uname")) {
							uname = value;
						}
					} else{ // 파일 업로드인 경우
						// 서버 내부의 경로
						String uri = "/upload/users";
			
						// alternative solution
						String realPath = request.getSession().getServletContext().getRealPath(uri);
						String newFileName= System.nanoTime()+"_"+item.getName();
						
						// 서버의 저장소에 실제 저장
						// File saveFile = new File(realPath, filename); // 파일 이름이 같기 때문에 중복업로드 시 덮어쓰게 된다 -> 파일 이름을 특별하게 지정하기
						File saveFile = new File(realPath, newFileName);
						item.write(saveFile);
						System.out.println("저장 완료");
						
						// saveFile.delete();
						uphoto = uri+"/"+newFileName;
					}
				}
				
				// 데이터 베이스 저장
				Member member = new Member();
				member.setUid(uid);
				member.setUpw(upw);
				member.setUname(uname);
				member.setUphoto(uphoto); // 경로
				
				conn = ConnProvider.getConn();
				dao = MemberDao.getInstance();
				
				resultCnt = dao.insertMember(conn, member);
				
				request.setAttribute("member", member);
			}
			
		} catch (FileUploadException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (Exception e) {
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
		
		return "/WEB-INF/views/member/reg.jsp";
	}

}
