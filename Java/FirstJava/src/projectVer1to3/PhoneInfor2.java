package projectVer1to3;

import java.util.Scanner;

/*작성자 : 송가람
수정일 : 2020.04.22
수정내용 : 전화번호 관리 프로그램 (이름, 전화번호, 생년월일)
*/

public class PhoneInfor2 {
	
	String name;		//이름
	String phoneNumber;	//전화번호
	String birthday;	//생년월일
	
	private static Scanner sc;
	
	PhoneInfor2(String name, String num){
		this(name,num, "입력된 값이 없습니다.");
	}
	
	PhoneInfor2(String name, String num, String bday){
		this.name = name;
		this.phoneNumber = num;
		this.birthday = bday;
	}
	
	void show() {
		System.out.println("이름 : "+name+", 전화번호 : "+phoneNumber+", 생년월일 : "+birthday);
	}
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("이름을 입력해주세요.");
			String name = sc.next();
			System.out.println("전화번호를 입력해주세요.");
			String num = sc.next();
			sc.nextLine();
			System.out.println("생년월일을 입력해주세요.");
			String birthday = sc.nextLine();
			
			// data
			PhoneInfor data = new PhoneInfor(name, num, birthday);
			
			data.show();
			
			System.out.println("종료하시겠습니까? Y/N");
			String exit = sc.next();
			
			if (exit.equals("Y")||exit.equals("y"))
				break;
		}
	}
}
