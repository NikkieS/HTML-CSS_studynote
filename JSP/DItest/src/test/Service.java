package test;

public class Service {
	
	// Service 클래스는 Dao 클래스에 의존한다.
	//Dao dao = new Dao();
	
	// setter를 생성하여 의존성을 낮춘다 ********************************
	Dao dao;
	// interface를 이용하여 의존성을 더 낮춘다 *************************** 
	MemberDao mdao;	// service 코드 변경이 있어도 컴파일이 불필요하게 한다
	
	public void setDao(MemberDao dao) {
		this.dao = dao;
	}
	
	public void print() {
		dao.print();
	}
}
