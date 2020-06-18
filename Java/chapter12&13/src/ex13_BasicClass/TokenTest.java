package ex13_BasicClass;

import java.util.StringTokenizer;

public class TokenTest {

	public static void main(String[] args) {
		String phoneNumber = "Tel 82-2-997-2059 test";
		
		StringTokenizer st1 = new StringTokenizer(phoneNumber);
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		System.out.println("--------------------------------------");
		StringTokenizer st2 = new StringTokenizer(phoneNumber, " -", true);
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
	}

}
