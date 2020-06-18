package projectVer4;

public class PhoneInfor {
	
	protected String name;			//이름
	protected String phoneNumber;	//전화번호
	private String birthday;		//생년월일
	
	public PhoneInfor(){
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
		System.out.print("Name : "+name+", Phone number : "+phoneNumber+", ");
	}
	
	// 어떤 그룹인지 반환
	int group() {
		return 1;
	}
	
	// name 속성값과 전달받은 문자열을 비교해서 반환
	boolean check(String name) {
		// equals : 객체끼리 값을 비교하는 String의 메소드
		// == 연사자 : 비교하고자 하는 대상의 주소값을 비교
		return this.name.equals(name);
	}

}
