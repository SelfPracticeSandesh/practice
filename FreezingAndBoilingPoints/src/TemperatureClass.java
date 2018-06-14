import java.util.Scanner;

public class TemperatureClass 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 
		Scanner keyboard = new Scanner(System.in);
		
		int userInputTemperature;  
		
		System.out.println("Enter the termperature: ");
		userInputTemperature = keyboard.nextInt();
		
		SubstanceTemperature ObjectTemperature = new SubstanceTemperature(userInputTemperature);
		
		ObjectTemperature.setTemperature(userInputTemperature);
		
		if(ObjectTemperature.isEthylFreezing())
			{
			System.out.println("Ethyl is freezing.");
			}
		
		if(ObjectTemperature.isOxygenFreezing())
			{
			System.out.println("Oxygen is freezing");
			}
		
		if(ObjectTemperature.isWaterFreezing())
		{
			System.out.println("Water is freezing");
		}
		
		if( ObjectTemperature.isEthylBoiling())
			{
			System.out.println("Ethyl is boiling");
			}
		
		if(ObjectTemperature.isOxygenBoiling())
			{ 
			System.out.println("Oxygen is boiling");
			}
		
		if(ObjectTemperature.isWaterBoiling())
		{
			System.out.println("Water is boiling");
		}
		

	}

}
