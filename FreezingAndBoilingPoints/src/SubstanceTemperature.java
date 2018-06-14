 
public class SubstanceTemperature 
{
	private int temperature;
	
	public SubstanceTemperature(int temperatureGiven)
	{
		temperature = temperatureGiven;
	}
	
	public void setTemperature(int temp)
	{
		temperature = temp;
	}
	
	public int getTemperature()
	{
		return temperature;
	}
	
	public boolean isEthylFreezing()
	{
		if(temperature <= -173)
			return true;
		else
			return false;
	}
	
	public boolean isEthylBoiling()
	{
		if(temperature >= 172)
			return true;
		else
			return false;	
		}
	
	public boolean isOxygenFreezing()
	{
		if(temperature <= -362)
			return true;
		else 
			return false;
	}
	
	public boolean isOxygenBoiling()
	{
		if(temperature >= -306)
			return true;
		else 
			return false;
	}
	
	public boolean isWaterFreezing()
	{
		if(temperature <= 32)
			return true;
		else 
			return false;
	}
	
	public boolean isWaterBoiling()
	{
		if(temperature >= 212)
			return true;
		else 
			return false;
	}
	
	
	
}
