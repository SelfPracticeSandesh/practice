import java.util.Scanner;

public class primeNumberList 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);	
		int number;
		
		System.out.print("This programme checks whether the number is prime or not. \n");
		System.out.print("Enter the number: ");
		number = keyboard.nextInt();
		
		isPrime(number);
	}	
	public static void isPrime(int number)
	{
		for(int i = 2; i < number; i++)
		{
			boolean flag = true;
			for(int k = 2; k < i; k++)
			{
				if(i % k == 0)
				{
					flag = false;
				}
			}
			if(flag == true)
				{
					System.out.print(i + "\t");
				}
			
		}
		
		
	}
}
