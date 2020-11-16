package bankaccountapp;

import java.util.List;

public class BankAccountApp {
	
	public static void main(String[] args) {
		
		String file= "C:\\wsdoc";
		
	//	Checking ck1= new Checking("MEETA","321456879",1500);
//		
//		Savings sa=new Savings("PRITI", "456657897",2500);
//		ck1.showInfo();
//		
//		System.out.println("\n*****************************\n");
//		
//		sa.showInfo();
//		
//		sa.deposit(5000);
//		sa.withdraw(3000);
//		sa.transfer("meeta", 2000);
//		
//		sa.compound();
		
		// read a SVC file then create new accounts based on that data  
		
		

		List<String[]> newAccountHolder=CSV.read(file);
		
		for(String [] accountHolder :newAccountHolder) {
			
			System.out.println("NEW ACCOUNT");
			System.out.println(accountHolder[0]);
			System.out.println(accountHolder[1]);
			System.out.println(accountHolder[2]);
			System.out.println(accountHolder[3]);
			
			
		}
	}

}
