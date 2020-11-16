package bankaccountapp;

public interface IRate {
	
	default double getBaseRate() {
		return 2.5;
	}
	
	//write a method that returns the base rate

}
