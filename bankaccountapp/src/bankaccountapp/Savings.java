package bankaccountapp;

public class Savings extends Account {
	
	  private int safetyDepositBoxID;
	  private int safetyDepositBoxKey;
	
	//list properties specific to the savings account
	
	//constructor to initialize  settings for the saving properties
	
	public Savings(String name, String sSN, double initDeposit) {
		super(name,sSN,initDeposit);
		
		accountNumber="1"+accountNumber;
//		System.out.println("ACCOUNT NUMBER :"+this.accountNumber);
//		System.out.println("NEW SAVINGS ACCOUNT");
		
		setSafetyDepositBox();
	}
	
	
	private void setSafetyDepositBox() {
		
		safetyDepositBoxID=  (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey=  (int) (Math.random() * Math.pow(10, 4));
		//System.out.println(safetyDepositBoxID);
	}
	
	public void showInfo() {
		//System.out.println("ACCOUNT TYPE: Saving");
		super.showInfo();
		
		System.out.println("Your Saving Account Features " +"\n Safety Deposit Box ID : "+safetyDepositBoxID+"\n Safety Deposit Box Key : "+safetyDepositBoxKey);
	}


	@Override
	public void setRate() {
		System.out.println("implement base rate for savings ");
		rate=getBaseRate() - .25;
		
	}
	
	
	//list any method specific to saving accounts
	

}
