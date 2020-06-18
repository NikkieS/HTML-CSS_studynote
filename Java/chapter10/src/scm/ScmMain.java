package scm;

public class ScmMain {

	public static void main(String[] args) {
		// 상속관계에서 다향성
		// 상위클래스 타입의 참조변수 = 하위클래스의 인스턴스
		Product p = new Tv(100);
		
		Tv tv = new Tv(100);
		Computer com = new Computer(200);
		Audio aud = new Audio(300);
		
		// 반복문으로 합을 구하기 위해서는 변수들을 같이 묶어 배열로 처리하는것이 더 효율적이다
		int sum = tv.price+com.price+aud.price;
		
		Product p1 = tv;	// 하위클래스 -> 상위클래스 자동형변환
		Product p2 = com;
		Product p3 = aud;
		
		Product[] pA= new Product[3];
		pA[0]=p1;
		pA[1]=p2;
		pA[2]=p3;
		
		// 구매자가 제품을 구매하는 시뮬레이션
		// 구매자 생성
		Buyer buyer = new Buyer();
		
		Tv product1 = new Tv(200);
		Computer product2 = new Computer(250);
		Audio product3 = new Audio(100);
		
		//명시적인 형변환 : 상위타입의 변수 -> 하위타입의 변수
		//instanceOf 연산자 : 참조변수가 참조하는 인스턴스를 특정 클래스 타입으로 형 변환이 가능한지 여부를 확인
		//p1 instanceof Computer ==> true/false
		
		if(pA[0] instanceof Computer == true) {
			((Computer)pA[0]).programming();
		}
		
		// 전달 하는 배열에 컴퓨터가 있다면 프로그래밍을 하겠다.
		for(int i=0; i<pA.length; i++) {
			if(pA[i] instanceof Computer == true) {
				((Computer)pA[i]).programming();
			}
		}
		
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");
		
		// Tv 구매
		buyer.buy(product1);
		// Computer 구매
		buyer.buy(product2);
		// Audio 구매
		buyer.buy(product3);
		// Computer 구매
		buyer.buy(product2);
		
		System.out.println("현재 보유금액    : "+buyer.money);
		System.out.println("현재 보유 포인트 : "+buyer.bonusPoint);
		
		buyer.summary();
	}

}
