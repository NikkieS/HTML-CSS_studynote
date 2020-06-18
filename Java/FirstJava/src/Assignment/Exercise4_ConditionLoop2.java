package Assignment;

public class Exercise4_ConditionLoop2 {

	public static void main(String[] args) {
		// 1.다음의 문장들을 조건식으로 표현하라.
		//int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
		int x1=20;
		boolean answer1 = false;
		     
		if(x1>10 && x1<20) {
			answer1 = true;
		}
		System.out.println(answer1);
		//char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
		char ch1_2=' ';
		
		if(ch1_2!=' ' && ch1_2!='\t') {
			answer1 = true;
		}
		System.out.println(answer1);
		//char형 변수 ch가 'x'또는 'X'일 때 true인 조건식
		char ch1_3='x';
		
		if(ch1_3=='x' || ch1_3=='X') {
			answer1 = true;
		}
		System.out.println(answer1);
		//char형 변수 ch가 숫자('0'~'9')일 때 true인 조건식
		char ch1_4='8';
		
		if(ch1_4>='0' && ch1_4<='9') {
			answer1 = true;
		}
		System.out.println(answer1);
		//char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
		char ch1_5='x';
		
		if(ch1_5>='A' && ch1_5<='Z' || ch1_5>='a' && ch1_5<='z') {
			answer1 = true;
		}
		System.out.println(answer1);
		//int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을 때 true인 조건식
		int year=400;
		
		if(year%400==0 || year%4==0 && year%100!=0) {
			answer1 = true;
		}
		System.out.println(answer1);
		//boolean형 변수 powerOn가 false일 때 true인 조건식
		boolean powerOn=false;
		
		if(powerOn=false) {
			answer1 = true;
		}
		System.out.println(answer1);
		//문자열 참조변수 str이 "yes"일 때 true인 조건식
		String str1 = "no";
		
		if(str1=="yes") {
			answer1 = true;
		}
		System.out.println(answer1);
		
		
		// 2.1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오 
		int sum2=0;
		
		for(int i=1; i<=20; i++) {
			if(i%2!=0 || i%3!=0) {
				sum2+=i;
			} 
		}
		
		System.out.println(sum2);
		System.out.println("----------------------------------------");
		
		// 3.1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
		int sum3=0;
		
		for(int i=1; i<11; i++) {
			for(int j=1; j<=i; j++) {
				sum3+=j;
			}
		}
		
		System.out.println("결과 = "+sum3);
		System.out.println("----------------------------------------");
		
		// 4.1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이되는지 구하시오. 
		int num4=1; 
		int sum4=0;
		
		while(true) {
			if(num4%2==0) {
				num4=num4*-1; //음수화 해준다 
				sum4+=num4;
				num4=num4*-1; //다시 양수화 해준다 
			}
			else { 
				sum4+=num4; 
			} 
			if(sum4>=100) {
				System.out.println("마지막 수 = "+num4);
				System.out.println(sum4);
				break;
			}
			num4++; //하나씩 올려준다
		}
		
		System.out.println("----------------------------------------");
		
		// 5.다음의 for문을 while문으로 변경하시오.
		int num5_1=0;
		
		while(num5_1<=10) {
			int num5_2=0;
			while(num5_2<=num5_1) {
				System.out.print("*"); num5_2++; 
			} 
			System.out.println();
			num5_1++;
		}
		
		System.out.println("----------------------------------------");
		
		// 6.두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을작성하시오. 
		for(int i=1; i<7; i++) {
			for(int j=1; j<7; j++) {
				if(i+j== 6) {
					System.out.println("첫번째 눈: "+i+", 두번째 눈: "+j); 
				} 
			}
		}
		
		System.out.println("----------------------------------------");
		
		// 7.Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는 코드를완성하라. 
		// 0.0 ~ 1.0 사이의 난수 
		int value = (int)(Math.random()*7);
		
		System.out.println(value);
		
		System.out.println("----------------------------------------");
		
		// 8.방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는 0<=x<=10, 0<=y<=10 이다.
		for(int x=0; x<=10; x++) {
			for(int y=0; y<=10; y++) {
				if(2*x+4*y==10) {
					System.out.println("x="+x+", "+"y="+y);
				}
			}
		}
		
		System.out.println("----------------------------------------");
		
		// 9.숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를완성하라. 만일 문자열이"12345"라면, ‘1+2+3+4+5’의 결과인 15를 출력이 출력되어야 한다. (1)에 알맞은코드를 넣으시오.
		// [Hint] String클래스의 charAt(inti)을 사용 
		String str = "12345";
		int sum = 0;
		
		for(int i=0; i < str.length(); i++) {
			sum+=str.charAt(i)-'0'; //'0'=30, '1'=31, '2'=32 .... 연산시 int변환
		}
		System.out.println("sum="+sum);
		
		System.out.println("----------------------------------------");
		
		// 10.int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라. 만일 변수 num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하라. (1)에 알맞은 코드를넣으시오.
		// [Hint] 문자열로 변환하지 말고 숫자로만 처리해야 한다.
		int num10 = 12345;
		int sum10 = 0;
		
		while(num10!=0) {
			System.out.println(num10%10);
			sum10+=num10%10; //맨 뒷자리 수를 뽑아낸다 
			num10/=10; //맨 뒷자리만 자른 수를 다시 저장한다
		}
		System.out.println("sum="+sum10);
		
		System.out.println("----------------------------------------");
		
		// 11. 1과 1부터 시작하는피보나치수열의 10번째 수는 무엇인지 계산하는 프로그램을 완성하시오.
		// Fibonnaci 수열의 시작의 첫 두 숫자를 1, 1로 한다.
		int num11_1 = 1;
		int num11_2 = 1;
		int num11_3 = 0; // 세번째 값
		
		System.out.print(num11_1+","+num11_2);
		
		for (int i = 0 ; i < 8 ; i++ ) {
			num11_3 = num11_1 + num11_2;
			System.out.print(","+num11_3);
			
			//첫번째 수와 두번째수가 하나씩 밀리도록 치환해준다
			num11_1 = num11_2;
			num11_2 = num11_3;
		}
		System.out.println(" ");
		System.out.println("----------------------------------------");
		
		// 13.다음은 주어진 문자열(value)이 숫자인지를 판별하는 프로그램이다. (1)에 알맞은 코드를넣어서 프로그램을 완성하시오.
		String value13 = "12o34";
		char ch13 = ' ';
		boolean isNumber = true;
		
		// 반복문과 charAt(inti)를 이용해서 문자열의 문자를 하나씩 읽어서 검사한다.
		for(int i=0; i < value13.length(); i++) {
			if (value13.charAt(i)<=48 || value13.charAt(i)>=57 || value13.charAt(i)==ch13) {
				isNumber = false; 
			}
		}
		  
		  if (isNumber)
			  System.out.println(value13+"는 숫자입니다."); 
		  else
			  System.out.println(value13+"는 숫자가 아닙니다.");
		  
		  System.out.println("----------------------------------------");
		  
		  // 14.다음은 숫자 맞추기 게임을 작성한 것이다. 1과 100사이의 값을 반복적으로 입력해서컴퓨터가 생각한 값을 맞추면 게임이 끝난다.
		  // 사용자가 값을 입력하면, 컴퓨터는 자신이 생각한값과 비교해서 결과를 알려준다. 사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고 몇 번만에 숫자를 맞췄는지 알려준다. 
		  // (1)~(2)에 알맞은 코드를 넣어 프로그램을 완성하시오. 
		  // 1~100사이의 임의의 값을 얻어서 answer에 저장한다.
		  int answer14 = (int)(Math.random()*100)+1; 
		  int input14 = 0; // 사용자입력을 저장할 공간
		  int count14 = 0; // 시도횟수를 세기위한 변수
		  
		  // 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
		  java.util.Scanner s = new java.util.Scanner(System.in);
		  
		  do {
			  count14++;
			  System.out.print("1과 100사이의 값을 입력하세요 :");
			  
			  input14 = s.nextInt(); // 입력받은 값을 변수 input에 저장한다.
			  
			  if (input14<answer14)
				  System.out.println("더 큰 수를 입력하세요.");
			  else if (input14>answer14)
				  System.out.println("더 작은 수를 입력하세요.");
			  else {
				  System.out.println("맞췄습니다.");
				  break;}
		  }while(true); // 무한반복문
		  
		  System.out.println("----------------------------------------");
		  
		  // 15.다음은 회문수를 구하는 프로그램이다. 회문수(palindrome)란, 숫자를 거꾸로 읽어도앞으로 읽는 것과 같은 수를 말한다. 예를 들면 ‘12321’이나 ‘13531’같은 수를 말한다. (1)에알맞은 코드를 넣어서 프로그램을 완성하시오. 
		  // [Hint] 나머지 연산자를 이용하시오. 
		  int number = 12321;
		  int tmp = number;
		  int result =0; // 변수 number를 거꾸로 변환해서 담을 변수
		  
		  while(tmp !=0) {
			  result += tmp%10; //숫자의 마지막 자리수를 넣어준다; 12321 -> result = 1
			  tmp/= 10; //숫자의 마지막 자리수를 밀어준다; tmp=12321 -> tmp=1232
			  result*=10; //result의 1의자리를 10의 자리로 올려준다; 1->10, 12->120
		  } 
		  result/=10; //while문 빠져나오기전 10의 자리로 올려준 단계를 다시 복귀시킨다; 123210 -> 12321
		  
		  if(number == result) System.out.println( number + "는 회문수 입니다.");
		  
		  else System.out.println( number + "는 회문수가 아닙니다.");
		  
		  System.out.println("----------------------------------------");

	}

}
