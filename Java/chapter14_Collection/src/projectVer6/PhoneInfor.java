package projectVer6;

public abstract class PhoneInfor implements Show {
	protected String name;			//이름
	protected String phoneNumber;	//전화번호
	protected String address;		//주소
	protected String email;			//이메일
	
	PhoneInfor(String name, String phoneNumber, String address, String email){
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.email = email;
	}
	
	void showBasicInfo() {
		System.out.print("Name : "+name+", Phone number : "+phoneNumber+", Address : "+address+", Email : "+email);
	}
	
	/*
	 * 2020.04.28
	 * 수정내용 : interface 구현으로 메소드 오버라이딩 생략
	 * PhoneInfor 클래스 -> 추상클래스
	 */
//	@Override
//	public void showData() {
//		showBasicInfo();
//		System.out.println(" ");
//	}

	// name 속성값과 전달받은 문자열을 비교해서 반환
	boolean check(String name) {
		// equals : 객체끼리 값을 비교하는 String의 메소드
		// == 연사자 : 비교하고자 하는 대상의 주소값을 비교
		return this.name.equals(name);
	}
}
