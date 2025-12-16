package Activity7;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(5, "Red");
		Square s = new Square(5, "Green");
		Rectangle r = new Rectangle(5, 7, "Blue");
		
		Shape[] shapeArr = {c,s,r};
		
		for(Shape sh : shapeArr) {
			System.out.println("Area: "+sh.calculateArea());
			sh.printColor();
		}
		
	}

}
