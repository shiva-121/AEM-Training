package day2;

import day1.Student;

public class TestArray {

	public static void main(String[] args) {
		String str = "Accenture"; // Immutable
		System.out.println("Original String : "+str);
		
		StringBuffer sbuff = new StringBuffer(str);
		sbuff.append(" India");
		str = sbuff.toString();
		System.out.println("After String Buffer : "+str);
		
		StringBuilder sbuild = new StringBuilder(str);
		sbuild.append(" Indore");
		str = sbuild.toString();
		System.out.println("After String Builder : "+str);
		
		
		Student studArr[] = new Student[3];
		studArr[0] = new Student("RAM",11,"Pune");
		studArr[1] = new Student("KAM",12,"Kune");
		studArr[2] = new Student("DAM",13,"Dune");
		for(Student s : studArr) {
			System.out.println(s);
		}
		int intArr[];	// Array reference of type INT
		
		intArr = new int[3];	// Array object of type INT
		
//		String strArray[] = new String[3]; 
		
		intArr[0] = 10;
		intArr[1] = 20;
		intArr[2] = 30;
		
		System.out.println(intArr[0]);
		
		for(int i=0; i<intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		// For-each loop
		for(int ele : intArr) {
			System.out.println(ele+" ");
		}
		
		String fruits[] = new String[3];
		fruits[0] = "Mango";
		fruits[1] = "Apple";
		fruits[2] = "Banana";
 		System.out.println("Here are 3 fruits:");
		int i = 1;
		for(String f : fruits) {
			System.out.println(i+" "+f);
			i++;
		}
		

	}

}
