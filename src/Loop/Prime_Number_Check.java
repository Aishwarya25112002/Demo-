
//Write a Java program to check if a given number is prime.


package Loop;

public class Prime_Number_Check {

	public static void main(String[] args) 
	{
		int a = 12;
		boolean isPrime=true;
		
	
		if(a<=1)
		{
			isPrime=false;
		}
		else 
		{
			for(int i =2; i<=a/2;i++)
			{
				if(a%i==0)
				{
					isPrime=false;
					break;
				}
			}
			
		}
		if(isPrime)
		{
			System.out.println(a+ " is prime number");
		}
		else
		{
			System.out.println(a+" is not prime number");
		}
	}
		

}
//those number are divisible by 2 that are not prime number.

