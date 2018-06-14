import java.util.Scanner;

public class RetailPriceCalculator 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		double wholesaleCost, markupPercentage;
		
		System.out.print("Enter an item's wholesale cost: ");
		wholesaleCost = keyboard.nextDouble();
		
		System.out.print("Enter the markup percentage: ");
		markupPercentage = keyboard.nextDouble();
		
		calculateRetail(wholesaleCost, markupPercentage);
	}

	public static void calculateRetail(double wholesaleCost, double markupPercentage)
	{
		double retailPrice = wholesaleCost + ((wholesaleCost/100.0) * markupPercentage);
		
		System.out.print("The retail price of the item is " + retailPrice);
	}
}
