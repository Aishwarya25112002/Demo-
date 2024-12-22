/*
 Method name followed by datatype passing some argument.
 All method signature are unique in single class
 
 # DO NOT TAKE SAME DATATYPE IT GET PASSING ERROR IN AS OUTPUT.
*/


package method;

public class Method_Signature
{
	public void add(int i)
	{
	   System.out.println("This is parameterized method");
	   
	}
    public void add(String z)
    {
    	System.out.println("This is parameterized method passing with string arguments");
    }
    public void add()
    {
    	System.out.println("This is normal method");
    }

	public static void main(String[] args) 
	{
		//create object
		Method_Signature obj = new Method_Signature();
		
		obj.add(3);//method calling
		obj.add("Aishwarya");
		obj.add();

	}

}
