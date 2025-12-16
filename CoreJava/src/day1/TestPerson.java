package day1;

public class TestPerson {
	// Method  Overloading Compile/Static Polymorphism
//	static void printPerson(Student var) {
//		System.out.println(var);
//	}
//	static void printPerson(Employee var) {
//		System.out.println(var);
//	}
	static void printPerson(Person var) {
		System.out.println(var);
	}

	public static void main(String[] args) {
		System.out.println("Main TestPerson");
		// TestPerson test = new TestPerson();
		
//		TestPerson.printPerson(new Student());
//		TestPerson.printPerson(new Employee());
		
		
		Student stud = new Student();
		System.out.println(stud);
//		
//		Employee emp = new Employee();
////		System.out.println(emp);
////		
//		Person per = new Person();
////		System.out.println(per);
////		
////		// Generic Reference
////		per = new Student();
////		per = new Employee();
//		
//		per.printName();
//		stud.printName();
//		emp.printName();
//		
	}

}
