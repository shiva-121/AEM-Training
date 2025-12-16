package Activity1;

public class Test {

	public static void main(String[] args) {
		MyDate start = new MyDate(8,12,2025);
		MyDate end = new MyDate(13,1,2026);
		MyDate today = new MyDate(9,12,2025);
		
		Attendance attend = new Attendance("Shivam",54, today, true);
		
		Training training = new Training("Java OOP", start, end, "Mr. Sagar Deshmukh", 29, "AEM Sites", attend);
		
		System.out.println(training);
	}

}
