package ex15_Thread;

public class CalMinThread extends Thread {
	Calculator cal;
	
	public CalMinThread(Calculator c) {
		cal = c;
	}

	@Override
	public void run() {
		System.out.println(cal.min(2, 1));
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(cal.min(4, 2));
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
