
/* 1. Check if a Number is Positive, Negative, or Zero
Write a Java program that takes an integer input from 
the user and checks if the number is positive, negative, 
or zero. Use if-else statements to print the result.*/


package FlowControl_statement;

public class Positive_Negative_Problem {

	public static void main(String[] args) {
		int number = 50;
		if (number>0)
		{
			System.out.println(number+ " is positive number.");
		
		}
		else if(number<0)
		{
			System.out.println(number+ " is negative number.");
		}
		else
		{
			System.out.println(number+ " is zero.");
		}

	}

}
