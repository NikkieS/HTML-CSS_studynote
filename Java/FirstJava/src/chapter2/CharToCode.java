package chapter2;

public class CharToCode {

	public static void main(String[] args) {
		char ch = 'A'; // char ch = '\u0041' 로 바꿔 써도 같다
		int code = ch;
		
		System.out.println("문자열 출력 : " + ch);
		System.out.println("문자열 A의 유니코드 출력 : " + code);
		
		int code1 = 65; //int = 4byte
		char ch1 = (char)code1; //char = 2byte
		
		System.out.println(code1);
		System.out.println(ch1);
		
	}

}
