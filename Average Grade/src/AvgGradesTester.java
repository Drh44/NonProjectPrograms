import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * 
 * @author Dylan Hesser
 *tester for the AvgGrades class
 */
public class AvgGradesTester 
{
	public static void main(String[] args) throws IOException 
	{

		int amountOfGrades = 0;
		double[] grades ;
		grades = new double[500];
		AvgGrades avgGrades = new AvgGrades(amountOfGrades);
		double gradeAverage;
	
		Scanner reader = new Scanner(new File("grade.txt"));
		InputStream instream = null;

		String fileName = "grade.txt";
		FileReader fileReader = new FileReader(fileName);
		
        System.out.println("Hello this program will read grades from a file and calculate the average grade");
		amountOfGrades = reader.nextInt();
		avgGrades.setAmountOfGrades(amountOfGrades);
		System.out.println(avgGrades.getAmountOfGrades() + " is the total amount of grades");
		//the for loop up next will go through the file and gather all the numbers that are grades
		int i;
		try {
			for (i = 0; i < avgGrades.getAmountOfGrades(); i++) 
			{
				grades[i] = reader.nextDouble();
				System.out.println(grades[i] + " is the next grade.");
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("That is not a number, please correct grades");
			System.exit(1);
		}
		
		avgGrades.setGradeAverage(avgGrades.gradeAverage(grades, amountOfGrades));
		System.out.printf( avgGrades.toString());
	}
}
