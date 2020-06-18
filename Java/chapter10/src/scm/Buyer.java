package scm;

public class Buyer{
	
	int money;
	int bonusPoint;
	int numOfProduct;
	Product[] item;
	
	Buyer(){
		this.money = 16500;
		this.bonusPoint = 0;
		this.item=new Product[10];
		this.numOfProduct = 0;
	}
	
	void buy(Product p) {
		// 구매 상품의 금액과 나의 보유금액 비교해서 구매 여부 처리
		if(money < p.price) {
			System.out.println("잔액이 부족하여 구매할 수 없습니다.");
			return;
		}
		
		//구매 처리
		this.money-=p.price;
		this.bonusPoint+=p.bonusPoint;
		
		item[numOfProduct++]=p;
		System.out.println(p+"를 구매하셨습니다.");
		
//		for(int i=0; i<pA.length; i++) {
//			System.out.println(pA[i]);
//			sumOfPrice += pA[i].price;
//			sumOfPoint += pA[i].bonusPoint;
//		}
	}
	
	// 구매 내역을 출력
	void summary() {
		int sum = 0;	// 구매 제품의 총액
		int points = 0;	// 구매한 제품들의 포인트 총합
		
		String itemList = "";	// 구매 제품의 이름 목록
		
		for(int i=0; i<numOfProduct; i++) {
			itemList += item[i]+", ";
			// itemList = itemList + (item[i]+", ")
			
			sum+=item[i].price;
			points+=item[i].bonusPoint;
		}
		System.out.println("구매 목록 ================");
		System.out.println("구매하신 제품 : ");
		System.out.println(itemList+"입니다.");
		System.out.println("구매하신 제품들의 총 금액 : "+sum);
		System.out.println("구매하신 제품들의 적립된 총 포인트 : "+points);
	}
}
