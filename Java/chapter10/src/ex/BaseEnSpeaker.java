package ex;

public class BaseEnSpeaker extends Speaker {
	private int baseRate;
	
//	void showCurrentState() {
//		super.showCurrentState();
//		System.out.println("베이스 크기: "+baseRate);
//	}
	
	void setBaseRate(int base) {
		this.baseRate=base;
	}
	
	// Shift+Alt+s 단축키
	@Override
	void showCurrentState() {
		super.showCurrentState();
		System.out.println("베이스 크기: "+baseRate);
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
	
}
