package Assignment;

import java.util.Scanner;

public class Exercise8_Array {
	//문제1. int형 1차원 배열을 매개변수로 전달 받아서 배열에 저장된 최대값, 그리고 최소값을 구해서 반환하는 메소드를 다음의 형태로 각각 정의.

	//public static int miniValue(int[] arr) { . . . . } // 최소값 반환
	//public static int maxValue(int[] arr) { . . . . } // 최대값 반환

	//	위의 두 매소드는 인자로 전달되는 배열의 길이에 상관없이 동작하도록 정의. 두 매소드 실행을 확인인하기 위한 main 메소드 정의.
	//	int형 배열에 채워질 정수는 프로그램 사용자로부터 입력 받고, 배열의 길이는 임의로 결정
	public static int miniValue(int[] arr) {
		int min=arr[0];
		for(int i=1; i<arr.length; i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		return min;
	}
	public static int maxValue(int[] arr) {
		int max=arr[0];
		for(int i=1; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	
	//문제2. 다음 메서드는 int형 1차원 배열에 저장된 값을 두 번째 매개변수로 전달될 값의 크기만큼 전부 증가시킨다.
	
	//public static void addOneDArr(int[] arr, int add){
	//for (int i=0; i<arr.length; i++) arr[i] +=add;}

	//이 메서드를 기반으로(이 메서들르 호출하는 형태로)int형 2차원 배열에 저장된 값 전부를 증가시키는 메서드를 다음의 형태로 정의하자.
	//public static void addOneDArr(int[][] arr, int add) { . . . . . }
	//단 위 메서드는 2차원 배열의 가로, 세로 길이에 상관없이 동작해야 하며, 위의 메서드가 제대로 동작하는지 확인하기 위한 main 메서드도 함께 정의해야 한다.
	public static void addOneDArr(int[][] arr, int add){
		//1차원 배열 반복
		for (int i=0; i<arr.length; i++) {
			//2차원 배열 반복
			for (int j=0; j<arr[i].length; j++) {
				arr[i][j] +=add;
			}
		}
	}
	
	//문제 3. 다음의 형태로 표현된 2차원 배열이 존재한다고 가정해 보자.
	//1 2 3
	//4 5 6
	//7 8 9
	//이러한 형태를 갖는 int형 2차원 배열이 인자로 전달되면, 다음의 형태로 배열의 구조를 변경시키는 메서드를 정의해 보자.
	//7 8 9
	//1 2 3
	//4 5 6
	//즉 총 N행으로 이뤄진 2차원 배열이 존재한다면, 메서드 호출 시, 1행은 2행으로 이동이 이뤄져야한다. 이번에도 마찬가지로 배열의 가로, 세로길이에 상관 없이 동작을 하도록 메서드가 정의되어야 하며, 정의된 메서드의 확인을 위한 main메서드도 함께 정의하자.
	public static void rearrange(int[][] arr) {
		// 1차원 주소값만 바꿔주면 가능!
		int[] temp = new int[arr[0].length];
		
		temp = arr[arr.length-1];	//1차원의 마지막 요소 :789
		
		// 위에서 아래로 변경
		for(int i=arr.length-1; i>0; i--) {
			arr[i]=arr[i-1];
		}
		
		arr[0]=temp;
//		int[][] temp=new int[arr.length][arr[0].length];
//		
//		// temp에 arr를 복사해서 넣어준다
//		//System.arraycopy(가지고 올 배열, 시작점, 붙여 넣을 배열, 시작점, 길이)
//		for(int i=0; i<arr.length; i++) {
//			System.arraycopy(arr[i], 0, temp[i], 0, arr[0].length);
//		}
//		
//		//3행 -> 1행 넣기
//		System.arraycopy(temp[arr.length-1], 0, arr[0], 0, arr[0].length);
//		//나머지 행들 넣기
//		for(int i=0; i<arr.length-1; i++) {
//			System.arraycopy(temp[i], 0, arr[i+1], 0, arr[0].length);
//		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//문제1.
		System.out.println("------------------1번------------------");
		int[] arr1=new int[4];
		
		System.out.println("숫자를 4번 입력해주세요.");
		arr1[0]=sc.nextInt();
		arr1[1]=sc.nextInt();
		arr1[2]=sc.nextInt();
		arr1[3]=sc.nextInt();
		
		int max = maxValue(arr1);
		int min = miniValue(arr1);
		
		System.out.println("최대값: "+max+" 최소값: "+min);
		
		//문제2.
		System.out.println("------------------2번------------------");
		int[][] arr2=new int[2][2];
		
		arr2[0][0]=sc.nextInt();
		arr2[0][1]=sc.nextInt();
		arr2[1][0]=sc.nextInt();
		arr2[1][1]=sc.nextInt();
		
		addOneDArr(arr2, 3);
		
		// 동작 확인출력
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.println(arr2[i][j]);
			}
		}
		
		//문제3.
		System.out.println("------------------3번------------------");
		int[][] arr3=new int[3][3];
		
		arr3[0][0]=1;
		arr3[0][1]=2;
		arr3[0][2]=3;
		arr3[1][0]=4;
		arr3[1][1]=5;
		arr3[1][2]=6;
		arr3[2][0]=7;
		arr3[2][1]=8;
		arr3[2][2]=9;
		
		rearrange(arr3);
		for(int i=0; i<arr3.length; i++) {
			for(int j=0; j<arr3[0].length; j++) {
				System.out.println(arr3[i][j]);
			}
		}
	}
}
