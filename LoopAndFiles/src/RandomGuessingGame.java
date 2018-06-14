import java.util.Scanner;
import java.util.Random;

public class RandomGuessingGame 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int randomNumber;
		int guessNumber;
		char repeat;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the number between 0 and 100: ");
		guessNumber = keyboard.nextInt();
		
		Random rand = new Random();
	
		randomNumber = rand.nextInt(100) + 1;
		
		boolean win = false;
		
		while(win == false) {
		
		if(randomNumber == guessNumber)
		{
			win = true;
		}
		else if(randomNumber > guessNumber)
		{
			System.out.println("Your guess is too low");
			System.out.print("Enter the number between 0 and 100: ");
			guessNumber = keyboard.nextInt();
		}
		else if(randomNumber < guessNumber)
		{
			System.out.println("Your guess is too high");
			System.out.print("Enter the number between 0 and 100: ");
			guessNumber = keyboard.nextInt();
		}
		}
		
		System.out.println("Congratulation. You won!!!!!!");
	}

}
