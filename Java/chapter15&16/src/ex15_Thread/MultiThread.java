package ex15_Thread;

import javax.swing.JOptionPane;

public class MultiThread {
	public static void main(String[] args) {
		System.out.println("프로그램을 시작합니다.");
		
		CountThread ct = new CountThread();
		ct.start();
		
		String input = JOptionPane.showInputDialog("사용자의 이름을 입력해주세요.");
		System.out.println(input);
		
		
	}
}
