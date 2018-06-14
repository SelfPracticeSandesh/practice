import java.util.Scanner;
import java.lang.*;

public class showCharMethod 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		String word = keyboard.nextLine();
		
		System.out.print("Enter the character position you want to see: ");
		int number = keyboard.nextInt();
		
		showChar(word, number);
	}
	
	public static void showChar(String word, int number)
	{
		// int oneletter = Character.getNumericValue(letter);
		
		System.out.print("The letter you want from you entered is " + (word.charAt(number)) + " at index " + number);
		
	}

}
