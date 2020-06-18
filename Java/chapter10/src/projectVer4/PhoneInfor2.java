package projectVer4;

public class PhoneInfor2 extends PhoneInfor {
	protected String address;		//주소
	protected String email;			//이메일
	
	PhoneInfor2(String name, String phoneNumber, String address, String email){
		super(name, phoneNumber);
		this.address = address;
		this.email = email;
	}

	@Override
	void show() {
		super.show();
		System.out.println("Address : "+address+", Email : "+email);
	}
}
