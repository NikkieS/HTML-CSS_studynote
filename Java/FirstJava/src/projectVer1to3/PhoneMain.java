package projectVer1to3;

import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
		PhoneInforManager manager = new PhoneInforManager();
		
		Scanner sc=new Scanner(System.in);
		
		
		while(true) {
			Menu.showMenu();
			
			int selectNum = sc.nextInt();
			sc.nextLine();
			
			switch(selectNum) {
			case 1:
				System.out.println("");
				manager.addInfo();
				break;
			case 2:
				System.out.println("");
				manager.searchInfo();
				break;
			case 3:
				System.out.println("");
				manager.deleteInfo();
				break;
			case 4:
				System.out.println("");
				manager.showAllData();
				break;
			case 5:
				System.out.println("");
				System.out.println("Quit");
				return;
			}

		}

	}
}
