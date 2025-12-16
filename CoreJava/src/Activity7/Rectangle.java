package Activity7;

public class Rectangle extends Shape implements MyColor{
	int length, breadth;
	String color;
	
	public Rectangle(int length, int breadth, String color) {
		super(color);
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return(2*(length+breadth));
	}
	
}
