package chapter2;

public class VariableDecl {

	public static void main(String[] args) {
		//double num1, num2;
		
		double num1 = 1.0000001;
		//System.out.println(num1);
		double num2 = 2.0000001;
		//System.out.println(num2);
		double result = num1 + num2;
		System.out.println(result);
		
		double num3 = num1 * 10000000;
		//System.out.println(num3);
		double num4 = num2 * 10000000;
		//System.out.println(num4);
		double result1 = num3 + num4;
		//System.out.println(result1);
		System.out.println(result1/10000000);

	}

}
