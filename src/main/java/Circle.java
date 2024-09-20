
public class Circle {
	
	private double radius;
	
	public Circle(double r){
		this.radius = r;
	}
	
	public double area(){
		return (radius*radius) * Math.PI;
	}
}
