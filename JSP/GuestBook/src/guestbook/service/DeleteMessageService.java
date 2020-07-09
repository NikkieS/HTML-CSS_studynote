package guestbook.service;

import java.sql.Connection;
import java.sql.SQLException;

import guestbook.dao.MessageDao;
import guestbook.jdbc.ConnProvider;
import guestbook.model.Message;

public class DeleteMessageService {
	private DeleteMessageService() {
	}
	private static DeleteMessageService service = new DeleteMessageService();
	public static DeleteMessageService getInstance() {
		return service;
	}
	
	MessageDao dao=null;
	
	public int deleteMessage(int mid, String pw) {
		int resultCnt = 0;
		Connection conn = null; 
		Message message = null;
		
		// 1. mid의 메세지 존재여부 확인
		// 2. 존재 O : 객체의 pw와 사용자 입력 pw 비교
		// 3. 비교의 결과가 같다면 mid의 게시물 삭제
		try {
			conn = ConnProvider.getConn();
			dao=MessageDao.getInstance();
			
			message = dao.selectMessage(conn, mid);
			
			if(message == null) {
				resultCnt = -1;
				throw new Exception("삭제할 게시글이 존재하지 않습니다.");
			}
			if(!message.getPw().equals(pw)) {
				resultCnt = -2;
				throw new Exception("비밀번호가 일치하지 않습니다.");
			}
			// 삭제
			resultCnt = dao.deleteMessage(conn, mid);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
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
		
		return resultCnt;
	}
	
}
