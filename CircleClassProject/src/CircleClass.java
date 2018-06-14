import java.util.Scanner;

public class CircleClass 
{
 
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		double userRadius;
		
		System.out.print("Enter the radius of the circle: ");
		userRadius = keyboard.nextDouble();
		
		Circle objectCircle = new Circle();
		Circle objectCircle1 = new Circle(userRadius);
		
		objectCircle1.setRadius(userRadius);
		
		System.out.println("The area of circle is " + objectCircle1.getArea());
		System.out.println("The diameter of circle is " + objectCircle1.getDiameter());
		System.out.println("The circumference of circle is " + objectCircle1.getCircumference());
		
		
		

	}

}
