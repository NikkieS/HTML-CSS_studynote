package chapter3;

public class SCE { // SCE : Short Circuit Evaluation
	public static void main (String[] args) {
		int num1 = 0, num2 = 0;
		boolean result;
		
		result = (num1 += 10)<0 && (num2+=10)>0;	//num1 < 0에서 false임으로 다음 비교연산은 하지 않음
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1 + ", num2 = " + num2);
		
		result = (num1+=10)>0 || (num2+=10)>0;	// num1 > 0이 true임으로 다음 비교연산은 하지 않음
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1 + ", num2 = " + num2);
		
		// 이항 연산자의 특징 : 피연산자 중 표현범위가 큰 타입으로 형변환 한다.
		byte a = 10;
		byte b = 20;
		
		byte c = (byte)(a+b);
	}
}
