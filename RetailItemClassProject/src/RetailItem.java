
public class RetailItem 
{
	private String description;
	private int unitsOnHand;
	private double price;
	
	public RetailItem(String itemDescription, int unitsNumber, double retailPrice)
	{
		description = itemDescription;
		unitsOnHand = unitsNumber;
		price = retailPrice;
		
	}
	
	public void setDescription(String descriptionItem)
	{
		description = descriptionItem;
	}
	
	public void setUnitsOnHand(int numberUnits)
	{
		unitsOnHand = numberUnits;
	}
	
	public void setPrice(double priceRetail)
	{
		price = priceRetail;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public int getUnitsOnHand()
	{
		return unitsOnHand;
	}
	
	public double getPrice()
	{
		return price;
	}


}
