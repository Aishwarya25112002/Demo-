package Oops_concept;

public class Multi_level_child extends Multi_level_parent
{
	public void mobile()
	{
		System.out.println("This is child mobile");
	}

	public static void main(String[] args)
	{
		Multi_level_child obj = new Multi_level_child();
		obj.home();
		obj.car();
		obj.mobile();
	}

}
