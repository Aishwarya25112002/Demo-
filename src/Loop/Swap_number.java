
/* Q. Write a program to swap two numbers without using 
a temporary variable in Java

*/

package Loop;

public class Swap_number {

	public static void main(String[] args)
	{
		int a= 12;
		int b=45;
		
		System.out.println("Before swapping a= " +a+",b= "+b);
		
		a= a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping: a= "+a+",b= "+b);
		
		
	}

}
