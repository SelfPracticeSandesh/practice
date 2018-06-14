import java.util.Scanner;
import java.io.*;

public class FileHeadDisplay {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		
		String filename;
		String friendName;
		int numFriends;
		
		Scanner keyboard = new Scanner(System.in);
		
		/*
		System.out.print("How many friends do you have? ");
		numFriends = keyboard.nextInt();
		
		keyboard.nextLine();
		
		System.out.print("Enter the filename: ");
		filename = keyboard.nextLine();
		
		PrintWriter outputFile = new PrintWriter(filename);
		
		for(int i = 1; i <= numFriends; i++)
		{
			System.out.print("Enter the content for the file: ");
			friendName = keyboard.nextLine();
		
		outputFile.println(friendName);
		}
		outputFile.close();
		
		System.out.println("Data written to the file.");
		*/
		
		System.out.print("Enter the name of a file: ");
		filename = keyboard.nextLine();
		
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);
		
		for(int i = 0; i < 5; i++)
		{
		String line = inputFile.nextLine();
		System.out.println(line);
		}
		
		inputFile.close();
		

	}

}
