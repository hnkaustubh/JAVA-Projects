package bankaccountapp;

public class Savings extends Account{
	int safetyBoxDepositID;
	int safetyBoxDepositKey;
	
	public Savings(String name,String sSN, double initDeposit) {
		super(name,sSN,initDeposit);
		accountNumber = "1" + accountNumber;
		System.out.println("New Savings Account");
		System.out.println("Account Number: "+accountNumber);
	}
	
	public void showInfo() {
		System.out.println("Account Type: Savings");
	}
}
