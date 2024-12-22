package Type_Variable;

public class Instance_variable 
{
	int i = 7; //Instance variable
	public void login()
	{
		System.out.println(i);
	}

	public static void main(String[] args)
	{
		
		Instance_variable obj = new Instance_variable();
		obj.login();
	}

}
