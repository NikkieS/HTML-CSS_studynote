package ex15_Thread;

public class Increment {
	int num=0;
	
	synchronized void increment() {num++;}
	int getNum() {
		return num;
	}
}
