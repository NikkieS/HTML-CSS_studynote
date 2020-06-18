package ex15_Thread;

public class IncThread extends Thread{
	Increment inc;
	
	IncThread(Increment inc){
		this.inc = inc;
	}

	@Override
	public void run() {
		for(int i=0; i<10000; i++) {
			for(int j=0; j<10000; j++) {
				inc.increment();
			}
		}
	}
	
	
}
