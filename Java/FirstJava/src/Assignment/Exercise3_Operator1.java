package Assignment;

public class Exercise3_Operator1 {

	public static void main(String[] args) {
		// 1. int 형 변수 num1, num2, num3가 각각 10,20,30 으로 초기화 되어 있다.
		// 다음문장을 실행하면 각각 변수에는 어떠한 값이 저장되겠는가?
		// num1=num2=num3 ;
		// 확인 하는 코드를 작성하고, 그 결과에 대해 설명.
		  
		int num1 = 10, num2 = 20, num3 = 30;
		  
		num1=num2=num3; 
		// 대입연산자이므로 오른쪽에서 부터 왼쪽으로 진행된다
		// num3의 30이 num2에 저장 num2의 30이 num1에 저장
		  
		System.out.println(num1); // 출력: 30
		System.out.println(num2); // 출력: 30
		System.out.println(num3); // 출력: 30
		  
		// 2. 수학식 {{(25x5)+(36-4)}-72}/5 의 계산결과를 출력하는 프로그램 작성.
		  
		System.out.println(((25*5+(36-4))-72)/5);
		  
		// 3. 3+6, 3+6+9, 3+6+9+12 의 연산을 하는 프로그램 작성. 단. 덧셈 연산의 횟수 최소화
		  
		int num4 = 3+6;
		int num5 = num4 + 9;
		int num6 = num5 + 12;
		  
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		  
		// 4. a= {{(25+5)+(36/4)}-72}*5, b= {{(25x5)+(36-4)}-71}/4, c=(128/4)*2 일 때
		//a>b>c 가 참이면 true 아니면 false를 출력하는 프로그램 작성
		  
		int a = ((25+5+36/4)-72)*5; // a = -165
		float b = (float)((25*5+36-4)-71)/4; // b = 21.5
		int c = (128/4)*2; // c = 64

		if ((a>b) && (b>c)) {
		 System.out.println(true);
		}
		else {
		 System.out.println(false);
		}

	}

}
