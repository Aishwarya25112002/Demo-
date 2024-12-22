package Constructor;

public class No_Argument {
	int a;
	int b;
	
	public No_Argument()
	{
		a=5;
		b=8;
	}
	
	public void display()
	{
		System.out.println("Value of A is "+ a);
		System.out.println("Value of B is "+ b);
		
	}

	public static void main(String[] args) {
	   No_Argument obj = new No_Argument();
       obj.display();
		
	}

}
