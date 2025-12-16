package day4;

public class UserValidation {
	static void login(String username, String password)// throws LoginException
	{
		System.out.println("Inside Login");
		if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin123")) {
			System.out.println("Welcome");
		}
		else {
			try {
				throw new LoginException("Inavid Credential");
			}
			catch(Exception e){
				
			}
		}
	}
	public static void main(String[] args) {
//		login("amin","admin123");
	}
	
}
