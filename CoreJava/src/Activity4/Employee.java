package Activity4;

public class Employee {
	int empId;
	String empName;
	int empSal;
	
	public Employee() {
		empId = 0;
		empName = null;
		empSal = 0;
	}
	public Employee(int empId, String empName, int empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	void getEmpDetails(int empId, Employee empArr[]) {
		try {
			for (Employee e : empArr) {
				if(e.empId == empId) {
					System.out.println("Name : "+e.empName);
					System.out.println("Id : "+e.empId);
					System.out.println("Salary : "+e.empSal);
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
	
	
}
