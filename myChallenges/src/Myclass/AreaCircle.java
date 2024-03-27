package Myclass;

public class AreaCircle {
	double circleRadius;
	static final double PI = 3.14;
	
	AreaCircle(double radius) {
		// TODO Auto-generated constructor stub
		circleRadius = radius;
	}
	double area() {
		return PI * Math.pow(circleRadius, 2);
	}
	static double area(double radius) {
		return PI * Math.pow(radius,2);
	}
}
