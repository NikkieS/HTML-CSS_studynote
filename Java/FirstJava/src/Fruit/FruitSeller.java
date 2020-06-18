package Fruit;

public class FruitSeller {
	
	// 속성
	
	int numOfApple;	//사과의 개수
	int myMoney;		//수입
	final int APPLE_PRICE;		//사과의 가격
	
	// 판매 기능 : 매소드
	// 1. 돈을 받는다. -> 매개변수 int money
	// 2. 받은 돈의 사과의 개수를 구한다
	// 3. 나의 사과 개수에서 반환해야하는 사과의 개수를 빼준다
	// 4. 받은 금액은 나의 수입으로 더해준다.
	// 5. 사과의 개수를 반환한다. -> 반환 데이터 int return 사과의 개수
	
	// 생성자
	FruitSeller(){
//		numOfApple = 20;
//		myMoney = 0;
//		APPLE_PRICE = 1000;
		this(20,0,1000); //this()생성자
	}
	
	FruitSeller(int numOfApple, int myMoney, int price){
		//this: 인스턴스 자신을 가리키는 참조변수. 인스턴스의 주소값이 저장되어 있다.
		this.numOfApple = numOfApple;
		this.myMoney = myMoney;
		APPLE_PRICE = price;
	}
	
	int saleApple(int money) {
		int num = money/APPLE_PRICE;
		
		numOfApple -= num;
		myMoney += money;
		
		return num;
	}
	
	void showSaleResult() {
		System.out.println("남은 사과: "+numOfApple);
		System.out.println("판매 수익: "+myMoney);
	}

}
