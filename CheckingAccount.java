
public class CheckingAccount extends BankAccount{
	
	private static final double FEE = .15;
	
	public CheckingAccount(String n, int a){
		
		super(n, a);
		setAccountNumber(getAccountNumber() + "-10");
		
	}
	
	public boolean withdraw(double a) {
		
		double amount = a + FEE;
		return super.withdraw(amount);
		
	}

}
