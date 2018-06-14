import java.util.Scanner;

public class EmployeePayRoll {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		Payroll ObjectPayroll = new Payroll();
		
		//double userInputHours, userPayrate;
		
		for(int i = 0; i < ObjectPayroll.getNoOfEmployees(); i++)
		{
			System.out.println("Enter the employee's hours and payrate for " +
		    ObjectPayroll.getEmployeeIdentification(i) + " : ");
			
			double userInputHours = keyboard.nextDouble();
			double userPayrate = keyboard.nextDouble();
			
			ObjectPayroll.setEmployeeHours(userInputHours, i);
			ObjectPayroll.setEmployeePayRate(userPayrate, i);
			ObjectPayroll.calculateWages();
		}
		
		
		for(int i = 0; i < ObjectPayroll.getNoOfEmployees(); i++)
		{			
			System.out.println("Employee Identification Number: " + ObjectPayroll.getEmployeeIdentification(i));
			System.out.println("Employee Wage: " + ObjectPayroll.employeeMethod(ObjectPayroll.getEmployeeIdentification(i)));
			System.out.println("----------------------------------------------");
			
		}

	}

}
