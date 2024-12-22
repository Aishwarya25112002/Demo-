
// Q. Write a Java program to find the factorial of a number.


package Loop;

public class Factorial_Number {

	public static void main(String[] args)
	{
		int number = 3;
		int factorial=1;
		
		for(int i =1; i<= number; i++)
		{
			factorial *= i;
		}
		
		System.out.println("The factorial of "+ number + " is "+factorial);
		
	}

}
