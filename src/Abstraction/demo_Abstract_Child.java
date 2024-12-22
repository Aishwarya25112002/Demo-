package Abstraction;

public class demo_Abstract_Child extends demo_Abstract_Parent
{
	public void m1()
	{
	System.out.println("implementation for abstract method m1()");
	
	}
	public void m3()
	{
		System.out.println("Implementation for abstract method m3()");
	}
public static void main(String[] args) 
{
	demo_Abstract_Child obj = new demo_Abstract_Child();
	obj.m2();
	obj.m1();
	obj.m3();
		

}

}
