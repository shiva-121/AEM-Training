package day1;

public class Person {
	// Instance Variable
	String name;
	String address;
	
	public Person() {
		name = "Shivam Sharma";
		address = "Bhopal";
	}

	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	// Method Overriding
	public void printName() {
		System.out.println("Person Name is : "+this.name);
	}
}
