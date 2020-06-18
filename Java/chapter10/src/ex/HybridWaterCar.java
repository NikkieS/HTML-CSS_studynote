package ex;

class Car {
	int gasolineGauge;
	Car(int gasolineGauge){
		this.gasolineGauge=gasolineGauge;
	}
	
}
class HybridCar extends Car {
	int electronicGauge;
	HybridCar(int gasolineGauge, int electronicGauge){
		super(gasolineGauge);
		this.electronicGauge = electronicGauge;
	}
}
class HybridWaterCar extends HybridCar {
	int waterGauge;
	HybridWaterCar(int gasolineGauge, int electronicGauge, int waterGauge){
		super(gasolineGauge,electronicGauge);
		this.waterGauge = waterGauge;
	}
	
	public void showCurrentGauge() {
	System.out.println("잔여 가솔린 : " + gasolineGauge);
	System.out.println("잔여 가솔린 : " + electronicGauge);
	System.out.println("잔여 가솔린 : " + waterGauge);
	}
	
	public static void main(String[] args) {
		HybridWaterCar hCar = new HybridWaterCar(10, 100, 1000);
		
		hCar.showCurrentGauge();
	}
}
