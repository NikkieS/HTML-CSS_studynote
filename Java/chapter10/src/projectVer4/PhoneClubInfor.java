package projectVer4;

public class PhoneClubInfor extends PhoneInfor2 {
	private String club;		//동호회
	
	PhoneClubInfor(String name, String phoneNumber, String address, String email, String club) {
		super(name, phoneNumber, address, email);
		this.club = club;
	}

	@Override
	void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.print("Group : Club, ");
		if(club!=null) {
			System.out.println("Club name: "+club);
		}
	}

	@Override
	int group() {
		return 4;
	}	
}
