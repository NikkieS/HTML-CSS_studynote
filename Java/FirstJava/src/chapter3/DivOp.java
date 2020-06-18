package chapter3;

public class DivOp {

	public static void main(String[] args) {
		int num1 = 7;
		int num2 = 3;
		
		// 정수의 나누기 연산
		System.out.println("정수의 나눗셈: " + num1/num2);
		
		// 실수의 나누기 연산
		System.out.println("실수형 나눗셈: " + 7f/3f); // 리터럴로만 가능하다
		System.out.println("실수의 나눗셈: " + (float)num1/num2);	//num2는 num1과 연산시 float화 해준다					
	}

}
