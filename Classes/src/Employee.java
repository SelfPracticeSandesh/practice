
public class Employee
{
	
	/**
	 * These are the fields that hold the value for name of the
	 * employee, id number, department name and position.
	 */
	private String employeeName;
	private int employeeIdNumber;
	private String departmentName;
	private String employeePosition;
	
	
	/**
	 * constructor
	 * @param name - name of the employee
	 * @param idNumber - employee id of the employee
	 * @param department - name fo the department
	 * @param position - position of the employee
	 */
	
	public Employee(String name, int idNumber, String department, String position)
	{
		employeeName = name;
		employeeIdNumber = idNumber;
		departmentName = department;
		employeePosition = position;
	}
	
	/**
	 * department name and employee position are assigned the empty string.
	 * @param name - name of the employee
	 * @param idNumber - employee id of the employee
	 */
	public Employee(String name, int idNumber)
	{
		employeeName = name;
		employeeIdNumber = idNumber;
		departmentName = " "; 
		employeePosition = " ";
	}
	
	/*
	 *  no-arg constructor that assigns empty strings and zero to id number
	 */
	
	public Employee()
	{
		employeeName = " ";
		employeeIdNumber = 0;
		departmentName = " ";
		employeePosition = " ";
	}
	
	public void setName(String name)
	{
		employeeName = name;
	}
	
	public void setIdNumber(int idNumber)
	{
		employeeIdNumber = idNumber;
	}
	
	public void setdepartmentName(String department)
	{	
		departmentName = department;
	}
	
	public void setposition(String position)
	{
		employeePosition = position;
	}
	
	public String getName()
	{
		return employeeName;
	}
	
	public int getIdNUmber()
	{
		return employeeIdNumber;
	}
	
	public String getdepartmentName()
	{
		return departmentName;
	}
	
	public String getPosition()
	{
		return employeePosition;
	}
	
} 


