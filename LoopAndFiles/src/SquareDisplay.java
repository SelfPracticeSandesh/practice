import java.util.Scanner;

public class SquareDisplay 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		int length;
		
		System.out.println("User will input the positive integer no greater than 15.");
		System.out.print("Enter the length of each side of the square: ");
		length = keyboard.nextInt();
		
		for(int i = 0; i < length; i++)
		{
			for(int j = 0; j < length; j++)
			{
				System.out.print("X");
			}
			System.out.println("");
		}
	}
}
