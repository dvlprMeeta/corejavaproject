package bankaccountapp;

public class Checking extends Account {
	
	
	   private  int debitCardNumber;
	   private  int debitCardPin;
	//list the properties specific to a checking account
	
	//constructor to initialize checking account properties
	
	public Checking(String name, String sSN, double initDeposit) {
		super(name,sSN,initDeposit);
		
		accountNumber="2"+accountNumber;
//		System.out.println("ACCOUNT NUMBER :"+this.accountNumber);
//		System.out.println("NEW CHECKING ACCOUNT");
		
		setDebitCard();
	}
	
	//list any methods specific to the checking account
	
	
	private void  setDebitCard() {
		
		debitCardNumber= (int) (Math.random() * Math.pow(10, 12));
		debitCardPin=(int) (Math.random() * Math.pow(10, 4));
		
		System.out.println("Debit Card : "+ this.debitCardNumber);
		System.out.println("Debit Card Pin : "+ this.debitCardPin);
		
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Your Checking Account Features" + "\n Debit Card Number : "+debitCardNumber+
				"\n Debit Card pin "+debitCardPin);
	}

	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		
		System.out.println("implement base rate for checking ");
		rate=getBaseRate() * .15;
		
	}

}
