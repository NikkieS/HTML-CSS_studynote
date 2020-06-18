package projectVer6;

import java.util.InputMismatchException;

public class PhoneMain {

	public static void main(String[] args) {
		PhoneBookManager manager = PhoneBookManager.getInstance();	
		
		while(true) {
			//메뉴 옵션 출력 메소드
			MenuOption.showMenu();
			int selectMenu, selectType;
			
			/* 2020.04.28
			 * 수정내용 : 예외처리 try-catch */
			try {
				selectMenu = optionMenu(manager.sc.nextInt());
				manager.sc.nextLine();
				
				switch(selectMenu) {
				// 추가
				case Menu.INSERT_NEW:
					System.out.println("");
					
					//생성자 타입 메뉴 출력 메소드
					MenuOption.showType();

					selectType = optionType(manager.sc.nextInt());
					manager.sc.nextLine();
					
					switch(selectType) {
					case Menu.UNIV: case Menu.COMP: case Menu.CLUB:
						System.out.println("");
						manager.addContact(selectType);
						break;
					}
					break;
				// 검색
				case Menu.SEARCH:
					System.out.println("");
					manager.searchInfo();
					break;
				// 삭제
				case Menu.DELETE:
					System.out.println("");
					manager.deleteInfo();
					break;
				// 전체보기
				case Menu.VIEW_ALL:
					System.out.println("");
					manager.showAllData();
					break;
				// 생성자 타입별로 보기	
				case Menu.VIEW_GROUP:
					System.out.println("");
					MenuOption.showType();
					selectType = optionType(manager.sc.nextInt());
					manager.sc.nextLine();
					manager.showGroupData(selectType);
					break;
				// 수정
				case Menu.EDIT:
					System.out.println("");
					manager.editInfo();
					break;
				// 끝내기	
				case Menu.EXIT:
					System.out.println("");
					System.out.println("Quit");
					return;
				}
				
			}catch(OptionInputException e) {
				// 메뉴 옵션에 없는 숫자 입력시 : warning 문구 출력 후 재시작
				System.out.println(e.getMessage());
				continue;
			}
			catch(InputMismatchException e) {
				// 문자열 입력시 : warning문구 출력 후 재시작
				System.out.println("Please put numbers only.\nReturning to menu.\n");
				manager.sc.nextLine();
				continue;
			}catch(Exception e) {
				// 문자열 입력시 : warning문구 출력 후 재시작
				System.out.println("Something went wrong.\nReturning to menu.\n");
				manager.sc.nextLine();
				continue;
			}			
		}
	}
	static int optionMenu(int num) throws OptionInputException{
		// 메뉴 옵션에 없는 숫자 입력 시 : exception을 던진다 
		if(num<1||num>7) {
			OptionInputException excpt = new OptionInputException();
			throw excpt;
		}
		return num;
	}
	static int optionType(int num) throws OptionInputException{
		// 메뉴 옵션에 없는 숫자 입력 시 : exception을 던진다 
		if(num<1||num>3) {
			OptionInputException excpt = new OptionInputException();
			throw excpt;
		}
		return num;
	}
}
