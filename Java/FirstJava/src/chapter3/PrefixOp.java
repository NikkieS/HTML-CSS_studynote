package chapter3;

public class PrefixOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 7;
		int num2 = ++ num1; // num1 = 8 num2 = 8
		int num3 = -- num1; // num1 = 7 num2 = 8 num3 = 7
		
		System.out.println(++num1);	// 8
		System.out.println(num2);	// 8
		System.out.println(--num2); // 7
		System.out.println(num3);	// 7
		
		
	}

}
