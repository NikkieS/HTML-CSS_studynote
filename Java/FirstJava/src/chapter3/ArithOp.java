package chapter3;

public class ArithOp {

	public static void main(String[] args) {
		int num1;
		int num2;
		
		num1 = 10;
		num2 = 20;
		
		// 2. 덧셈 연산 -> 결과를 출력하자
		int result = num1 + num2;
		System.out.println("덧셈 결과: " + result);
		
		// 3. 뺄셈 연산 -> 결과를 출력하자
		result = num2 - num1;
		System.out.println("뺄셈 결과: " + result);
		
		// 4. 곱셈 연산 -> 결과를 출력하자
		result = num1 * num2;
		System.out.println("곱셈 결과: " + result);
		
		// 5. 나눗셈 연산 -> 결과를 출력하자
		result = num2 / num1;
		System.out.println("나눗셈 결과: " + result);
		
		// 6. 나머지 연산 -> 결과를 출력하자
		result = num1 % num2;
		System.out.println("나머지 결과: " + result);
		
	}

}
