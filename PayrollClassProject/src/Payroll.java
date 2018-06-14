
public class Payroll 
{
	private String employeeName;
	private int employeeIdNumber;
	private double hourlyPayRate;
	private double hoursWorked;
	
	public Payroll(String name, int number)
	{
		employeeName = name;
		employeeIdNumber = number;
		hourlyPayRate = 7.5;
		hoursWorked = 0;
	}
	
	public void setEmployeeName(String nameEmployee)
	{
		employeeName = nameEmployee;
	}
	
	public void setEmployeeIdNumber(int numberIdEmployee)
	{
		employeeIdNumber = numberIdEmployee;
	}
	
	public void setHourlyPayRate(double payRate)
	{
		hourlyPayRate = payRate;
	}
	
	public void setHoursWorked(double workedHours)
	{
		hoursWorked = workedHours;
	}
	
	public String getEmployeeName()
	{
		return employeeName;
	}
	
	public int getEmployeeIdNumber()
	{
		return employeeIdNumber;
	}
	
	public double getHourlyPayRate()
	{
		return hourlyPayRate;
	}
	
	public double getHoursWorked()
	{
		return hoursWorked;
	}
	
	public double GrossPay()
	{
		double grossPay = hoursWorked * hourlyPayRate;
		return grossPay; 
				
	}
	

}
