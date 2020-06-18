package chapter8;

public class AccessArray {
	public static void main(String[] args) {
		// int타입의 정수 데이터 3개를 저장할 수 있는 배열 생성
		int[] arr = new int[3];
		
		// 배열 요소에 참조
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		int sum = arr[0] + arr[1] + arr[2];
		System.out.printf("%d, %d, %d의 합은 %d입니다.",arr[0], arr[1], arr[2], sum);
		
		int[][] arr2=new int[3][2];
		arr2[2][0]=0;
		arr2[2][1]=4;
		
		System.out.println(arr2[2][0]);
	}
}
