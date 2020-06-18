package chapter2;

public class ByteOverflow {

	public static void main(String[] args) {
		
		byte b = 0; //byte형 변수 b를 선언하고 0으로 초기화
		int i = 0;
		
		// (시작점; 끝나는점; 증가율)
		for (int x= 0; x <= 270; x++) { 
			System.out.print(b++);
			System.out.print('\t');
			System.out.println(i++);
		}
		
	}

}
