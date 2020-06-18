package chapter5;

public class Method1 {

	public static void main(String[] args) {
		// 메소드를 사용하기위해서는 인스턴스
		// 메소드 코드를 메모리에 로드한다
		
		// 인스턴스 생성 (객체 생성)
		
		MyMath math = new MyMath();
		
		long result = math.add(10,  100);
		
		System.out.println(result);
	}

}
