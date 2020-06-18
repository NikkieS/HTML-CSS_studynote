package chapter4;

public class SwitchBreak {

	public static void main(String[] args) {
		int menuNum = 4;
		
		// 대입되는 숫자 케이스부터 실행
		switch(menuNum) {
		case 1:
			System.out.println("1. Simle Jave");
		case 2:
			System.out.println("2. Funny Java");
		case 3:
			System.out.println("3. Fantastic Java");
		// 케이스들에 적합하지 않을때 
		default:
			System.out.println("d. The best programming language");
		}
		System.out.println("Do you like coffee?");
	}

}
