package day4two;

import java.util.Comparator;

public class SortByMarks implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		System.out.println("compare method mark");
		if(o1.marks > o2.marks)
			return -1;
		if(o1.marks < o2.marks)
			return 1;
		return 0;
	}
	
	
}
