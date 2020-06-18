package chapter8;

public class ArrayAndMethods {
	public static int[] addAllArray(int[] ar, int addVal) {
		for(int i=0; i<ar.length; i++){
				ar[i]+=addVal;
		}
		return ar;
	}
	
	public static void main(String[] args) {
		// 원본 배열 생성
		int[] arr = {1, 2, 3, 4, 5};
		
		// 결과를 저장 할 배열 선언
		int[] ref;
		
		// 메소드 호출하고 결과를 ref에 저장
		ref=addAllArray(arr, 7);
		
		if(arr==ref) {
			System.out.println("동일 배열 참조");
		}
		else
			System.out.println("다른 배열 참조");
		
		for(int i=0; i<ref.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
