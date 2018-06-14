
public class RainFall 
{
	private final int MONTHS = 12;
	private double[] months = new double[MONTHS];
	private double totalRainFall, averageRainFall;
	private double mostRainFall, leastRainFall;
	
	
	public RainFall()
	{
		totalRainFall = 0;
		averageRainFall = 0;
		mostRainFall = 0;
		leastRainFall = 0;
	}
	  
	public int getMonths() {
		return MONTHS;
	}
	public void setRainFall(double value, int index) {
		months[index] = value;
	}
	
	public void calculate() {
		
		mostRainFall = months[0];
		leastRainFall = months[0];
		totalRainFall = months[0];
		
		for (int i = 1; i < MONTHS; i++) {
			
			totalRainFall = totalRainFall + months[i];
			
			if(mostRainFall < months[i]) {
				mostRainFall = months[i];
			}
			
			if(leastRainFall > months[i]) {
				leastRainFall = months[i];
			}
		}
		
		averageRainFall = totalRainFall/12;
		
		
		
	}
	public double getTotalRainFall()
	{
		return totalRainFall;
		
	} 
	
	public double getAverageRainFall()
	{
		return averageRainFall;
	}
	
	public double getMostRainFall()
	{
		return mostRainFall;
	}
	
	public double getLeastRainFall()
	{
		return leastRainFall;
	}
}
