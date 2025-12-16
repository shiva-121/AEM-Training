package Activity5;

import java.util.Comparator;

public class SortBySal implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		System.out.println("Using Comparator - compare(), salary");
		// Descending Order
		if(o1.salary < o2.salary)
			return 1;
		else if(o1.salary > o2.salary)
			return -1;	
		return 0;
	}

}
