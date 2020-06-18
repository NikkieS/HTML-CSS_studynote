package projectVer1to3;

public class PhoneUnivInfor {
	private String name;		//이름
	private String phoneNumber;	//전화번호
	private String address;		//주소
	private String email;		//이메일
	private String major;		//전공
	private String grade;		//학년
	
	PhoneUnivInfor(String name, String phoneNumber, String address, String email, String major, String grade) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.email = email;
		this.major=major;
		this.grade=grade;
	}
	
	PhoneUnivInfor(String name, String phoneNumber, String address, String email) {
		this(name, phoneNumber, address, email, "No data entered", "No data enetered");
	}

	void show() {
		System.out.println("Name : "+name+", Phone number : "+phoneNumber+", Address : "+address+", Email : "+email);
		if(major!=null && grade!=null) {
			System.out.println("Major name : "+major+", Grade : "+grade);
		}
	}
}
