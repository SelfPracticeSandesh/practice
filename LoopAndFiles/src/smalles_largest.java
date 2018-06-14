import java.util.Scanner;
public class smalles_largest {

	
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		int smallest = 0;
		int largest = 0;
		int number = 0;
		
		do {
			System.out.println("Enter a number");
			number = keyboard.nextInt();
			
			if ((smallest == 0 && largest == 0) && number != -99) {
			smallest = number;
			largest = number;
			}
			
			 if (number < smallest && number != -99) {
				smallest = number;
			}
			if (number > largest) {
				largest = number;
			}
			
			
		}while (number != -99);
		
		System.out.println(smallest);
		System.out.println(largest);
		
	}
}
