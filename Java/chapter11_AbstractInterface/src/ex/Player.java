package ex;

// class 앞에 abstract 키워드가 있는경우 이 클래스는 추상클래스 임을 의미한다
// 추상클래스는 미완성된 클래스를 의미한다
public abstract class Player {
	int currentPos;
	
	Player(){
		
	}
	
	// 추상메소드 : abstract 반환형 메소드이름(매게변수);
	abstract void play(int pos);
	
	// 추상메소드
	abstract void stop();
	
	void play() {
		play(currentPos);
	}
}
