package projectVer4;

public class PhoneUnivInfor extends PhoneInfor2 {
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
	void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.print("Group : University, ");
		if(major!=null && year!=null) {
			System.out.println("Major : "+major+", Year : "+year);
		}
	}

	@Override
	int group() {
		return 2;
	}
}
