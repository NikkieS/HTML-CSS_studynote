package friend;

/*
  	친구의 정보를 저장하기 위한 클래스
  	상속을 목적으로 기본 클래스 정의
  	기본 속성과 기능을 구성
  	
  	대학 : 이름, 전번, 주소, 이메일, 전공, 학년
  	고교 : 이름, 전번, 주소, 직업
  	
  	상위클래스
  		이름, 전번, 주소
  	하위클래스
  		대학(전공, 학년), 고교(직업)
*/

public abstract class Friend implements Info {
	String name;
	String phoneNum;
	String addr;
	
	public Friend(String name, String phoneNum, String addr) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.addr = addr;
	}
	
	public void showBasicInfo() {
		System.out.println("이름: "+this.name);
		System.out.println("전화: "+this.phoneNum);
		System.out.println("주소: "+this.addr);
	}
	
	// 기본 데이터와 하위클래스의 데이터를 출력하도록 오버라이딩한다.
	// 추상 메소드 생성
	//abstract void showData();
}
