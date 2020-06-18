package chapter4;

public class LoopTest {

	public static void main(String[] args) {
		// 5번 출력
		System.out.println(5);
		System.out.println(4);
		System.out.println(3);
		System.out.println(2);
		System.out.println(1);
		
		
		//for문
		System.out.println("--------for문--------");
		for (int i=5; i>=1; i--) {
			System.out.println(i);
		}
		
		//while문
		System.out.println("-------while문-------");
		int i = 1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		
		//do-while문
		System.out.println("------dowhile문------");
		i=0;
		do {
			i++;
			System.out.println(i);
		} while(i<5);
	}

}
