/*Activity-3 
 
Create a Shape class (abstract)
Write a method calculateArea() (abstract)
 
Create Circle class
Declare the properties like radius
Override a method calculateArea()
 
Create Square class
Declare the properties like length  , breath
Override a method calculateArea()
 
Create Rectangle class
Declare the properties like length  , breath
Override a method calculateArea()
 
Create Interface MyColor
Write a method Void printColor(String color)
 
Implement MyColor interface in all the classes Circle , Square , Rectangle
 
Create Test class with main() method
Create object of Circle , Square , Rectangle
Store all the object in single Array[] or Collection
Using forEach loop OR Iterator Print Area and color of every object.
*/
 
package Activity7;

public abstract class Shape implements MyColor{
	abstract double calculateArea();
	
	String color;

    public Shape(String color) {
    	this.color = color;
	}

	@Override
    public void printColor() {
        System.out.println("Color: " + this.color);
    }

}
