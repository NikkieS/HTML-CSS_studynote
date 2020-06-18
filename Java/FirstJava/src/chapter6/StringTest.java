package chapter6;

public class StringTest {

	public static void main(String[] args) {
		java.lang.String str = "My name is JAVA";
		
		int strLength = str.length();
		
		System.out.println(strLength);
		int strLength2 = "한글의 길이는?".length();
		System.out.println(strLength2);
		
		String str1 = "My String";
		String str2 = "My String";
		String str3 = "Your String";
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		
		//문제 1. 다음 형태로 String 인스턴스를 생성. String str = “ABCDEFGHIJKLMN”;
		//그리고 이 문자열을 역순으로 다시 출력하는 프로그램을 작성.
		String str4 = "ABCDEFGHIJKLMN";
		
		for(int i=str4.length()-1; i>=0; i--) {
			System.out.print(str4.charAt(i));
		}
		System.out.println();
		
		/* 역순 StringBuffer Class사용 */
		StringBuffer str4b= new StringBuffer("ABCDEFGHIJKLMN");
		System.out.println(str4b.reverse());
		
		//문제 2. 다음 형태로 주민번호를 담고 있는 String 인스턴스를 하나 생성. String str = “990929-1010123”
		//이 문자열을 이용하여 중간에 삽입된 – 를 뺀 String 인스턴스를 생성.
		String str5 = "990929-1010123";
		
		/* StringBuffer 사용 */
		StringBuffer str5b=new StringBuffer("990929-1010123");
		System.out.println(str5b.deleteCharAt(str5b.indexOf("-")));
		
		/* String Class 사용 */
		System.out.println(str5.replace("-", ""));
		
		/* StringBuilder 사용 */
		StringBuilder strBuf = new StringBuilder();
		
		for(int i=0; i<6; i++) {
			strBuf.append(str5.charAt(i));
		}
		
		String begin = str5.substring(0, 6);
		String end = str5.substring(7,14);
		System.out.println(begin+end);

	}

}
