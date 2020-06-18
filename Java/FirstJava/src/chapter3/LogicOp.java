package chapter3;

public class LogicOp {

	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		// int num1 = 10;
		// int num2 = 20;
		
		// num1이 num2보다 큰지 확인
		// 큰 경우 -> true, 작은 경우 -> false
		boolean check1 = num1 > num2;
		
		if (check1) {
			System.out.println("num1의 값이 num2의 값보다 큽니다.");
		}
		else {
			System.out.println("num1의 값이 num2의 값보다 작습니다.");
		}
		
		boolean result1 = num1 == 10 && num2 == 20;
		boolean result2 = num1 <= 12 || num2 >= 30;
		
		System.out.println("num1==10 그리고 num2==20: " + result1);
		System.out.println("num1<=12 또는 num2 >=30: " + result2);
		
		if ((num1!=num2))
			System.out.println("num1과 num2는 같지 않다.");
		else
			System.out.println("num1과 num2는 같다.");
		
		System.out.println("-------------------------");
		
		int age = 20;
		char gender = 'w';
		boolean mCheck = true;
		
		boolean result = age > 19 && gender == 'w' && mCheck;
		
		if (result) {
			System.out.println("메시지를 보냅니다.");
		}
	}

}
