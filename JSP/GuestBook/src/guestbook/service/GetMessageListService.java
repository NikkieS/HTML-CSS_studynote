package guestbook.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import guestbook.dao.MessageDao;
import guestbook.jdbc.ConnProvider;
import guestbook.model.Message;
import guestbook.model.MessageListView;

public class GetMessageListService {
	private GetMessageListService() {
	}
	private static GetMessageListService service = new GetMessageListService();
	public static GetMessageListService getInstance() {
		return service;
	}
	
	private MessageDao dao;
	
	// 한 페이지에 표현할 메시지의 개수
	private final int MESSAGE_COUNT_PER_PAGE = 3;
	
	public MessageListView getMessageList(int pageNumber){
		// 페이지 번호 -> 시작 행, 끝 행
		// dao -> List 요청
		Connection conn = null;
		MessageListView messageListView = null;
		try {
			conn = ConnProvider.getConn();
			dao = MessageDao.getInstance();
			
			// 페이지의 전체 메시지 구하기
			List<Message> messageList = null;
			// 전체 메시지의 개수 : dao 리스트에서 요청
			int msgTotalCount = dao.selectTotalCount(conn);
			int startRow = 0, endRow = 0;
			
			if(msgTotalCount>0) {
				// 시작 행, 마지막 행
				startRow = (pageNumber-1)*MESSAGE_COUNT_PER_PAGE+1;
				endRow = startRow+MESSAGE_COUNT_PER_PAGE-1;
				
				messageList = dao.selectMessageList(conn, startRow, endRow);
			} else {
				// 메세지가 없기때문에 pageNumber를 0으로 조정
				pageNumber = 0;
				messageList = Collections.emptyList();
			}
			
			messageListView = new MessageListView(
					msgTotalCount,
					pageNumber,
					messageList,
					MESSAGE_COUNT_PER_PAGE,
					startRow,
					endRow);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		return messageListView;
	}
}
