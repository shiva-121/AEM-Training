//Activity-1 : 
// 
//Create Class Employee
//Declare the properties eid , name , salary.
//Create a set of 5 Employee objects.
//Using comparable sort the Employee set by eid.
//using comparator sort the Employee  set by salary. 
 
package Activity5;

public class Employee implements Comparable<Employee>{
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
		return "Employee [eid=" + eid + ", salary=" + salary + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Employee o) {
		System.out.println("Using Comparable - compareTo(), eid");
		// Ascending Order
		if(this.eid > o.eid)
			return 1;
		else if(this.eid < o.eid)
			return -1;
		return 0;
	}
	

}
