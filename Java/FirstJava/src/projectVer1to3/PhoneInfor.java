package projectVer1to3;
/*작성자 : 송가람
작성일 : 2020.04.20
작성내용 : 전화번호 관리 프로그램 (이름, 전화번호, 생년월일)
*/

public class PhoneInfor {
	/*
	 * PhoneInfor 라는 이름의 클래스를 정의해 보자. 클래스는 다음의 데이터들의 문자열 형태로 저장이 가능 해야 하며, 저장된 데이터의
	 * 적절한 출력이 가능하도록 메소드 정의 단, 생년월일 정보는 저장할 수도 있고, 저장 않을 수도 있게끔 생성자 생성.
	 */

	// 1. 전화번호 저장
	// 2. 전화번호 정보 view (list: 전화번호, 이름, 분류)
	// 3. 전화번호 검색
	// 4. 전화번호 삭제
	private String name;		//이름
	private String phoneNumber;	//전화번호
	private String birthday;	//생년월일
	
	PhoneInfor(){
	}
	
	PhoneInfor(String name, String num){
		this(name,num, "No data entered.");
	}
	
	PhoneInfor(String name, String num, String bday){
		this.name = name;
		this.phoneNumber = num;
		this.birthday = bday;
	}
	
	void show() {
		System.out.println("Name : "+name+", Phone number : "+phoneNumber+", Birthday : "+birthday);
	}
	
	// name 속성값과 전달받은 문자열을 비교해서 반환
	boolean check(String name) {
		return this.name.equals(name);
	}
}
