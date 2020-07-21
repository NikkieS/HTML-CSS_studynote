package lms.dao;

public class ClassDao {
	
	// 싱글톤 처리 완료
	// 자신이 사용할 Dao/Model/Service resurve 파일 번호를 항상 공유해주세용!
	private ClassDao () {
		
	}
	
	private static ClassDao dao = new ClassDao();
	
	public static ClassDao getInstance() {
		return dao;
	}
	
	
	
}
