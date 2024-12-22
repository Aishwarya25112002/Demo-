/*
 POLYMORPHISM-
 One of the oops principle
 ability to msg to be display more than one forms
 
 1) Method overloading-
 same method with different data arguments within single class called method overloading
 
 2) Method overriding-
 
 Inside parent class and child class method names are same and datatype argument.
 called as method overriding
 */



package Polymorphism;

public class Method_overloading
{
	public void add()
	{
		System.out.println(" A general/normal method");
	}
	
	public void add(int x)
	{
		System.out.println("Method with passing int arg");
	}
	
	public void add(int x,int y)
	{
		System.out.println("Methods with int,int args");
	}

	public static void main(String[] args) 
	{
		
		Method_overloading obj = new Method_overloading();
		obj.add();
		obj.add(5);
		obj.add(23,56);
		
		

	}

}
