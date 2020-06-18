package scm;

public class Computer extends Product{
	
	Computer(int price){
		super(price);
	}

	@Override
	public String toString() {
		return "Computer";
	}
	
	void programming() {
		System.out.println("프로그래밍을 합니다.");
	}
	
	
}
