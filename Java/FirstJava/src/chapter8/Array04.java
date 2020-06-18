package chapter8;

public class Array04 {
	public static void main(String[] args) {
		// 정수 45개를 저장할 수 있는 배열 생성
		int[] ball = new int[45];
		
		// 배열의 각 요소에 1~45의 값을 저장한다
		for(int i=0; i<ball.length; i++)
			ball[i] = i+1;
		
		// 두 값을 바꾸는데 사용할 임시변수
		int temp = 0;
		// 랜덤한 index 값: 1~44
		int j=0;
		
		for(int i=0; i<10000; i++) {
			j=(int)(Math.random()*44)+1;
			temp = ball[0];
			ball[0]=ball[j];
			ball[j]=temp;
		}
		
		for(int i=0; i<6; i++)
			System.out.print(ball[i]+" ");
	}
}
