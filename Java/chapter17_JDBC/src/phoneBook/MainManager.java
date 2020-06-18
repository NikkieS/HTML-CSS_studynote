package phoneBook;

import java.util.Scanner;

public class MainManager {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		BasicManager bManager = BasicManager.getInstance();
		UnivManager uManager = UnivManager.getInstance();
		CafeManager cManager = CafeManager.getInstance();
		ComManager comManager = ComManager.getInstance();
		
		while(true) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("-----------------------");
			System.out.println("1. 기본 연락처");
			System.out.println("2. 대학 연락처");
			System.out.println("3. 직장 연락처");
			System.out.println("4. 동회회 연락처");
			System.out.println("5. 종료");
			System.out.println("-----------------------");
			
			int type = sc.nextInt();
			
			switch(type) {
			case 1:
				bManager.basicManager();
				break;
			case 2 :
				uManager.univManager();
				break;
			case 3:
				comManager.comManager();
				break;
			case 4:
				cManager.cafeManager();
				break;
			case 5:
				sc.close();
				return;
			}
		}
	}
}
