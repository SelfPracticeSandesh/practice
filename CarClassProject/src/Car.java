
public class Car 
{
	private int yearModel;
	private String make; 
	private int speed;
	
	public Car(int model, String makeCar) 
	{
		yearModel = model;
		make = makeCar;
		speed = 0;
	}
	
	/*
	public void setYearModel(int model)
	{
		yearModel = model;
	}
	
	public void setMake(String makeCar)
	{
		make = makeCar;
	} 
	
	public void setSpeed(int carInertia)
	{
		speed = carInertia;
	}
	
	*/
	
	public int getYearModel()
	{
		return yearModel;
	}
	
	public String getMake()
	{
		return make; 
	} 
	
	public int getSpeed()
	{ 
		return speed;
	}
	
	public void accelerate()
	{
		speed = speed + 5;
	} 
	
	public void brake()
	{
		speed = speed - 5;
	} 
	

}
