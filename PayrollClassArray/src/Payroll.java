
public class Payroll 
{
	
	private int[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
    private final int noOfEmployees = 7;
	private double[] hours = new double[noOfEmployees];
	private double[] payRate = new double[noOfEmployees];
	private double[] wages = new double[noOfEmployees];
	private int employeeIdentification;
	private double employeeHours, employeeWages, employeePayRate;
	 
	 
	 
	
	public void setEmployeeIdentification(int employeeIdenti)
	{
		employeeIdentification = employeeIdenti;
	}
	
	public int getNoOfEmployees() {
		return noOfEmployees;
	}
	
	public void setEmployeeHours(double employeeHrs, int employeeIdentification)
	{
		hours[employeeIdentification] = employeeHrs;
	}
	
	public void setEmployeePayRate(double employeeRate, int employeeIdentification)
	{
		payRate[employeeIdentification] = employeeRate;
	}
	
	public int getEmployeeIdentification(int idNum)
	{
		return employeeId[idNum];
	}
	
	public double[] getEmployeeHours()
	{
		return hours;
	}
	
	public double[] getEmployeePayRate()
	{
		return payRate;
	}
	
	public void calculateWages()
	{
		for(int i = 0; i < noOfEmployees; i++)
		{
			wages[i] = hours[i] * payRate[i];
		//	System.out.println("Wages are: " + wages[i]);
		}
	}
	
	public double employeeMethod(int employeeIdentification)
	{
		for(int i = 0; i < noOfEmployees; i++)
		{
			if(employeeId[i] == employeeIdentification)
				return wages[i];
		}
		return -1;
	}
	
	
	
	

}
