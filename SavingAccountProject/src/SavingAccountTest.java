import java.util.Scanner;
 
public class SavingAccountTest 
{ 
 
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		double annualInterestRate, beginningBalance, numberOfMonths;
		double amountDeposited = 0;
		double amountWithdrawal = 0;
		double totalInterestEarned = 0;
		double totalAmountDeposited = 0;;
		double totalAmountWithdrawal = 0;
		
		System.out.println("Enter the annual intrest rate: ");
		annualInterestRate = keyboard.nextDouble();
		
		System.out.println("Enter the starting balance: ");
		beginningBalance = keyboard.nextDouble();
		
		System.out.println("Enter the number of months that have passed " + 
		             "since the account was established: ");
		numberOfMonths = keyboard.nextDouble();
				
		SavingAccount ObjectSavingAccount = new SavingAccount(beginningBalance);
		
		ObjectSavingAccount.setAnnualInterest(annualInterestRate);
		
		for(int i = 1; i <= numberOfMonths; i++)
		{
			System.out.println("Enter the amount deposited into the account " +
		"during this month: ");
			amountDeposited = keyboard.nextDouble();
			totalAmountDeposited = totalAmountDeposited + amountDeposited;
			
			System.out.println("Enter the amount withdrawal into the account " +
					"during this month: ");
			amountWithdrawal = keyboard.nextDouble();
			totalAmountWithdrawal = totalAmountWithdrawal - amountWithdrawal;
			
			totalInterestEarned = totalInterestEarned + ObjectSavingAccount.monthlyIntrestBalance();
				 
		}
		
		System.out.println("Ending Balance: " + ObjectSavingAccount.getbalance());
		System.out.println("The total amount of deposits: " + totalAmountDeposited);
		System.out.println("The total amount of withdrawals: " + totalAmountWithdrawal);
		System.out.println("The monthly interest: " + ObjectSavingAccount.monthlyIntrestBalance());
	}

}
