// import java.util.Scanner;

public class EmployeeClass
{
	public static void main(String[] args)
	{
		String employeeFullName;
		int employementId; 
		String nameDepartment;
		String positionEmployee;
		
		/*
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the full name of the employee: ");
		employeeFullName = keyboard.nextLine();
		
		System.out.println("Enter the employee id number: ");
		employementId = keyboard.nextInt(); 
		
		
		Scanner newKey = new Scanner(System.in);
		System.out.println("Enter the name of the department: ");
		nameDepartment = newKey.nextLine();
		
		System.out.println("Enter the name of the position: ");
		positionEmployee = newKey.nextLine(); 
		*/ 
		 
		Employee data1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");  
		 
		Employee data2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
		
        Employee data3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer"); 
		
		System.out.println("Name \t \t" + "ID Number \t \t" + "Department \t \t" + "Position \t \t");
		System.out.println("----------------------------------------------------------------------");
		System.out.println(data1.getName() + "\t" + data1.getIdNUmber() + "\t \t" + 
							data1.getdepartmentName() + "\t \t" + data1.getPosition());
		System.out.println(data2.getName() + "\t" + data2.getIdNUmber() + "\t \t" + 
				data2.getdepartmentName() + "\t \t" + data2.getPosition());
		System.out.println(data3.getName() + "\t " + data3.getIdNUmber() + "\t \t" + 
				data3.getdepartmentName() + "\t \t" + data3.getPosition());
	}
} 
