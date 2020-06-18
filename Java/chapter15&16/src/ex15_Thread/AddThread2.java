package ex15_Thread;

public class AddThread2 extends Thread{
	Sum sumInst; int start, end;
	
	AddThread2(Sum sum, int start, int end){
		this.sumInst = sum;
		this.start = start;
		this.end = end;
	}
	
	public void run() {
		for(int i=start; i<=end; i++)
			sumInst.addNum(i);
	}
}
