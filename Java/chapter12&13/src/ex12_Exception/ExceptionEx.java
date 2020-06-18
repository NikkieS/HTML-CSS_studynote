package ex12_Exception;

import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
		
		try {
			int age = readAge();
//			Exception e = new Exception("고의로 발생 시킴.");
		}catch(AgeInputException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("에러 메세지: "+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료되었음.");
	}
	static int readAge() throws AgeInputException{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요.");
		int age = kb.nextInt();
		
		if(age<0) {
			AgeInputException excpt = new AgeInputException();
			throw excpt;
		}
		return age;
	}
}
