package guestbook.service;

import java.sql.Connection;
import java.sql.SQLException;

import guestbook.dao.MessageDao;
import guestbook.jdbc.ConnProvider;
import guestbook.model.Message;

public class WriteMessageService {
	
	private WriteMessageService() {
	}
	
	private static WriteMessageService service = new WriteMessageService();
	
	public static WriteMessageService getInstance() {
		return service;
	}
	
	MessageDao dao = null;
	
	public int writeMessage(Message msg) {
		int result = 0;
		dao = MessageDao.getInstance();
		// Dao의 메소드에 전달할 Connection 생성
		Connection conn = null;
		
		try {
			conn=ConnProvider.getConn();
			result=dao.insertMessage(conn, msg);
		} catch(SQLException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
