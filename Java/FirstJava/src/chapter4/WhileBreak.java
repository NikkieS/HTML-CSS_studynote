package chapter4;

public class WhileBreak {

	public static void main(String[] args) {
		// 1~10 까지의 숫자를 3의 배수를 제외하고 출력
		
		for(int i=1; i<=10; i++) {
			if(!(i%3==0)) {
				System.out.println(i);
			}
		}
		
		// 1~10 까지의 숫자를 3의 배수만 출력
		for(int i=1; i<=10; i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
		
		// 1~10 까지의 숫자를 3의 배수를 제외하고 출력 (continue)
		for(int i=1; i<=10; i++) {
			if (i%3==0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
