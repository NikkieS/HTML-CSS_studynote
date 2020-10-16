package ex15_Thread;

public class TwoNum {
	int num1=0;
	int num2=0;
	
	/* 동기화 방법 
	 * 1. 메소드의 동기화 방법
	 * 2. 특정 블록의 동기화 방법 -> synchronized(동기화할 객체 또는 클래스명)
	 */	
	
	void addOneNum1() {
		// this : 클래스명
		synchronized(this) {
			num1 += 1;
		}
	}
	
	void addTwoNum1() {
		synchronized(this) {
			num1 += 2;
		}
	}
	
	void addOneNum2() {
		// 임의의 참조변수
		synchronized(key1) {
			num2 += 1;
		}
	}
	
	void addTwoNum2() {
		synchronized(key1) {
			num2 += 2;
		}
	}
	Object key1 = new Object();
	String key2= "key2";
	
	void show() {
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
	}
}
