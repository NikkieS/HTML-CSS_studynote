package chapter6;

public class CardMain {

	public static void main(String[] args) {
		// 인스턴스 생성
		Card c1=new Card();
		c1.kind="Heart";
		c1.number=7;
		
		// 인스턴스 생성
		Card c2 = new Card();
		c2.kind="Spade";
		c2.number=4;
		
		System.out.println("첫번째 카드는"+c1.kind+"/"+c1.number+"이며, 크기는 ("+c1.width+","+c1.height+")입니다.");
		System.out.println("두번째 카드는"+c2.kind+"/"+c2.number+"이며, 크기는 ("+c2.width+","+c2.height+")입니다.");
		
		System.out.println("카드의 사이즈를 변경합니다.");
		
		Card.height=125;
		Card.width=50;
		
		System.out.println("첫번째 카드는"+c1.kind+"/"+c1.number+"이며, 크기는 ("+c1.width+","+c1.height+")입니다.");
		System.out.println("두번째 카드는"+c2.kind+"/"+c2.number+"이며, 크기는 ("+c2.width+","+c2.height+")입니다.");
		
//		for(int i=1; i<5; i++) {
//			for(int j=1; j<14; j++) {
//				String kind = "";
//				
//				switch(i) {
//				case 1:
//					kind="Heart";
//					break;
//				case 2:
//					kind="Spade";
//					break;
//				case 3:
//					kind="Club";
//					break;
//				case 4:
//					kind="Diamond";
//					break;
//				}
//				Card c = new Card();
//				c.kind = kind;
//				c.number = j;
//				
//				System.out.println("카드의 높이/크기는 "+c.height+"/"+c.width+"이며 ("+c.kind+","+c.number+")입니다.");
//			}
//		}
		
		
		// 배열을 이용한 카드덱 생성
		Card[] c = new Card[52];
		
		// 초기값은 null
		System.out.println(c[0]);
		System.out.println(c[1]);
		
		// 52개 인스턴스 생성
		for(int i=0; i<52; i++) {
			c[i]=new Card();
			
			if(i<14) {
				c[i].kind="Heart";
				c[i].number=i+1;
			}
			else if(i<27) {
				c[i].kind="Spade";
				c[i].number=i+1;
			}
			else if(i<40) {
				c[i].kind="Club";
				c[i].number=i+1;
			}
			else {
				c[i].kind="Diamond";
				c[i].number=i+1;
			}
		}
	
		System.out.println(c[0].kind+"\t"+c[0].number);
		System.out.println(c[33].kind+"\t"+c[33].number);
	
		
	}

}
