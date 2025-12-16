package Activity7;

public class Square extends Shape implements MyColor{
	int side;
	String color;

	public Square(int side, String color) {
		super(color);
		this.side = side;
	}


	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return (side*side);
	}
	
}
