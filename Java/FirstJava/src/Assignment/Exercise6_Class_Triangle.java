package Assignment;

public class Exercise6_Class_Triangle {
	// 밑변과 높이 변수 생성
	int height;
	int width;
	
	// 밑변과 높이 변경 메소드 생성
	void setData(int h, int w) {
		// 멤버 변수 -> 그냥 호출
		 height = h;
		 width = w;
	}
	
	// 삼각형 넓이 반환 메소드
	float area(int height, int width) {
		float res = (height * width)/2f;
		
		return res;
	}
	
	public static void main(String[] args) {
		// 문제1. 밑변과 높이 정보를 지정할 수 있는 Triangle 클래스를 정의하자.
		// 끝으로 밑변과 높이 정보를 변경시킬 수 있는 메서드와 삼각형의 넓이를 계산해서 반환하는 메서드도 함께 정의하자.		
		Exercise6_Class_Triangle tri = new Exercise6_Class_Triangle();
		
		tri.setData(3,5);
		System.out.println("삼각형의 밑변 : "+tri.width+", 높이 : "+tri.height);
		
		float area = tri.area(tri.height, tri.width);
		System.out.println("삼각형의 넓이는 : "+area+"입니다.");
	}
}
