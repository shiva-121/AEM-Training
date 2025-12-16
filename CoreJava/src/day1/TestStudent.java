package day1;

public class TestStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student(new MyDate()); 		// Composition
		System.out.println(s1);
		s1 = null;
		System.out.println(s1);
		
		MyDate date = new MyDate(); 					// Aggregation
		Student s2 = new Student(date);
		System.out.println(s2);
		s2 = null;
		System.out.println(s2);
		System.out.println(date);
		
//		System.out.println("main()");
		
//		Student s1; // Object Reference Created
//		s1 = new Student(); // Object Created
		
		
		
//		System.out.println("For S1: " + s1);
//		
//		Student s2 = new Student();
//		
//		System.out.println("For S2: " + s2);
//
//		Student s3 = new Student("Iesha", 29, "Bhopal");
//		
//		System.out.println("For S3: " + s3);
		
		
	}

}
