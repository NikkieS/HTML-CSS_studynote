package ex15_Thread;

public class ThreadMain {

	public static void main(String[] args) {
//		// 쓰레드 인스턴스 생성
//		ShowThread st1 = new ShowThread("멋진 쓰레드");
//		ShowThread st2 = new ShowThread("예쁜 쓰레드");
//		
//		// 쓰레드의 실행 : 새로운 프로그램 코드 실행의 흐름
//		st1.start();
//		st2.start();
//		
//		for(int i=0; i<100; i++) {
//			System.out.println("메인쓰레드가 실행 중 입니다.");
//		}
//		
//		// Runnable을 구현하는 인스턴스 생성
//		AddThread at1 = new AddThread(1, 50);
//		AddThread at2 = new AddThread(51, 100);
//		
//		// 쓰레드 인스턴스 생성
//		Thread t1 = new Thread(at1);
//		Thread t2 = new Thread(at2);
//		
//		// 실행의 흐름 생성
//		t1.start();	// run() 호출 프로그램 실행
//		t2.start();
//		
//		try {
//			t1.join();
//			t2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println("1~100까지의 합: "+(at1.getNum()+at2.getNum()));
//		
//		Sum sum = new Sum();
//		
//		AddThread2 at3 = new AddThread2(sum, 1, 50);
//		AddThread2 at4 = new AddThread2(sum, 51, 100);
//		
//		at3.start();
//		at4.start();
//		
//		try {
//			at3.join();
//			at4.join();
//		}catch(InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("1~100까지의 합: "+sum.getNum());
//		
//		Increment inc = new Increment();
//		IncThread it1 = new IncThread(inc);
//		IncThread it2 = new IncThread(inc);
//		IncThread it3 = new IncThread(inc);
//		
//		it1.start();
//		it2.start();
//		it3.start();
//		
//		try {
//			it1.join();
//			it2.join();
//			it3.join();
//		}catch(InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println(inc.getNum());
//		
//		Calculator cal = new Calculator();
//		
//		CalAddThread cat = new CalAddThread(cal);
//		CalMinThread cmt = new CalMinThread(cal);
//		
//		cat.start();
//		cmt.start();
//		
//		try {
//			cat.join();
//			cmt.join();
//		}catch(InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		cal.showOpCnt();
		
		TwoNum tn = new TwoNum();
		
		AccessThread at5 = new AccessThread(tn);
		AccessThread at6 = new AccessThread(tn);
		
		at5.start();
		at6.start();
		
		try {
			at5.join();
			at6.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		tn.show();
		
	}

}
