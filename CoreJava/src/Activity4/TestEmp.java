package Activity4;

public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee empArr[] = new Employee[5];
		empArr[0] = new Employee(101, "Ahiva", 10000);
		empArr[1] = new Employee(102, "Bhiva", 20000);
		empArr[2] = new Employee(103, "Chiva", 30000);
		empArr[3] = new Employee(104, "Dhiva", 40000);
		empArr[4] = new Employee(105, "Ehiva", 50000);
		
		Employee e = new Employee();
		e.getEmpDetails(101, empArr);

	}

}
