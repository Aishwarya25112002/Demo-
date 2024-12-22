package Oops_concept;

public class Hiearchical_Child3 extends Hiearchical_Parent 
{
	public void mobile()
	{
		System.out.println("This is child3 mobile");
	}
	public static void main(String[] args) 
	{
		Hiearchical_Child1 obj1 = new Hiearchical_Child1();
		obj1.home();
		obj1.car();
	System.out.println('\n');
	
	 Hiearchical_Child2 obj2 = new Hiearchical_Child2();
		obj2.home();
		obj2.bike();
	System.out.println("\n");
	
		Hiearchical_Child3 obj3 = new Hiearchical_Child3();
		obj3.home();
		obj3.mobile();
		
	}

}
