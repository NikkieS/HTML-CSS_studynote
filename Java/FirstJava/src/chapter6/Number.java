package chapter6;

public class Number {
	int num;
	
	// 생성자
	Number(int n){
		System.out.println("생성자 호출");
		num = n;
	}
	
	public static void main(String[] args) {
		Number n1 = new Number(10000);
		
		System.out.println(n1.num);
		
		
		
	}

}
