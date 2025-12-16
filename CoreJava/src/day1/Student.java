package day1;
				// Is-a relationship
public class Student extends Person {

	public Student(MyDate dob) {
			super();
			this.dob = dob;
	}

	// Instance Variables
	int rollNum;
	MyDate dob; 	// Has-a relationship
	
	// Class Variables
	static String schoolName;
	
	// Static Block (Recommend for initializing static member)
	// First thing after object creation
	static {
		schoolName = "LNCT Bhopal";
		System.out.println("Static block");
	}
	
	// Static Method
	static void printSchool() {
		System.out.println("SchoolName: " + schoolName);
	}
	
	// Default Constructor
	// Execute after static block
	public Student() {
		super(); // Calls parent class constructor
		rollNum = 54;
		dob = new MyDate();
		System.out.println("Default constructor Student()");
	}
	
	// Parameterized Constructor
	public Student(String name, int rollNum, String address) {
		super(name, address);
		this.rollNum = rollNum;
		System.out.println("Parameter constructor Student(_,_,_)");
	}
	
	@Override
	public String toString() {
		return "Student [rollNum=" + rollNum + ", dob=" + dob + ", name=" + name + ", address=" + address + "]";
	}

	// Method Overriding
	public void printName() {
		System.out.println("Student Name is : "+this.name);
	}
}
