package day4two;

import java.util.Comparator;

public class SortByName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		System.out.println("compare method rollno");
//		if(o1.name > o2.name)
//			return -1;
//		if(o1.name < o2.name)
//			return 1;
		return 0;
	}

}
