import java.util.*;
public class RockPaperGame 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		Random randomGames = new Random();
		
		String userChoice;
		
		int choice = randomGames.nextInt(3) + 1;
			
			System.out.print("Enter your choices: Rock, Paper or Scissors: ");
			userChoice = keyboard.nextLine();
			
			System.out.println("The user choice is " + userChoice);
			
			
			switch(choice)
			{
				case 1:
					System.out.println("The computer choice is Rock");
					break;
					
				case 2:
					System.out.println("The computer choice is Paper");
					break;
					
				case 3:
					System.out.println("The computer choice is Scissors");
					break;
			}
			
			String computerChoice = String.valueOf(choice);
			
			winnerSelector(userChoice, computerChoice);
	}

	public static void winnerSelector(String userChoice, String computerChoice)
	{
		System.out.println("Sammer".compareTo("Sameer") == 0);
		
		
		if (Objects.equals(computerChoice, userChoice)) 
		{      
			System.out.println("It's a tie!"); 
		}
		else if(Objects.equals(userChoice, "Rock"))
		{
		       if (Objects.equals(computerChoice, "Scissors")) 
		    	     System.out.println("Rock crushes scissors. You win!!");
		       else if (Objects.equals(computerChoice, "Paper")) 
		            System.out.println("Paper eats rock. You lose!!"); 
		}
		else if (Objects.equals(userChoice, "Paper")) 
		{
		       if (Objects.equals(computerChoice, "Scissors")) 
		       System.out.println("Scissor cuts paper. You lose!!"); 
		    else if (Objects.equals(computerChoice, "Rock")) 
		            System.out.println("Paper eats rock. You win!!"); 
		}else if (Objects.equals(userChoice, "Scissors"))
		{
		         if (Objects.equals(computerChoice, "Paper")) 
		         System.out.println("Scissor cuts paper. You win!!"); 
		    else if (Objects.equals(computerChoice, "Rock")) 
		            System.out.println("Rock breaks scissors. You lose!!"); 
		}else 
		{
		         System.out.println("Invalid user input.");
		}
	}
}
