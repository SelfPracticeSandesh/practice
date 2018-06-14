 
public class RetailItemClass 
{ 

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 
		/*
		String itemDescription1;
		int unitsNumber1; 
		double retailPrice1;
		*/
		
		RetailItem object1 = new RetailItem("Jacket", 12, 59.95);
		RetailItem object2 = new RetailItem("Designer Jeans", 40, 34.95);
		RetailItem object3 = new RetailItem("Shirt", 20, 24.95);
		
		System.out.println("\t\tDescription\tUnits on Hold\tPrice");
		System.out.println("-----------------------------------------------------");
		System.out.println("Item #1\t\t" + object1.getDescription() + "\t\t" + 
							object1.getUnitsOnHand() + "\t\t" + object1.getPrice());
		System.out.println("Item #2\t\t" + object2.getDescription() + "\t" +
				object2.getUnitsOnHand() + "\t\t" + object2.getPrice());
		System.out.println("Item #3\t\t" + object3.getDescription() + "\t\t" +
				object3.getUnitsOnHand() + "\t\t" + object3.getPrice());
		
 
	}
 
}
   