package chapter4;

public class IEBasic {

	public static void main(String[] args) {
		// 홀수 짝수 판별
		int num = 10;
		
		if(num > 0)
			System.out.println("num은 0보다 크다.");
		if((num % 2) == 0)
			System.out.println("num은 짝수");
		else
			System.out.println("num은 홀수");
	}

}
