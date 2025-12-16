package Activity6;

public class EmpNotFoundException extends RuntimeException{
	public EmpNotFoundException() {
		System.out.println("Employee not found.");
	}
}
