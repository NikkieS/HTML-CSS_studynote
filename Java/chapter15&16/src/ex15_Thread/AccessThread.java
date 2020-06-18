package ex15_Thread;

public class AccessThread extends Thread {
	TwoNum tw;
	
	public AccessThread(TwoNum tw) {
		this.tw = tw;
	}

	@Override
	public void run() {
		tw.addOneNum1();
		tw.addTwoNum1();
		
		tw.addOneNum2();
		tw.addTwoNum2();
	}
	
	
}
