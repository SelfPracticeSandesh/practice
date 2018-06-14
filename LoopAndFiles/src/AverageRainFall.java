import java.util.Scanner;

public class AverageRainFall 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		int years;
		int month;
		double rainfall;
		double inches = 0;
		double total_inches = 0;
		
		System.out.print("Enter the number of years to measure rainfall: ");
		years = keyboard.nextInt();
		
		month = years * 12;
		
		
		for(int i = 1; i <= years; i++)
		{
			if(years < 1)
			{
				System.out.print("Enter the number of years to measure rainfall: ");
				years = keyboard.nextInt();
			}
			for(int j = 1; j <= 12; j++)
			{
				 
				System.out.print("Enter the inches of rainfall for that month: ");
				inches = keyboard.nextDouble();
				total_inches = total_inches + inches; 
				
			}
			
		}
		
		rainfall = total_inches / month;

		System.out.println("The total number of month is " + month);
		System.out.println("The total inches of rainfall is " + total_inches);
		System.out.println("The average rainfall per month for the entire period is " + rainfall);
	}

}
