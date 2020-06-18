package car;

public class Car {
	
	String color;
	int door;
	
	void drive() {
		System.out.println("운전");
	}
	
	void stop() {
		System.out.println("멈춤");
	}
	
	public static void main(String[] args) {
		Car car=null;
		FireEngine fe1=new FireEngine();
		FireEngine fe2=null;
		Ambulance am=null;
		
		fe1.water();
		car=fe1;	//형변환 하위->상위 생략
		//car.water();
		
		fe2=(FireEngine)car;	//형변환 상위->하위 생략불가능
		
		if(car instanceof Ambulance) {
			am = (Ambulance) car;
			am.siren();
		};
	}
}

class FireEngine extends Car{
	void water() {
		System.out.println("물뿌리기");
	}
}

class Ambulance extends Car{
	void siren() {
		System.out.println("ㅁ");
	}
}