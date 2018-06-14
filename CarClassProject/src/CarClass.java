

public class CarClass 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Car carObject = new Car(2018, "Honda"); 
		
		for(int i = 0; i < 5; i++)
		{
			carObject.accelerate();
			System.out.println("The current speed of a car is " + carObject.getSpeed());
			
		} 
		
		for(int i = 0; i < 5; i++)
		{
			carObject.brake();
			System.out.println("The current speed of a car is " + carObject.getSpeed());
			
		} 
		 
	} 
  
}
 