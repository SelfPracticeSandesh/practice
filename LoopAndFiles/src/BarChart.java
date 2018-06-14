import java.util.Scanner;

public class BarChart {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		int store[];
		store = new int [5];
		
		for(int i = 0; i < 5; i++)
		{
			System.out.print("Enter the today's sales for store " + (i+1) + " :" );
			store[i] = keyboard.nextInt();
		}
		
		// System.out.print("Store " + i + " : " + asterisk);
	
		for (int j = 0; j < 5; j++) {
			System.out.print("Store " + (j+1)+ ":");
			for (int i = 0; i < store[j]/100; i ++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
