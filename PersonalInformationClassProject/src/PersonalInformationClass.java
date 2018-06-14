
public class PersonalInformationClass 
{  
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		PersonalInformation me = new PersonalInformation();
		PersonalInformation friend = new PersonalInformation();
		PersonalInformation family = new PersonalInformation();
		
		me.setName("Sandesh");
		friend.setName("Prajwol");
		family.setName("Sarina");
		
		me.setAddress("USA");
		friend.setAddress("Nepal");
		family.setAddress("Australia");
		 
		me.setAge(24); 
		friend.setAge(24);
		family.setAge(21);
		
		me.setPhoneNumber("123 456 789");
		friend.setPhoneNumber("123 456 7890");
		family.setPhoneNumber("123 456 7");
		
		System.out.println("Name\t\tAddress\t\tAge\t\tPhone Number");
		System.out.println(me.getName() + "\t\t" + me.getAddress() + "\t\t" +
		              me.getAge() + "\t\t" + me.getPhoneNumber());
		System.out.println(friend.getName() + "\t\t" + friend.getAddress() + "\t\t" +
				friend.getAge() + "\t\t" + friend.getPhoneNumber());
		System.out.println(family.getName() + "\t\t" + family.getAddress() + "\t" +
				family.getAge() + "\t\t" + family.getPhoneNumber());
	}

}
