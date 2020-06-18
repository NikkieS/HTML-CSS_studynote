package ex16_FileIOStream;

import java.io.Serializable;
import java.lang.Math;

public class Circle implements Serializable {
	int xPos;
	int yPos;
	double rad;
	
	public Circle(int xPos, int yPos, double rad){
		this.xPos = xPos;
		this.yPos = yPos;
		this.rad = rad;
	}
	
	void showCircleInfo() {
		System.out.printf("[x : %d, y : %d] \n", xPos, yPos);
		System.out.println("rad: "+rad);
		System.out.printf("Aread of the circle: %.3f \n",(Math.pow(rad, 2)*Math.PI));
	}
}
