import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String cources=null;
	private int tutionBalance=0;
	private static  int costOfCourse=600;
	private static  int id=1000;
	
	// constructor prompt user to enter student's name and year
	
	
	public Student() {
		
		Scanner in=new Scanner(System.in);
		
		System.out.print("enter student firstname :");
		this.firstName=in.nextLine();
		
		System.out.print("enter student lastname :");
		this.lastName=in.nextLine();
		
		System.out.print("1 -freshmen\n2 -sophmore\n3 -junior\n4 -senior\nEnter student class level : ");
		
		this.gradeYear=in.nextInt();
		
		setStudentID();
		System.out.println(firstName + " "+ lastName + " "  +gradeYear + " " +studentID);
		
		setStudentID();
	}
	
	//generate an id
	private void setStudentID() {
		id++;
		this.studentID=  gradeYear + "" +id;
		
	}
	
	
	
	
	// enroll in courses
	
	public void enroll() {
		do {
		System.out.println("enter course to enroll(Q to quit):");
		Scanner in= new Scanner(System.in);
		String cource=  in.nextLine();
		
		if(!cource.equals("Q")) {
			
			cources=cources+"\n"+cource;
			tutionBalance=tutionBalance+costOfCourse;
		}
			else {
				break;
				
			}
		}while(1!=0);
		
		System.out.println("Enrolled in "+cources);
		System.out.println("Tution Balance : "+tutionBalance);
		
		
		
	}
		
	
	
	// view balance
		
		public void viewBalance() {
			System.out.println("Your balance: "+tutionBalance);
		}
	
	//pay tution
		
		public void payTution() {
			System.out.print("enter payment :");
			Scanner in=new Scanner(System.in);
			int payment=in.nextInt();
			tutionBalance=tutionBalance-payment;
			System.out.println("Thanks for payment "+payment);
			viewBalance();
			
			
		}
	
	//show status
		
		public String showInfo() {
			
			return  "FIRSTNAME " +firstName  +"LASTNAME "+lastName+"\nCources Enrolled:"+cources+ "\nBalance :" +tutionBalance;
		}


	}

