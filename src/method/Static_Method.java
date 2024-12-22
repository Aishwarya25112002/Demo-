package method;

public class Static_Method
{
	static int i = 10;
	public static void verifyLogin()
	{
		System.out.println("Here,we can verify the login");
	}

	public static void main(String[] args) 
	{
		verifyLogin();
		System.out.println(i);
	}

}

