package ex15_Thread;

public class CalAddThread extends Thread {
	Calculator cal;
	
	public CalAddThread (Calculator c){
		cal = c;	//객체를 주입한다
	}

	@Override
	public void run() {
		System.out.println(cal.add(1, 2));
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(cal.add(2, 4));
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
