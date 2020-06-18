package Assignment;

public class Exercise5_Methods_Arithmetic {
	//문제1. 두 개의 정수를 전달받아서, 두수의 사칙연산 결과를 출력하는 메서드와 이 메서드를 호출하는 main메서드를 정의해보자.
	//단, 나눗셈은 몫과 나머지를 각각 출력해야 한다.
	int add = 0;
	int sub = 0;
	int mul = 0;
	int div = 0;
	int remainder = 0;
	
	void arith(int a, int b) {
		add = a+b;
		mul = a*b;
		
		if (a>b) {
			sub = a-b;
			div = a/b;
			remainder = a%b;
			
		}
		else {
			sub = b-a;
			div = b/a;
			remainder = b%a;
		}
		System.out.println("첫번째 숫자: "+a+" 두번째 숫자: "+b);
		System.out.println("덧셈 결과: "+add);
		System.out.println("뺄셈 결과: "+sub);
		System.out.println("곱셈 결과: "+mul);
		System.out.println("나눗셈 몫: "+div+" 나눗셈 나머지: "+remainder);
	}
	
	public static void main(String[] args) {
		//문제1. 두 개의 정수를 전달받아서, 두수의 사칙연산 결과를 출력하는 메서드와 이 메서드를 호출하는 main메서드를 정의해보자.
		//단, 나눗셈은 몫과 나머지를 각각 출력해야 한다.
				
		//4칙연산 생성: 객체 인스턴스 화
		System.out.println("------------1번 문제------------");
		Exercise5_Methods_Arithmetic arithMethod = new Exercise5_Methods_Arithmetic();
				
		arithMethod.arith(20, 30);
	}
}
