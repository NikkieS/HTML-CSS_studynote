package ex;

import java.util.Scanner;

public class InterfaceMain implements Week {
	public static void main(String[] args) {
		System.out.println("요일을 선택해주세요.");
		System.out.println("1. 월, 2.화, 3.수, 4.목, 5.금, 6.토, 7.일");
		
		Scanner kb = new Scanner(System.in);
		
		switch(kb.nextInt()) {
		case Week.MON:
			System.out.println("주간회의가 있습니다.");
			break;
		case Week.TUE:
			System.out.println("프로젝트 기획 회의가 있습니다.");
			break;
		case Week.WED:
			System.out.println("진행사항 보고하는 날입니다.");
			break;
		case Week.THU:
			System.out.println("사내 축구시합이 있는 날입니다.");
			break;
		case Week.FRI:
			System.out.println("프로젝트 마감일입니다.");
			break;
		case Week.SAT:
			System.out.println("가족과 함께 즐거운 시간을 보내세요.");
			break;
		case Week.SUN:
			System.out.println("오늘은 휴일입니다.");
			break;
		}
	}
}
