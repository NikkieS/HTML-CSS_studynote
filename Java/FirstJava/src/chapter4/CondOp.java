package chapter4;

public class CondOp {

	public static void main(String[] args) {
		int num1 = 50, num2 = 100;
		int big, diff;
		
		// 큰수 구하기
		big = (num1 > num2)? num1:num2;
		
		//두 수의 차이
		diff = (num1 > num2)? num1-num2:num2-num1;
		
		System.out.println(diff);
	}

}
