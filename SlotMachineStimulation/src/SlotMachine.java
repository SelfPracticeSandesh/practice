import java.util.Scanner;
import java.util.Random;

public class SlotMachine 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int amount;
		char answer = 'y';
		
		Scanner keyboard = new Scanner(System.in);
		
		Random randomNumbers = new Random();
		
		do {
		System.out.print("Enter the amount of money you want to enter into the slot machine: ");
		amount = keyboard.nextInt();
		
		
		int prev_num = -1;
		int count = 1;
		for (int i = 1; i <= 3; i++) 
		{
			int number = randomNumbers.nextInt(6) + 1;
			
			switch(number)
			{
				case 1:
					System.out.println("Cherries");
					break;
				
				case 2:
					System.out.println("Orange");
					break;
					
				case 3:
					System.out.println("Plums");
					break;
					
				case 4:
					System.out.println("Bells");
					break;
					
				case 5:
					System.out.println("Melons");
					break;
					
				default:
					System.out.println("Bars");
			}
			
			if (prev_num == -1) {
				prev_num = number;
			}
			
			if (prev_num == number && i > 1) {
				count ++;
			}
			//System.out.println(count);
			if (count == 3 && i == 3) {
				System.out.println("You won Tripal");
			}else if (count == 2 && i == 3) {
				System.out.println("You won Double");
			}else if (count == 1 && i == 3) {
				System.out.println("You didn't win");
			}
			
		}
		
		System.out.println("Do you want to continue (y/n)");
		answer = keyboard.next().charAt(0);
		
		}while(answer == 'y' || answer =='Y');
	
	}
}
