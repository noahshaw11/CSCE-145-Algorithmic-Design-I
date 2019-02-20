/*
 * Created by Noah Shaw
 */
import java.io.File;
import java.util.Scanner;

public class GradeCalculator {
	
	private static Grade[] grades = new Grade[50];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readFromFile("other.txt");
		double labs = 0;
		int labCount = 0;
		double reports = 0;
		int reportsCount = 0;
		double homework = 0;
		int homeworkCount = 0;
		double examOne = 0;
		double examTwo = 0;
		double labExamOne = 0;
		double labExamTwo = 0;
		double fin = 0;
		double extraCredit = 0;
		double total = 0;
		for(int i = 0; i < grades.length - 1; i++)
		{
			
			if(grades[i] == null)
			{
				continue;
			}
			
			if(grades[i].getName().equalsIgnoreCase("labs"))
			{
				labs = labs + grades[i].getScore();
				labCount++;
			}
			else if(grades[i].getName().equalsIgnoreCase("lab reports"))
			{
				reports = reports + grades[i].getScore();
				reportsCount++;
			}
			else if(grades[i].getName().equalsIgnoreCase("homework"))
			{
				homework = homework + grades[i].getScore();
				homeworkCount++;
			}
			else if(grades[i].getName().equalsIgnoreCase("exam 1"))
			{
				examOne = grades[i].getScore();
			}
			else if(grades[i].getName().equalsIgnoreCase("exam 2"))
			{
				examTwo = grades[i].getScore();
			}
			else if(grades[i].getName().equalsIgnoreCase("lab exam 1"))
			{
				labExamOne = grades[i].getScore();
			}
			else if(grades[i].getName().equalsIgnoreCase("lab exam 2"))
			{
				labExamTwo = grades[i].getScore();
			}
			else if(grades[i].getName().equalsIgnoreCase("final"))
			{
				fin = grades[i].getScore();
			}
			else if(grades[i].getName().equalsIgnoreCase("extra credit"))
			{
				if(grades[i].getScore() == 0)
				{
					continue;
				}
				else
				{
					extraCredit = extraCredit + grades[i].getScore();
				}
			}
		}
		System.out.println("Your lab average is " + labs/labCount);
		System.out.println("Your lab report average is " + reports/reportsCount);
		System.out.println("Your homework average is " + homework/homeworkCount);
		System.out.println("Your first exam is " + examOne);
		System.out.println("Your first lab exam is " + labExamOne);
		System.out.println("Your second exam is " + examTwo);
		System.out.println("Your second lab exam is " + labExamTwo);
		System.out.println("Your extra credit work total is " + extraCredit*.01 + " points");
		System.out.println("Your final is " + fin);
		total = ((labs/labCount) * .20) + ((reports/reportsCount) * .10) + ((homework/homeworkCount) * .20) + (examOne * .10) + (labExamOne * .10) + (examTwo * .10) + (labExamTwo * .10) + (extraCredit * .01) + (fin * .10);
		System.out.println("Your raw total is " + total);
		total = Math.ceil(total);
		String letterGrade = "";
		if(total > 100)
		{
			total = 100;
		}
		if(total >= 90 && total <= 100)
		{
			letterGrade = "A";
		}
		else if(total >= 85 && total <= 89)
		{
			letterGrade = "B+";
		}
		else if(total >= 80 && total <= 84)
		{
			letterGrade = "B";
		}
		else if(total >= 75 && total <= 79)
		{
			letterGrade = "C+";
		}
		else if(total >= 70 && total <= 74)
		{
			letterGrade = "C";
		}
		else if(total >= 65 && total <= 69)
		{
			letterGrade = "D+";
		}
		else if(total >= 60 && total <= 64)
		{
			letterGrade = "D";
		}
		else if(total < 60)
		{
			letterGrade = "F";
		}
		System.out.println("Your final grade is " + letterGrade);

	}
	
	//Read the file
	public static final String DELIM = "\n";
	public static Grade[] readFromFile(String aFileName)
	{
		try
		{
			Scanner fileScanner = new Scanner(new File(aFileName));
			int count = 0;
			while(fileScanner.hasNextLine())
			{
				fileScanner.nextLine();
				count++;
			}
			if(count <= 0)
			{
				return null;
			}
			fileScanner = new Scanner(new File(aFileName));
			grades = new Grade[count];
			int gradeCount = 0;
			String name = "";
			int score = 0;
			while(fileScanner.hasNextLine())
			{
				String fileLine = fileScanner.nextLine();
				String[] splitLine = fileLine.split(DELIM);
				if(splitLine.length != 1)
				{
					continue;
				}
				if(splitLine[0].equalsIgnoreCase("labs"))
				{
					name = "labs";
				}
				else if(splitLine[0].equalsIgnoreCase("lab reports"))
				{
					name = "lab reports";
				}
				else if(splitLine[0].equalsIgnoreCase("homework"))
				{
					name = "homework";
				}
				else if(splitLine[0].equalsIgnoreCase("exam 1"))
				{
					name = "exam 1";
				}
				else if(splitLine[0].equalsIgnoreCase("exam 2"))
				{
					name = "exam 2";
				}
				else if(splitLine[0].equalsIgnoreCase("lab exam 1"))
				{
					name = "lab exam 1";
				}
				else if(splitLine[0].equalsIgnoreCase("lab exam 2"))
				{
					name = "lab exam 2";
				}
				else if(splitLine[0].equalsIgnoreCase("final"))
				{
					name = "final";
				}
				else if(splitLine[0].equalsIgnoreCase("extra credit"))
				{
					name = "extra credit";
				}
				else
				{
					score = Integer.parseInt(splitLine[0]);
				}
				grades[gradeCount] = new Grade(name, score);
				gradeCount++;
			}
			fileScanner.close();
			return grades;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}

}
