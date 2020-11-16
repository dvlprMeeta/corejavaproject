package emailapp;

public class EmailApp {
	
	public static void main(String[] args) {
		
		Email email=new Email("John", "Smith");
		System.out.println("Email Created :" +email.getFirstName() +" "+email.getLastName());
		
		email.setAlternateEmail("abc@gmail.com");
		
		
		System.out.println(email.getAlternateEmail());

	}

}
