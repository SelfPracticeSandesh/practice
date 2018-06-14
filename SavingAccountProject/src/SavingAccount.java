
public class SavingAccount 
{ 
	private double annualInterest, balance;
	 
	public void withdrawal(double amount)
	{ 
		
		balance = balance - amount;
		
	}
	 
	public void deposit(double depositedAmount)
	{
		
		balance = balance + depositedAmount;
	}
	
	public double getbalance()
	{
		return balance;
	}

	public double monthlyIntrestBalance()
	{
		double monthlyInterest = ((annualInterest / 12) * balance);
		balance = balance + monthlyInterest;
		 
		return monthlyInterest;
		
	}
	
	public void setAnnualInterest(double annualInt)
	{
		annualInterest = (annualInt / 100);
	}
	
	public SavingAccount(double startingBalance)
	{
		balance = startingBalance;
		annualInterest = 0;
	}
	

}
