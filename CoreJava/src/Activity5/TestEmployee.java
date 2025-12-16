package Activity5;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestEmployee {

	public static void main(String[] args) {
		System.out.println("Main");

		Employee e1 = new Employee(101, "John", 30000);
		Employee e2 = new Employee(102, "Kohn", 20000);
		Employee e3 = new Employee(103, "Lohn", 25000);
		Employee e4 = new Employee(104, "Mohn", 35000);
		Employee e5 = new Employee(105, "Nohn", 15000);
		
		SortedSet<Employee> empSet1 = new TreeSet<Employee>();
		empSet1.add(e5);
		empSet1.add(e4);
		empSet1.add(e3);
		empSet1.add(e2);
		empSet1.add(e1);
		System.out.println("Sort By Eid:");
		for(Object e : empSet1) {
			System.out.println(e);
		}
		
		SortBySal salSort = new SortBySal();
		SortedSet<Employee> empSet2 = new TreeSet<Employee>(salSort);
		empSet2.add(e5);
		empSet2.add(e4);
		empSet2.add(e3);
		empSet2.add(e2);
		empSet2.add(e1);
		System.out.println("Sort By Salary:");
		for(Object e : empSet2) {
			System.out.println(e);
		}

	}

}
