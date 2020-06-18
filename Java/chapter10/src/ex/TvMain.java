package ex;

public class TvMain {

	public static void main(String[] args) {
		Tv tv1=new Tv();
		CaptionTv cTv1=new CaptionTv();
		
		// CaptionTv의 메모리는 가지고 있지만 Tv타입 메소드만 가지고 있다
		Tv tv2=new CaptionTv();
		
		System.out.println(tv1.power);
		tv2.power();	// 상위클래스 Tv의 메소드 호출
		System.out.println(tv2.power);
		tv2.display();	//Override
		
		Tv tv3=new IpTv();
		Tv tv4=new SmartTv();
		
		tv3.display();
		tv4.display();
		
		//공통된 Tv타입의 인스턴스 4개를 배열로 생성시켜준다
		Tv[] tvs=new Tv[4];
		
		tvs[0]=new Tv();
		tvs[1]=new CaptionTv();
		tvs[2]=new IpTv();
		tvs[3]=new SmartTv();
		
		for(int i=0; i<tvs.length; i++) {
			tvs[i].display();
		}
		
		// 참조변수의 형 변환
		CaptionTv cTv2=(CaptionTv) tv2;	// 상위 -> 하위 형변환 생략 X
		Tv t =cTv1;	// 하위 -> 상위 형변환 생략 O
	}

}
