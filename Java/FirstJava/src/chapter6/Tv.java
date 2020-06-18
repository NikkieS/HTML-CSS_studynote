package chapter6;

public class Tv {
	
	// Tv의 속성(변수) -> 멤버 변수, 인스턴스 변수
	String color;	//Tv색상 값
	boolean power;	//Tv의 전원 상태
	int channel;	//Tv의 채널 값
	
	//Tv의 기능 -> 메소드, 클래스의 멤버
	//Tv의 전원 키고/끄는 기능
	
	void power() {
		power = !power;
	}
	
	//채널을 올려줌
	void channelUp() {
		channel++;
	}
	
	//채널을 내려줌
	void channelDown() {
		channel--;
	}
}

class TvTest{
	public static void main(String[] args) {
		Tv t;
		t = new Tv();
		t.channel=7;
		t.channelDown();
		System.out.println("현재 채널은" + t.channel + "입니다.");
	}
}
