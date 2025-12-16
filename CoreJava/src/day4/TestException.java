package day4;

public class TestException {
	public static void main(String[] args) {
		try {
			UserValidation.login("admin", "admin123");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
