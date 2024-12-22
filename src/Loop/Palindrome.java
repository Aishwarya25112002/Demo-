
// Write a Java program to check if a given string is a palindrome.

package Loop;

public class Palindrome {

	public static void main(String[] args) 
	{
		String input ="madam";
		
		if(isPalindrome(input))
		{
			System.out.println("The string "+input + " is a palindrome");
			
		}
		else
		{
			System.out.println("The String "+input+ " is not palindrome.");
			
		}
		

	}
	
public static boolean isPalindrome(String str)
{
	int start = 0;
	int end = str.length() -1;
	
	str = str.toLowerCase();
	
	while(start < end)
	{
		if(str.charAt(start) != str.charAt(end))
		{
			return false;
			
		}
		start ++;
		end--;
		
	}
	return true;
}

}
