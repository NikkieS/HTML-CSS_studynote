package projectVer5;

public class PhoneUnivInfor extends PhoneInfor {
	private String major;		//전공
	private String year;		//학년
	
	PhoneUnivInfor(String name, String phoneNumber, String address, String email, String major, String year) {
		super(name, phoneNumber, address, email);
		this.major=major;
		this.year=year;
	}
	
	PhoneUnivInfor(String name, String phoneNumber, String address, String email) {
		this(name, phoneNumber, address, email, "No data entered", "No data enetered");
	}

	@Override
	public void showData() {
		super.showBasicInfo();
		System.out.println(", Group : University, Major : "+major+", Year : "+year);
	}
}
