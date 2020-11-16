package java8;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableAndComparator {
	
	public static void main(String[] args) {
		
		Student st1=new Student(101,"meeta",21);
		Student st2=new Student(102,"sunita",20);
		Student st3=new Student(103,"meeta",23);
		Student st4=new Student(104,"priti",24);
		
		
		ArrayList<Student> al=new ArrayList<>();
		
		al.add(st1);
		al.add(st2);
		al.add(st3);
		al.add(st4);
		
		
		Collections.sort(al);
		
		System.out.println(al);
		
		
		
		
		
		
		
	}

}




class Student implements Comparable<Student>{
	
	 private String studentname;
	    private Integer rollno;
	    private Integer studentage;
	    
	    public Student(Integer rollno, String studentname, Integer studentage) {
	         this.rollno = rollno;
	         this.studentname = studentname;
	         this.studentage = studentage;
	    }
	    
		public String getStudentname() {
			return studentname;
		}
		public void setStudentname(String studentname) {
			this.studentname = studentname;
		}
		public Integer getRollno() {
			return rollno;
		}
		@Override
		public String toString() {
			return "Student [studentname=" + studentname + ", rollno=" + rollno + ", studentage=" + studentage + "]";
		}

		public void setRollno(Integer rollno) {
			this.rollno = rollno;
		}
		public Integer getStudentage() {
			return studentage;
		}
		public void setStudentage(Integer studentage) {
			this.studentage = studentage;
		}

	   
		@Override
		public int compareTo(Student studentr) {
		    //return 	this.getRollno().compareTo(studentr.getRollno());
			
			return this.getStudentage().compareTo(studentr.rollno);
		}
}