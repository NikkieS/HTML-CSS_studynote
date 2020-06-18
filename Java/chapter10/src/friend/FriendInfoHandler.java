package friend;

import java.util.Scanner;
import java.util.ArrayList;

public class FriendInfoHandler {
	/*
	 2020.04.28
	 싱글톤 처리 연습
	*/
	private static FriendInfoHandler handler = new FriendInfoHandler(100);
	
	public static FriendInfoHandler getInstance() {
		return handler;
	}
	
	Scanner kb = new Scanner(System.in);
	
	// Friend 타입의 정보를 저장할 배열을 가진다.
	// 친구정보를 저장하는 기능
	// 친구정보의 기본 정보 출력
	// 친구정보 상세 정보 출력
	
	//private Friend[] myFriends;
	//private int numOfFriends;
	
	private ArrayList<Friend> myFriends;
	
	
	public FriendInfoHandler(int num) {
		//this.myFriends = new Friend[num];
		//this.numOfFriends=0;
		myFriends = new ArrayList<Friend>();
	}
	
	// 친구정보를 저장하는 기능
	// 1. 배열에 저장하는 기능
	// 2. 사용자에게 데이터를 받아 사용자 요청에 맞는 인스턴스 생성
	
	// 1. 배열에 저장하는 기능
	private void addFriendInfo(Friend fren) {
		//myFriends[numOfFriends++]=fren;
		myFriends.add(fren);
	}
	
	public void addFriend(int choice) {
		// 기본정보 받기
		
		// 1일때 정보 받기: HighFriend 인스턴스 생성
		// 2일때 정보 받기: UnivFriend 인스턴스 생성
		
		// addFriend 메소드 호출, 매개변수에 저장된 정보 대입
		
		String name, phoneNum, addr, job, major, grade; 
		
		System.out.println("이름: "); name=kb.nextLine();
		System.out.println("전화: "); phoneNum=kb.nextLine();
		System.out.println("주소: "); addr=kb.nextLine();
		if(choice==1) {
			System.out.println("직업: "); job=kb.nextLine();
			addFriendInfo(new HighFriend(name, phoneNum, addr, job));
		}
		else {
			System.out.println("학과: "); major=kb.nextLine();
			System.out.println("학년(숫자): "); grade=kb.nextLine();
			// Integer.parseInt( ): String -> int 메소드
			addFriendInfo(new UnivFriend(name, phoneNum, addr, major, Integer.parseInt(grade)));
		}
		System.out.println("입력 완료! \n");
		
	}
	
	public void showAllData() {
		// for(int i=0; i< numOfFriends; i++)
		for(int i=0; i<myFriends.size(); i++) {
			//myFriends[i].showData();
			myFriends.get(i).showData();
			System.out.println("");
		}
	}
	
	public void showAllSimpleData() {
		// for(int i=0; i< numOfFriends; i++)
		for(int i=0; i<myFriends.size(); i++) {
			//myFriends[i].showBasicInfo();
			myFriends.get(i).showBasicInfo();
			System.out.println("");
		}
	}
}
