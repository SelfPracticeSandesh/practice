import java.util.Scanner;
 
public class PayRollClass 
{
 
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		String employeeFullName;
		int employementIdNumber;
		double employementHour;
		double employementPayRate;
		
		System.out.println("Enter the name of the employee: ");
		employeeFullName = keyboard.nextLine();
		
		System.out.println("Enter the employee id number: ");
		employementIdNumber = keyboard.nextInt();

		System.out.println("Enter the number of hours employee have worked: ");
		employementHour = keyboard.nextDouble();
		
		System.out.println("Enter the pay rate of the employee hourly: ");
		employementPayRate = keyboard.nextDouble();
		
		Payroll ObjectPayroll = new Payroll(employeeFullName, employementIdNumber);
		
		ObjectPayroll.setHoursWorked(employementHour);
		ObjectPayroll.setHourlyPayRate(employementPayRate);
		
		System.out.println("Employee Name: " + employeeFullName);
		System.out.println("Employee Id Number: " + employementIdNumber);
		System.out.println("The amount of gross pay is " + ObjectPayroll.GrossPay());
		
		
		
		
		
		
		

	}

}
