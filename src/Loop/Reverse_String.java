
// Q. Write a Java program to reverse a string.



package Loop;

public class Reverse_String {

	public static void main(String[] args) 
	{
		String input="Hello Sir";
		String reversedString = "";
		
		for(int i= input.length() - 1; i>=0;i--)
		{
			reversedString += input.charAt(i);
			
		}
		
		System.out.println("String is "+input);
		System.out.println("Reversed String "+reversedString);
		

	}

}
