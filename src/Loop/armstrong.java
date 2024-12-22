
/*Q. Write a Java program to check if a given number is Armstrong

what is armstrong number sum of the cube of number
Example 153 = 1X1X1 + 5X5X5 +3X3X3
            =1 + 125+ 27
            = 153

*/
package Loop;

public class armstrong {

	public static void main(String[] args) 
	{
		int number=153;
		if(isArmstrong(number))
		{
			System.out.println(number +" is Armstrong number.");
			
		}
		else
		{
			System.out.println(number+" is not Armstrong number.");
		}
	}
	public static boolean isArmstrong(int num) {
		int originalNum = num;
		int sum = 0;
		int numberOfDigits=String.valueOf(num).length();
		
		while(num!=0)
		{
			int digit = num%10;
			sum += Math.pow(digit,  numberOfDigits);
			num/=10;
	     }
		return sum == originalNum;
		
	}

}
