
public class Circle 
{
	private double radius;
	private final double PI = 3.14159;
	
	public Circle(double circleRadius)
	{
		radius = circleRadius;
	}
	
	public Circle()
	{
		radius = 0;
	}

	public void setRadius(double radiusCircle)
	{
		radius = radiusCircle;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double getArea()
	{
		double area;
		
		area = PI * radius * radius;
		
		return area;
	}
	
	public double getDiameter()
	{
		double diameter;
		
		diameter = radius * 2;
		
		return diameter;
	}
	
	public double getCircumference()
	{
		double circumference;
		
		circumference = 2 * PI * radius;
		
		return circumference;
	}
	
	
}
