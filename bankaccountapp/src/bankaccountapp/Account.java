package bankaccountapp;

public abstract class Account implements IRate {
	
	private String name;
	private String sSN;
	private static int index=10000;
	private double balance;
	protected String accountNumber;
	protected double rate;
	
	
	//list common properties for savings and checking accounts
	
	// constructor to set base properties and initialize the account
	
	public Account(String name,String sSN, double initDeposit) {
		this.name=name;
		this.sSN=sSN;
		balance= initDeposit;
		
		//System.out.println("NAME :"+name +"SSN :"+sSN + "Balance :$"+balance);
		
		//set account number
		index++;
		this.accountNumber=setAccountNumber();
		
		//System.out.println("ACCOUNT NUMBER :"+this.accountNumber);
		setRate();
	}
	
	public abstract void setRate(); 
		
	
	
	private String setAccountNumber() {
		String lastTwoOfSSN=sSN.substring(sSN.length()-2, sSN.length());
		int uniqueID=index;
		   int random=(int)(Math.random() * Math.pow(10,3));
		return lastTwoOfSSN + uniqueID +random;
				
	}
	
     public void deposit(double amount) {
    	 balance=balance+amount;
    	 System.out.println("depositing $ "+amount);
    	 printBalance();
	}
     
     public void withdraw(double amount) {
 		balance=balance-amount;
 		System.out.println("Withdrawing $ "+amount);
 		printBalance();
    }
	
	public void transfer(String toWhere, double amount) {
		balance=balance-amount;
		System.out.println("Transferring $ "+amount + "to" +toWhere);
		printBalance();
		
	}
	
	public void printBalance() {
		System.out.println("Your balance is now : $"+balance);
		
	}
	
	public void compound() {
		double accuredIntrest=balance*(rate/100);
		System.out.println("Accrued Intrest"+accuredIntrest);
		printBalance();
	}
	
	
	public void showInfo() {
		System.out.println("NAME : " + name +"\nACCOUNT NUMBER : "+ accountNumber+"\nBalance : "+balance+"\nRATE: "+rate+"%");
	}
	
	
	// list common methods
	
	

}
 