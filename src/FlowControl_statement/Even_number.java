
/* 
2. Check If a Number is Even or Odd
Write a program to check if the number 
entered by the user is even or odd. 
Use the modulus operator (%) and an if-else statement.
*/

package FlowControl_statement;

public class Even_number 
{
	public static void main(String[] args)
	
	{
		int a = 45;
		if(a%2 == 0)
		{
			System.out.println(a+ " is Even number.");
		}
		else
		{
			System.out.println(a+ " is Odd number.");
		}
	}
}
