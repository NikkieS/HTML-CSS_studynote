package phoneGroup;

public class PhoneClubInfor {
	private String name;		//이름
	private String phoneNumber;	//전화번호
	private String address;		//주소
	private String email;		//이메일
	private String club;		//동호회
	
	PhoneClubInfor(String name, String phoneNumber, String address, String email, String club) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.email = email;
		this.club = club;
	}
	
	PhoneClubInfor(String name, String phoneNumber, String address, String email) {
		this(name, phoneNumber, address, email, "No data entered");
	}

	void show() {
		System.out.println("Name : "+name+", Phone number : "+phoneNumber+", Address : "+address+", Email : "+email);
		if(club!=null) {
			System.out.println("Club name: "+club);
		}
	}
}
