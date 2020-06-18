package projectVer5;

public class MenuOption {
	public static void showMenu() {
		System.out.println("---------------------------------");
		System.out.println("Enter a menu option");
		System.out.println(Menu.INSERT_NEW+". To add a new number");	//새로추가
		System.out.println(Menu.SEARCH+". To search by name");			//검색
		System.out.println(Menu.DELETE+". To delete contact by name");	//삭제
		System.out.println(Menu.VIEW_ALL+". To view entire contacts");	//전체보기
		System.out.println(Menu.VIEW_GROUP+". To view contacts by group");//생정자 타입별로 보기
		System.out.println(Menu.EDIT+". To edit contact info");			//수정
		System.out.println(Menu.EXIT+". To quit");						//끝
		System.out.println("---------------------------------");
	}
	
	public static void showType() {
		System.out.println("---------------------------------");
		System.out.println("Choose an option");
		System.out.println(Menu.UNIV+". To access university contacts");//대학
		System.out.println(Menu.COMP+". To access company contacts");	//회사
		System.out.println(Menu.CLUB+". To access club contacts");		//동호회
		System.out.println("---------------------------------");
	}
}
