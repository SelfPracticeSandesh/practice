
public class CoinClass 
{ 
  
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*
		Coin ObjectCoin = new Coin();
		
		System.out.println("The side initially facing up is " + ObjectCoin.getSideUp());
		
		int headCount = 0;
		int tailCount = 0;
		
		for(int i = 0; i < 20; i++)
		{
			System.out.println("Currently, the side it is facing up is " + ObjectCoin.getSideUp());
			
			ObjectCoin.toss(); 
			if(ObjectCoin.getSideUp() == "tails")
			{
				tailCount++;
			}
			else
			{
				headCount++;
			}
		}

		System.out.println("The number of time heads is facing up is" + headCount++);
		
		System.out.println("The number of time tails is facing up is" + tailCount++);
		
		*/
		
		Coin quarter = new Coin();
		Coin dime = new Coin();
		Coin nickel = new Coin();
		
		double startingBalance = 0;
		
		while(startingBalance < 1)
		{
			quarter.toss();
			dime.toss();
			nickel.toss();
			
			if(quarter.getSideUp() == "heads")
			{
				startingBalance = startingBalance + ((double)25 / 100);
			}
			
			if(dime.getSideUp() == "heads")
			{
				startingBalance = startingBalance + (10 / (double)100);
			}
			
			if(nickel.getSideUp() == "heads")
			{
				startingBalance = startingBalance + ((double)5 / (double)100);
			}
		}
		
		if(startingBalance == 1)
		{
			System.out.println("Congratulation!!!!!!!!! You win the game.");
		}
		else
		{
			System.out.println("Sorry, You lose the game");
		}
	} 

}
