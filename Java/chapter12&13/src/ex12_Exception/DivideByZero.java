package ex12_Exception;

public class DivideByZero {

	public static void main(String[] args) {
		int num1=10;
		int num2=0;
		try {
			int divide = num1/num2;
			System.out.println("나눗셈 결과의 몫: "+divide);
		}catch(ArithmeticException e) {
			System.out.println("나눗셈 불가능");
			System.out.println(e.getMessage());
			e.printStackTrace();
			return;
		}finally {
			System.out.println("무조건 실행하는 finally 블록");
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
