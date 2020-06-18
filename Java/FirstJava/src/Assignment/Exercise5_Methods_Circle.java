package Assignment;
//문제3. 원의 반지름 정보를 전달하면, 원의 넓이를 계산해서 반환하는 메서드와 원의 둘레를 계산해서 반환하는 메서드를 각각 정의하고, 이를 호출하는 main메서드를 정의하자.
//(2*π*r), (π*r∧2)
public class Exercise5_Methods_Circle {
	double area (float rad){
		double areaCircle = 2*Math.PI*rad;
		
		return areaCircle;
	}
	double circum (float rad) {
		double circumCircle = Math.PI * Math.pow(rad,2);
			
		return circumCircle;
	}
	
	public static void main(String[] args) {
		System.out.println("------------3번 문제------------");
		Exercise5_Methods_Circle areaOfCircle = new Exercise5_Methods_Circle();
				
		double area = areaOfCircle.area(3);
		double circum = areaOfCircle.circum(3);
				
		System.out.println("원의 넓이: "+area);
		System.out.println("원의 둘레: "+circum);
	}
}
