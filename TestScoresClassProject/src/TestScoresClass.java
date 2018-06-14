import java.util.Scanner;

public class TestScoresClass  
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub 
		
		Scanner keyboard = new Scanner(System.in);
		
		TestScores ObjectTestScores = new TestScores();
		
		double scoreTest1, scoreTest2,scoreTest3;
		
		System.out.println("Enter the score of test 1: ");
		scoreTest1 = keyboard.nextDouble();
		
		System.out.println("Enter the score of test 2: ");
		scoreTest2 = keyboard.nextDouble();
		
		System.out.println("Enter the score of test 3: ");
		scoreTest3 = keyboard.nextDouble();
		
		ObjectTestScores.setTestScores1(scoreTest1);
		ObjectTestScores.setTestScores2(scoreTest2);
		ObjectTestScores.setTestScores3(scoreTest3);
		
		System.out.println("The average test score is " + ObjectTestScores.averageScores());

	}
 
}
  