/*
 Variable
 
 " It is name of memory location 
 User defined named by user
 store the another type of values
 one variable store the information"
 
 Types of Variable-
 
 1) local
 2) Instances
 3)Static/Global
 
 1)local- 
 
 it declare inside and outside the class called as local variable.
 
 2) Instance variable-
 
 It can declare inside the class but outside the method without static keyword.
 also called parmenant variable.
 
 3) Global/Static-
 
 It can declare inside the class and outside the method with
 static keyword.
 



*/

package Type_Variable;

public class Local_Variable 
{
	public void login()
	{
		int j = 56; //local variable
		System.out.println(j);
		
	}
public static void main(String[] args) 
{
	int i = 40; //local variable
	System.out.println(i);
	
	Local_Variable obj = new Local_Variable();// create object
	
	obj.login(); //call method
}

}
