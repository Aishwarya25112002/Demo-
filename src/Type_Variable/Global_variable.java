package Type_Variable;

public class Global_variable 
{
	static int i = 45; //Global variable

	public static void main(String[] args)
	{
		System.out.println(i);//directly call
		
		Global_variable obj = new Global_variable(); //object references
		
		System.out.println(obj.i); //method reference
		 
		System.out.println(Global_variable.i);
	}

}
