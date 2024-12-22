package Polymorphism;

public class Method_Overriding_Child extends Method_Overriding_parent {
	//overring method
	public void vehicle()
	{
		System.out.println("auto");
	}
	
	public static void main(String[]args)
	{
		Method_Overriding_Child obj = new Method_Overriding_Child();
		obj.property();
		obj.vehicle();
		
	}

}
