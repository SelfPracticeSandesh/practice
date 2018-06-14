import java.util.Random;

public class GameDice
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int computer, user;
		int computerwin = 0;
		int userwin = 0;
		
		Random rand = new Random();
		
		for(int i = 0; i < 10; i++)
		{
			computer = rand.nextInt(6) + 1;
			user = rand.nextInt(6) + 1;
			
			System.out.println("The value of dice for computer is " + computer);
			System.out.println("The value of dice for user is " + user);
			
			if(computer > user)
			{	
				System.out.println("Computer wins!!!!!!!");
				
				computerwin++;
			}
			else if(computer < user)
			{	
				System.out.println("User wins!!!!!!!");
				
				userwin++;
			}
			else
			{
				System.out.println("It was draw.");
			}
		}
		
		if(computerwin > userwin)
		{
			System.out.println("Computer was a grand winner.");
		}
		else
		{
			System.out.println("User was a grand winner.");
		}
	}
}
