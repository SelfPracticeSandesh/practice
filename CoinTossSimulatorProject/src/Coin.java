import java.util.Random;

public class Coin 
{
	// it will hold either "heads" or "tails"
	private String sideUp; 
	 
	public Coin()
	{
		toss();
	}
	  
	public void toss()
	{
		Random rand = new Random();
		
		int randomNumber = rand.nextInt(2);
 		
		if(randomNumber == 0)
		{
			sideUp = "tails";
		}
		else
		{
			sideUp = "heads";
		}
	}
	
	public String getSideUp()
	{
		return sideUp;
	}
	
	

}
