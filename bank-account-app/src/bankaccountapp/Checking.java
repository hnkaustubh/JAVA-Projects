package bankaccountapp;

public class Checking extends Account{
	int debitCardNumber;
	int debitCardPin;
	
	public Checking(String name, String sSN, double initDeposit) {
		super(name,sSN,initDeposit);
		accountNumber = "2" + accountNumber;
		System.out.println("New Checking Account");
		System.out.println("Account Number: "+accountNumber);
	}
	
	public void showInfo() {
		System.out.println("Account Type: Checking");
	}
}
