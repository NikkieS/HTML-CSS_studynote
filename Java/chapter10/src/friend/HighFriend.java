package friend;

public class HighFriend extends Friend {
	String work;
	
	HighFriend(String name, String phoneNum, String addr, String work){
		super(name, phoneNum, addr);
		this.work = work;
	}

	@Override
	public void showData() {
		showBasicInfo();
		System.out.println("직업: "+work);
	}
}
