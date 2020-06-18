package ex15_Thread;

public class AddThread extends Sum implements Runnable {
	
	int start, end;
	
	public AddThread(int start, int end) {
		this.start = start;
		this.end = end;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=start; i<=end; i++) {
			addNum(i);
		}
	}

}
