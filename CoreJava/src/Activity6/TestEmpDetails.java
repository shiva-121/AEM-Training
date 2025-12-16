package Activity6;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class TestEmpDetails {
	public static void main(String[] args) {
		System.out.println("Main");

		Employee e1 = new Employee(101, "John", 30000);
		Employee e2 = new Employee(102, "Kohn", 20000);
		Employee e3 = new Employee(103, "Lohn", 25000);
		Employee e4 = new Employee(104, "Mohn", 35000);
		Employee e5 = new Employee(105, "Nohn", 15000);
		
//		SortedSet<Employee> empSet = new TreeSet<Employee>();
		Set<Employee> empSet = new HashSet<Employee>();
		empSet.add(e5);
		empSet.add(e4);
		empSet.add(e3);
		empSet.add(e2);
		empSet.add(e1);
		
		Employee.getEmpDetails(108, empSet);
		
	}

}
