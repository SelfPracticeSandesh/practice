import java.util.Scanner;

public class PaintJobEstimator
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		double rooms;
		double priceGallon; 
		double squareFeetWall = 0;
		double totalSquareFeet = 0;
		
		System.out.print("Enter the number of rooms to be painted: ");
		rooms = keyboard.nextDouble();
		
		System.out.print("Enter the price of the paint per gallon: ");
		priceGallon = keyboard.nextDouble();
		
		for(int i = 0; i < rooms; i++)
		{
			System.out.print("Enter the square feet of wall space in each room: ");
			squareFeetWall = keyboard.nextDouble();
			
			totalSquareFeet = totalSquareFeet + squareFeetWall;
		}
		
		roomPaint(rooms, priceGallon, totalSquareFeet);
		
	}

	public static void roomPaint(double rooms, double priceGallon, double totalSquareFeet)
	{
		
		double totalGallons = totalSquareFeet * (1.0 / 115.0);
		
		double laborsHours = totalSquareFeet * 8.0;
		
		double costOfPaint = laborsHours + totalGallons;
		
		double laborCharges = laborsHours * 18.0;
		
		double totalCost = costOfPaint + laborCharges;
		
		System.out.print("The number of gallons of paint required: " + totalGallons + "\n"
				+ " The hours of labor required: " + laborsHours + "\n" + 
				"The cost of the paint: " + costOfPaint + "\n" + 
				"The labor charges: " + laborCharges + "\n" +
				"The total cost of the paint job: " + totalCost);
		
		
		
		
	}
}
