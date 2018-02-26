package ex01;


public class Circle implements Shape {
	protected Double radius;
	protected Point center;
	public double getRadium() {
		return radius;
	}
	public void setRadium(Double radium) {
		this.radius = radium;
	}
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public Circle(Double radium, Point center) {
		super();
		this.radius = radium;
		this.center = center;
		
	}
	public Circle() {
		super();
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*this.radius*this.radius;
	}
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*this.radius;
	}
	@Override
	public double maxSide() {
		// TODO Auto-generated method stub
		return radius*2;
	}
	@Override
	public double minSide() {
		// TODO Auto-generated method stub
		return radius*2;
	}
	
}
