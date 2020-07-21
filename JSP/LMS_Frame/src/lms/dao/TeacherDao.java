package lms.dao;

public class TeacherDao {
	
	// 싱글톤 처리 완료
	// 자신이 사용할 Dao/Model/Service resurve 파일 번호를 항상 공유해주세용!
	private TeacherDao () {
		
	}
	
	private static TeacherDao dao = new TeacherDao();
	
	public static TeacherDao getInstance() {
		return dao;
	}
	
	
	
}
