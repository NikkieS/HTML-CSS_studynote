package Fruit;

/*작성자 : 송가람
수정일 : 2020.04.17
수정내용 : 생성자로 변수 초기화, 현재 데이터 출력 메소드 생성 (showResult())
*/

public class FruitBuyer {
	// 속성: 변수
	// 보유한 나의 돈
	// 사과의 개수
	//int myMoney = 10000;
	//int numOfApple = 0;
	
	int myMoney;
	int numOfApple;
	
	//생성자
	FruitBuyer(){
		myMoney = 5000;
		numOfApple=0;
	}
	
	FruitBuyer(int money, int num){
		myMoney = money;
		numOfApple = num;
	}
	
	// 구매 기능 : 매소드
	// 1. seller 받기
	// 2. 지출할 돈 정의
	// 3. seller에게 돈을 주고 판매 요청 -> 사과의 개수
	// 4. 사과의 개수를 받은 사과의 개수만큼 증가시킨다.
	// 5. 지출한 돈은 나의 돈에서 차감한다.
	// 6. 반환할 값이 없으니 void
	
	// 참조변수: 해당 클래스로 만들어진 객체의 주소값을 저장하는 변수이다
	void buyApple(FruitSeller seller, int money) {
		// 구매한 사과의 개수
		int num = seller.saleApple(money);
		
		numOfApple += num;
		myMoney -= money;
	}
	void showSaleResult() {
		System.out.println("사과 개수: "+numOfApple);
		System.out.println("현재 잔액: "+myMoney);
	}
}
