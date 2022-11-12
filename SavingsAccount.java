
public class SavingsAccount extends BankAccount{
	
	private double rate = 2.5;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String n, double a) {
		
		super(n, a);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
		
	}
	
	public void postInterest() {
		
		deposit(getBalance() * (rate/1200));
		
	}
	
	public String getAccountNumber() {
		
		return accountNumber;
		
	}
	
	public SavingsAccount(SavingsAccount sa, double b) {
		
		super(sa, b);
		savingsNumber++;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
		
	}

}
