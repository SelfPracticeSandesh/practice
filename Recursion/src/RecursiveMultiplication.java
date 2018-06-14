/**
 * The function should return the value of x times y. Multiplication 
 * can be performed as repeated addition as follows:
 * 7 * 4 = 4 + 4 + 4 + 4 + 4 + 4 + 4 = 28
 */

import javax.swing.JOptionPane;
 
public class RecursiveMultiplication  
{
 
	public static void main(String[] args) 
	{ 
		// TODO Auto-generated method stub
		
		String num1, num2;
		
		num1 = JOptionPane.showInputDialog("Enter the number 1: ");
		int number1 = Integer.parseInt(num1);
		
		num2 = JOptionPane.showInputDialog("Enter the number 2: ");
		int number2 = Integer.parseInt(num2);
		
		JOptionPane.showMessageDialog(null, "The sum of two numbers are " +
				multiplication(number1, number2));
		
		System.exit(0); 
	}
	
	public static int multiplication(int x, int y)
	{	
		if(x == 0 || y == 0)
			return 0;
		else
		{
			return y + multiplication(y, x - 1);  
		}
	} 

}
