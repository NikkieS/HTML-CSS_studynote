package service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import dao.EmpDao;
import jdbc.ConnProvider;
import model.Emp;

public class EmpListService {
	
	private EmpListService() {
	}
	
	private static EmpListService service = new EmpListService();
	
	public static EmpListService getInstance() {
		return service;
	}
	
	EmpDao dao;
	
	// 예외처리, 트랜젝션 처리 메소드
	public List<Emp> getEmpList(){
		// 사용할 Dao 인스턴스 
		dao = EmpDao.getInstance();
		
		// Connection 객체
		Connection conn = null;
		List<Emp> list = null;
		
		try {
			conn = ConnProvider.getConn();
			list = dao.getList(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
