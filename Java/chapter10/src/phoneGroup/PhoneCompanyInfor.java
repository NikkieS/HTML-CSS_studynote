package phoneGroup;

public class PhoneCompanyInfor {
	private String name;		//이름
	private String phoneNumber;	//전화번호
	private String address;		//주소
	private String email;		//이메일
	private String company;		//직장
	
	PhoneCompanyInfor(String name, String phoneNumber, String address, String email, String company) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.email = email;
		this.company = company;
	}
	
	PhoneCompanyInfor(String name, String phoneNumber, String address, String email) {
		this(name, phoneNumber, address, email,"No data entered");
	}

	void show() {
		System.out.println("Name : "+name+", Phone number : "+phoneNumber+", Address : "+address+", Email : "+email);
		if(company!=null) {
			System.out.println("Company name: "+company);
		}
	}
}
