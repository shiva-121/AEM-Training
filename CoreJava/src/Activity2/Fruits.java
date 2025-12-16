package Activity2;

public class Fruits {
	String fruitName;
	int fruitQuantity;
	String fruitColor;
	
	public Fruits() {
		fruitName = null;
		fruitQuantity = 0;
		fruitColor = null;
	}

	public Fruits(String fruitName, int fruitQuantity, String fruitColor) {
		super();
		this.fruitName = fruitName;
		this.fruitQuantity = fruitQuantity;
		this.fruitColor = fruitColor;
	}

	@Override
	public String toString() {
		return "Fruits [fruitName=" + fruitName + ", fruitQuantity=" + fruitQuantity + ", fruitColor=" + fruitColor
				+ "]";
	}
	
	public static void main(String[] args) {
		Fruits fruitArr[] = new Fruits[5];
		fruitArr[0] = new Fruits("Banana", 12, "Yellow");
		fruitArr[1] = new Fruits("Apple", 5, "Red");
		fruitArr[2] = new Fruits("Orange", 7, "Orange");
		fruitArr[3] = new Fruits("Mango", 20, "Yellow");
		fruitArr[4] = new Fruits("Grapes", 50, "Green");
		
		System.out.println("Here is the detail of 5 fruits:");
		
		for(Fruits f : fruitArr) {
			System.out.println(f);
		}
		
	}
}
