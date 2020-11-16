package emailapp;

import java.util.Scanner;

public class Email{
	
   private	String firstName;
   private String lastName;
   private String password;
   private int defaultPasswordLength=10;
   private String department;
   private String email;
   private int mailBoxCapacity;
   private String alternateEmail;
   private String companySuffix="meeta.com";
   public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public int getMailBoxCapacity() {
	return mailBoxCapacity;
}
public Email(String firstName, String lastName) {
	this.firstName = firstName;
	this.lastName = lastName;
	
	System.out.println("Email Created : " +this.firstName +" "+this.lastName);
	
	//call a method asking for the department and return the department
	  this.department=setDepartment();
	  System.out.println("Department "+this.department);
	  
	  //call a method that returns random password
	  
	  this.password=randomPassword(defaultPasswordLength);
	  System.out.println("Your password is "+this.password);
	  
	  //combine elements to generate email
	  
	   email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"." +companySuffix;
	   System.out.println(email);
	   
	   System.out.println("show details "+showInfo());
}
public void setMailBoxCapacity(int mailBoxCapacity) {
	this.mailBoxCapacity = mailBoxCapacity;
}
public String getAlternateEmail() {
	return alternateEmail;
}
public void setAlternateEmail(String alternateEmail) {
	this.alternateEmail = alternateEmail;
}




private String setDepartment() {
	
	System.out.print("DEPARTMENT CODES \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n Enter department code:");
	Scanner in= new Scanner(System.in);
	int depChoice = in.nextInt();
	
	if(depChoice==1) {
		return "sales";
	}else if(depChoice==2) {
		return "dev";
		
	}
	else if(depChoice==3) {
		return "act";
	}
	
	else 
		return "";
	}


private String randomPassword(int length) {
	String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#%";
	char[] password=new char[length];
	for(int i=0;i<length;i++) {
		int rand=(int)(Math.random() * passwordSet.length());
		password[i]=passwordSet.charAt(rand);
	}	
	return new String(password);
	
	
	
}

private String showInfo() {
	
	return firstName+"" +lastName;
	
}



}
