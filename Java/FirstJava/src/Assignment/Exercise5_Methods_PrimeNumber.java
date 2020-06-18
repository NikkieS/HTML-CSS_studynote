package Assignment;
//문제4. 전달되는 값이 소수(prime number)인지 아닌지를 판단하여, 소수인경우 true를, 소수가 아닌 경우 false를 반환하는 메서드를 정의하고, 
//이를 이용해서 1이상 100 이하의 소수를 전부 출력할 수 있도록 main 메서드를 정의하자.
public class Exercise5_Methods_PrimeNumber {
	boolean prime(int a) {
		boolean result = true;
		int count = 0;
		
		// 1~100 사이에 나누어 떨어지는 숫자가 있는지 for문으로 확인
		for(int num=1; num<=100; num++) {
			if(a%num==0)
				count += 1;
			
			if (count>2)	//1과 자기자신 외 더 나눌 수 있다면(분할자가 2개보다 많음) 소수가 아님
				result = false;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("------------4번 문제------------");
		
		Exercise5_Methods_PrimeNumber numP = new Exercise5_Methods_PrimeNumber();
		
		for(int num=1; num<=100; num++) {
			if (numP.prime(num)==true) {
				System.out.println(num+"은 소수 입니다.");
			}
		}
	}
}
