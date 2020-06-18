package chapter6;

public class TvMain2 {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2= new Tv();
		
		System.out.println("------------------");
		System.out.println("Tv1의 channel : "+t1.channel);
		System.out.println("Tv2의 channel : "+t2.channel);
		System.out.println("------------------");
		
		t1.channel = 10;
		System.out.println("Tv1의 channel을 10으로 변경");
		
		System.out.println("------------------");
		System.out.println("Tv1의 channel : "+t1.channel);
		System.out.println("Tv2의 channel : "+t2.channel);
		System.out.println("------------------");

	}
}
