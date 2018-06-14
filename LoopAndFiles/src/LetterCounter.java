import java.util.Scanner;
import java.lang.*;

public class LetterCounter
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		String word;
		char letter;
		
		System.out.print("Enter a word: ");
		word = keyboard.nextLine();
		
		System.out.print("Enter a letter: ");
		letter = keyboard.next().charAt(0);
		
		int count = 0;
		
		for(int i = 0; i < word.length(); i++)
		{
			if(letter == word.charAt(i))
			// if(Character.toLowerCase(letter) == (Character.toLowerCase(word.charAt(i))))
			{
				count = count + 1;
			}
		}
		
		System.out.print("The number of " + letter + " in a given word " + count);
		System.out.println(" ");

		

	}

}
