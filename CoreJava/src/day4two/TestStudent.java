package day4two;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(101, "Shiva", 90);
		Student s2 = new Student(102, "Ahiva", 95);
		Student s3 = new Student(103, "Bhiva", 94);
		Student s4 = new Student(104, "Chiva", 93);
		
		SortByRollNo sortByRoll = new SortByRollNo();
		SortByMarks sortByMarks = new SortByMarks();
		
		SortedSet studSet1 = new TreeSet(sortByRoll);
		studSet1.add(s3);
		studSet1.add(s1);
		studSet1.add(s2);
		studSet1.add(s4);
		for(Object ob : studSet1) {
			System.out.println(ob);
		}
		
		SortedSet studSet2 = new TreeSet(sortByMarks);
		studSet2.add(s3);
		studSet2.add(s1);
		studSet2.add(s2);
		studSet2.add(s4);
		for(Object ob : studSet1) {
			System.out.println(ob);
		}
	}

}
