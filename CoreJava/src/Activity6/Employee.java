//Activity-2 (Use collection instead of Array)
// 
//Create a class Employee with attribute and constructor
//Declare a method getEmpDetails(int empid, Employee[])
//If empid available display it’s details (empid , name , sal)
//If empid not found then throw EmpNotFoundException
//Create a exception class EmpNotFoundException
//Handle the exception using try, catch , finally block
//Create class TestEmpDetails with main() method
//Create a array of 5 Employee object
//Call getEmpDetails(int empid , Employee[])
package Activity6;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class Employee { // implements Comparable - if using SortedSet or TreeSet
	int eid;
	String name;
	int salary;
	public Employee(int eid, String name, int salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}
	public static void getEmpDetails(int eid, Set<Employee> empSet) {
		System.out.println("Getting Details:");
		try {
			for (Employee e : empSet) {
				if(e.eid == eid) {
					System.out.println("Name : "+e.name);
					System.out.println("Id : "+e.eid);
					System.out.println("Salary : "+e.salary);
					return;
				}
			}
			throw new EmpNotFoundException();
		}
		catch(EmpNotFoundException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Done");
		}
		
	}
//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub			If using SortedSet TreeSet
//		return 1;
//	}

}
