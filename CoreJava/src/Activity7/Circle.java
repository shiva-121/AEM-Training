package Activity7;

public class Circle extends Shape implements MyColor{
	int radius;
	String color;
	public Circle(int radius, String color) {
		super(color);
		this.radius = radius;
	}


	@Override
	double calculateArea() {
		return (3.14*radius*radius);
	}
	
	
}
