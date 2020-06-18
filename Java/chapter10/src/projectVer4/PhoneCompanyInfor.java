package projectVer4;

public class PhoneCompanyInfor extends PhoneInfor2 {
	private String company;		//직장
	
	PhoneCompanyInfor(String name, String phoneNumber, String address, String email, String company) {
		super(name, phoneNumber, address, email);
		this.company = company;
	}
	
	PhoneCompanyInfor(String name, String phoneNumber, String address, String email) {
		this(name, phoneNumber, address, email,"No data entered");
	}

	@Override
	void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.print("Group : Company, ");
		if(company!=null) {
			System.out.println("Company name: "+company);
		}
	}

	@Override
	int group() {
		return 3;
	}
}
