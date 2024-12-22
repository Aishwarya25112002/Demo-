package Constructor;

public class Default_constructor {
	
public Default_constructor() //constructor
{
	System.out.println("This is constructor");
	
}

public Default_constructor(String x)
{
	System.out.println("This is para constructor");
}
	public static void main(String[] args) {
		
		Default_constructor obj = new Default_constructor();
		
		Default_constructor obj1 = new Default_constructor("Sonu");
	}

}


