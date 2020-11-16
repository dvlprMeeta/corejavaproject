import java.util.Scanner;

public class StudentDatabaseApp {
	
	public static void main(String[] args) {
		
//		Student mn=new Student();
//		mn.enroll();
//		mn.viewBalance();
//		mn.payTution();
//		String showInfo = mn.showInfo();
//		System.out.println(showInfo);
		
		// ask how many user want to add
		
		System.out.println("Enter how many students need to enroll :");
		
		Scanner sc=new Scanner(System.in);
		  int noOfStudents=sc.nextInt();
		  
		
		// create a n umber of new students
		
		Student[] students= new Student[noOfStudents];
		for(int n=0;n<noOfStudents;n++) {
			students [n]=new Student();
			students[n].enroll();
			students[n].viewBalance();
			students[n].payTution();
			
			
			
		}
		
		
		
		
		
		
	}
	
	// ask how many user want to add
	// create a number of new students

}
