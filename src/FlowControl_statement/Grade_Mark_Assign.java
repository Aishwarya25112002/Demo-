/* 
4. Grade Assignment Based on Marks
Write a program that takes a student's marks as input and assigns a grade based on the following criteria:
Marks >= 90: Grade A
Marks >= 80: Grade B
Marks >= 70: Grade C
Marks >= 60: Grade D
Marks < 60: Fail
Use nested if-else statements to determine the grade.
 */

package FlowControl_statement;

public class Grade_Mark_Assign {

	public static void main(String[] args)
	{
		int mark = 45;
		if (mark >= 90)
		{
			System.out.println("Grade A");
		}
		else if(mark >= 80 && mark <90)
		{
			System.out.println("Grade B");
		}
		else if(mark >= 70 && mark < 80)
		{
			System.out.println("Grade C");
		}
		else if (mark >= 60 && mark < 70)
		{
			System.out.println(" Grade D");
		}
		else
		{
			System.out.println("This is very important Students");
		}
		

	}

}
