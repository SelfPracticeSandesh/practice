
public class PersonalInformation 
{
	private String name, address, phoneNumber;
	int age;
	
	
	public PersonalInformation()
	{
		name = " ";
		address = " ";
		age = 0;
		phoneNumber = "(000) 123 - 4567"; 
	}
	
	public void setName(String identity)
	{
		name = identity;
	}
	
	public void setAddress(String place)
	{
		address = place;
	}
	
	public void setAge(int yearsOld)
	{
		age = yearsOld;
	}
	
	public void setPhoneNumber(String contact)
	{
		phoneNumber = contact;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
}
