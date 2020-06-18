package Assignment;

public class Exercise4_ConditionLoop1 {

	public static void main(String[] args) {
		// 1. 아래 예제는 두 개의 if문을 사용하고 있다. 한 개의 if 문만 사용하는 방식으로 변경해보자.
		int num1=120;
		
		if(num1>0 && (num1%2)==0)
		System.out.println("양수이면서 짝수");
		System.out.println("----------------------------------------");
		
		// 2. 다음과 같이 출력이 이루어지도록 작성해보자.
		int num2=-1;
		
		if (num2>=300) {
			System.out.println("300이상");
		}
		else if (200<=num2) {
			System.out.println("200이상 300미만");
		}
		else if (100<=num2) {
			System.out.println("100이상 200미만");
		}
		else if (0<=num2) {
			System.out.println("0이상 100미만");
		}
		else {
			System.out.println("0미만");
		}
		System.out.println("----------------------------------------");
		
		// 3. CondOp.java를 조건연산자(3항 연산자)를 사용하지 않고, if~else를 사용하는 형태로 변경해 보자.
		/*
		 * int num1=50, num2=100; int big, diff; big = (num1>num2)? num1:num2;
		 * System.out.println(big); diff = (num1>num2)? num1-num2: num2-num1;
		 * System.out.println(diff);
		 */
		
		int num3_1=50, num3_2=100;
		int big, diff;
		
		if (num3_1>num3_2) {
			big = num3_1;
			diff = num3_1 - num3_2;
		}
		else {
			big = num3_2;
			diff = num3_2 - num3_1;
		}
		System.out.println(diff);
		System.out.println("----------------------------------------");
		
		// 4. SwitchBreak.java를 switch문이 아닌, if~else를 사용하는 형태로 변경해 보자.
		/*
		 * int n=3; switch(n) { case 1: System.out.println("Simple Java"); break; case
		 * 2: System.out.println("Funny Java"); break; case 3:
		 * System.out.println("Fantastic Java"); break; default:
		 * System.out.println("The best programming language"); }
		 * System.out.println("Do you like coffee?");
		 */
		
		int n4=3;
		
		if (n4==1) {
			System.out.println("Simple Java");
			System.out.println("The best programming language");
			System.out.println("Do you like coffee?");
		}
		else if(n4==2) {
			System.out.println("Funny Java");
			System.out.println("The best programming language");
			System.out.println("Do you like coffee?");
		}
		else if(n4==3) {
			System.out.println("Fantastic Java");
			System.out.println("The best programming language");
			System.out.println("Do you like coffee?");
		}
		else {
			System.out.println("The best programming language");
			System.out.println("Do you like coffee?");
		}
		System.out.println("----------------------------------------");
		
		// 5.문제 2의 답안 코드를 switch 문으로 변경하여 보자. num < 0 이라면 “0 미만” 출력 부분은 if문을 사용하고 나머지 조건에 대해 변경하세요.		
		if (num2<0) {
			System.out.println("0미만");
		}
		else {
			switch(num2/100) {
			case 0:
				System.out.println("0이상 100미만");
				break;
			case 1:
				System.out.println("100이상 200미만");
				break;
			case 2:
				System.out.println("200이상 300미만");
				break;
			case 3: case 4: case 5: case 6: case 7: case 8: case 9:
				System.out.println("300이상");
			}
		}
		System.out.println("----------------------------------------");
		
		// 6.while 문을 이용해서 1부터 99까지의 합을 구하는 프로그램을 작성.
		int num6=1;
		int sum6=0;
		
		while (num6<100) {
			sum6+=num6;
			num6++;
		}
		System.out.println(sum6);
		System.out.println("----------------------------------------");
		
		// 7.1부터 100까지 출력한 후, 다시 거꾸로 100부터 1까지 출력하는 프로그램을 작성. while문과 do~while 문을 각각 한번씩 사용해서 작성
		int num7=1;
		
		while (num7<=100) {
			System.out.println(num7);
			num7++;
		}
		do {
			num7--;
			System.out.println(num7);
		} while(num7>1);
		System.out.println("----------------------------------------");
		
		// 8.1000 이하의 자연수 중에서 2의 배수 이면서 7의 배수인 숫자를 출력하고, 그 출력된 숫자들의 합을 구하는 프로그램을 while 문을 이용해서 작성
		int num8=1;
		int sum8=0;
		
		while (num8<=1000) {
			if(num8%2==0 && num8%7==0) {
				System.out.println(num8 + "은 2와 7의 배수입니다");
				sum8+=num8;
			}
			num8++;
		}
		System.out.println("1000이하 자연수 중 2와 7의 배수의 합은 " + sum8 + "입니다.");
		System.out.println("----------------------------------------");
		
		// 9.for 문을 이용하여 1부터 10까지를 곱해서 그 결과를 출력하는 프로그램을 작성
		int sum9=1;
		
		for (int i=1; i<11; i++) {
			sum9*=i;
			}
		System.out.println("1부터 10까지 곱한 결과 : " + sum9);
		System.out.println("----------------------------------------");
		
		// 10.for 문을 이용하여 구구단 중 5단을 출력하는 프로그램 작성
		for (int i=1; i<10; i++) {
			System.out.println("5 X "+i+" = "+5*i);
		}
		System.out.println("----------------------------------------");
		
		// 11. ContinueBasic.java의 내부에 존재하는 while 문을 for 문으로 변경하여 작성
		int count11=0;
		
		for(int num11=1; num11<100; num11++) {
			if(num11%5==0 && num11%7==0) {
				count11++;
				System.out.println(num11);
			}
		}
		System.out.println("count: " + count11);
		System.out.println("----------------------------------------");
		
		// 12.자연수 1부터 시작해서 모든 홀수와 3의 배수인 짝수를 더해 나간다. 그리고 그 합이 언제 (몇을 더했을 때) 1000이 넘어서는지, 그리고 1000이 넘어선 값은 얼마가 되는지 계산하여 출력하는 프로그램을 작성. 프로그램 내부에 while문을 무한 루프로 구성하여 작성.
		int num12 = 1;
		int sum12 = 0;
		
		while (true) {
			if (num12%2!=0) {
				sum12 += num12;
			}
			else if (num12%2==0) {
				if (num12%3==0) {
					sum12 += num12;
				}
			}
			if (sum12>1000) {
				System.out.println(num12);
				System.out.println(sum12);
				break;
			}
			num12++;
		}
		System.out.println("----------------------------------------");
		
		// 13.구구단의 짝수 단(2,4,8)만 출력하는 프로그램 작성. 단, 2단은 2x2까지, 4단은 4x4까지, 8단은 8x8 까지 출력	
		for (int num13=2; num13<=8; num13*=2) {
			for(int j=1; j<=num13; j++) {
				System.out.println(num13+" x "+j+" = "+num13*j);
			}
		}
		System.out.println("----------------------------------------");
		
		/* 14.다음 식을 만족하는 조합을 찾는 프로그램 작성. 
		 * A B
		 * B A 
		 * --- 
		 * 9 9
		 */
		
		for (int a=1; a<10; a++) {
			for(int b=1; b<10; b++) {
				int A = a*10 + b;
				int B = b*10 + a;
				
				int result = A + B;
				
				if (result==99) {
					System.out.println("A = "+a+" B = "+b);
				}
			}
		}
		System.out.println("----------------------------------------");
		
		/* 15.
		 * n=1 일 때  “현재 인원은 1명 입니다.”
		 * n=2 일 때  “현재 인원은 2명 입니다.”
		 * n=3 일 때  “현재 인원은 3명 입니다.”
		 * n>3 일 때  “현재 많은 사람들이 있습니다.” 
		 * 위의 내용이 출력 되는 프로그램을 작성. 각각 If 문과 switch 문 사용
		 */
		//if문
		int num15=3;
		
		if (num15==1) {
			System.out.println("현재 인원은 1명 입니다.");
		}
		else if(num15==2) {
			System.out.println("현재 인원은 2명 입니다.");
		}
		else if(num15==3) {
			System.out.println("현재 인원은 3명 입니다.");
		}
		else {
			System.out.println("현재 많은 사람들이 있습니다.");
		}
		//switch문
		switch(num15) {
		case 1:
			System.out.println("현재 인원은 1명 입니다.");
			break;
		case 2:
			System.out.println("현재 인원은 1명 입니다.");
			break;
		case 3:
			System.out.println("현재 인원은 1명 입니다.");
			break;
		default:
			System.out.println("현재 많은 사람들이 있습니다.");
		}
		
		System.out.println("----------------------------------------");
		
		// 16.1 부터 99까지의 합을 구하는 프로그램 작성. while문, for문, do while 문을 각각 사용
		//while문
		int num16=1;
		int sum16=0;
		
		while(num16<100) {
			sum16+=num16;
			num16++;
		}
		System.out.println("while문 합 = "+sum16);
		
		//for문
		sum16=0;
		
		for(int i=1; i<100; i++) {
			sum16+=i;
		}
		System.out.println("for문 합 = "+sum16);
		
		//do while문
		num16=1;
		sum16=0;
		
		do {
			sum16+=num16;
			num16++;
		}while(num16<100);
		System.out.println("do while문 합 = "+sum16);
		
		System.out.println("----------------------------------------");

	}

}

