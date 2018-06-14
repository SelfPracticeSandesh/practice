import java.util.Scanner;

public class RainFallClass 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		RainFall ObjectRainFall = new RainFall();
		
		int userInput;
		
		for(int i = 0; i < ObjectRainFall.getMonths(); i++)
		{
			System.out.println("Enter the rain fall for month " + (i+1) + " : ");
			double value = keyboard.nextInt();
			ObjectRainFall.setRainFall(value,i); 
			
		} 
		ObjectRainFall.calculate();
		System.out.println("The total number of rainfall is " + 
		ObjectRainFall.getTotalRainFall());
		
		System.out.println("The average number of rainfall is " + 
				ObjectRainFall.getAverageRainFall());
		
		System.out.println("The most number of rainfall is " + 
				ObjectRainFall.getMostRainFall());
		
		System.out.println("The least number of rainfall is " + 
				ObjectRainFall.getLeastRainFall());
 
	}

}  
