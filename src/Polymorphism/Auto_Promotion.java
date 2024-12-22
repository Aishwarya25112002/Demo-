package Polymorphism;

public class Auto_Promotion {
	public void add(int x)
	{
		System.out.println(x);
	}
	public void sub(int z)
	{
		System.out.println("hello");
	}
	

	public static void main(String[] args)
	{
		
		Auto_Promotion	obj = new Auto_Promotion();
		obj.add(23);
		obj.sub(5);
		
		

	}
	private void sub(char c) {
		// TODO Auto-generated method stub
		
	}

}
