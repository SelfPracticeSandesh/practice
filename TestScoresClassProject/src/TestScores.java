
public class TestScores 
{
	private double testScores1;
	private double testScores2;
	private double testScores3;
	
	public TestScores()
	{
		testScores1 = 0;
		testScores2 = 0;
		testScores3 = 0;
		
	}
	
	public void setTestScores1(double test1)
	{
		testScores1 = test1;
	}
	
	public void setTestScores2(double test2)
	{
		testScores2 = test2;
	}
	
	public void setTestScores3(double test3)
	{
		testScores3 = test3;
	}
	
	public double getTestScores1()
	{
		return testScores1; 
	}
	
	public double getTestScores2()
	{ 
		return testScores2;
	}
	
	public double getTestScores3() 
	{
		return testScores3;
	}
	
	public double averageScores()
	{
		double averageTestScores;
		
		averageTestScores = (testScores1 + testScores2 + testScores3) / 3.0;
		
		return averageTestScores;
	}

}
