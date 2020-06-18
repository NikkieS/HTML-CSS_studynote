package ex15_Thread;

public class Calculator {
	// 메소드 실행 횟수 카운트
	int opCnt = 0;
	
	int add(int n1, int n2) {
		synchronized(this) {
			opCnt++;
		}
		return n1+n2;
	}
	
	int min(int n1, int n2) {
		synchronized(this) {
			opCnt++;
		}
		return n1-n2;
	}
	
	void showOpCnt() {
		System.out.println("연산의 횟수: "+opCnt);
	}
}
