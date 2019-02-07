/**
 * 
 * @author Dylan Hesser
 * program to take grades from a file and calculate the average grade
 *
 */
public class AvgGrades 
{ 
	
	/**
	 * grades- array of grades
	 * amountOfGrades- total amount of grades
	 * gradeAverage- the average of the grades
	 */
	double[] grades ;
	int amountOfGrades;
	double gradeAverage;
    /**
     * default constructor
     */
	public AvgGrades() 
	{
		amountOfGrades = 0;
		grades[amountOfGrades] = 0;
	}
	/**
	 * constructor to take custom input
	 * @param amountOfGrades
	 */
	public AvgGrades (int amountOfGrades) 	
	{
		this.amountOfGrades = amountOfGrades;
	}
	/**
	 * gets the amount of grades
	 * @return amount of grades
	 */
	public int getAmountOfGrades() 
	{
		return amountOfGrades;
	}
	/**
	 * gets the average grade
	 * @return grade average
	 */
	public double getGradeAverage() 
	{
		return gradeAverage;
	}
	/**
	 * sets the amount of grades to custom input
	 * @param amountOfGrades the amount of grades to be used
	 */
	public void setAmountOfGrades(int amountOfGrades) 
	{
		this.amountOfGrades = amountOfGrades;
	}
	/**
	 * sets the grade average to custom input
	 * @param gradeAverage grade average to be used
	 */
	public void setGradeAverage(double gradeAverage) 
	{
		this.gradeAverage = gradeAverage;
	}
	/**
	 * takes the sum of the grades and divides by the amount of grades to get the average
	 * @param grades array of grades to be used
	 * @param amountOfGrades amount of grades to be used
	 * @return the average grade
	 */
	public double gradeAverage(  double grades[],int amountOfGrades) 
	{
		double averageGrade = 0;
		int i;
		double sum = 0;;
		try 
		{
			for (i = 0; i < amountOfGrades; i++) 
			{
				sum = sum + grades[i];
			}
		}
		catch (NumberFormatException e)
		{
			System.out.println("Not a number");
			System.exit(1);
		}
		
		averageGrade = sum / amountOfGrades ;
		return averageGrade;
	}
	/**
	 * formats the information into a string to output
	 */
	public String toString() 
	{
		String str;
		str = "The average of the grades is " + String.format("%.2f", gradeAverage);
		return str;
	}
}
