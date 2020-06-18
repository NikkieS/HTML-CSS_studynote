package ex;

public class Overriding {

	public static void main(String[] args) {
		// 다향성 : 상위클래스 타입의 참조변수에 하위클래스의 인스턴스를 저장
		Speaker sp=new BaseEnSpeaker();
		// 참조변수 sp=BaseEnSpeaker 인스턴스 멤버 중 speaker가 가지던 멤버만 사용한다.
		sp.showCurrentState();
		//sp.setBaseRate(100); 컴파일 에러
		
		BaseEnSpeaker bs=new BaseEnSpeaker();
		bs.setVolume(10);
		bs.setBaseRate(20);
		bs.showCurrentState();
	}

}
