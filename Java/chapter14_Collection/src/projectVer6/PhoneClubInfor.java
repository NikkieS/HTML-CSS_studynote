package projectVer6;

public class PhoneClubInfor extends PhoneInfor {
	private String club;		//동호회
	
	PhoneClubInfor(String name, String phoneNumber, String address, String email, String club) {
		super(name, phoneNumber, address, email);
		this.club = club;
	}

	@Override
	public void showData() {
		// TODO Auto-generated method stub
		super.showBasicInfo();
		System.out.print("Group : Club, ");
		if(club!=null) {
			System.out.println("Club name: "+club);
		}
	}
}
