/*
 # OOPS- 
 User defined prototypes
 which create object/class are virtual entity
 It can be represent the set of method common to all object on types
 
 Collection of object are called as class.
 
 #Their are 5 pillars-
 
 1) Inheritence
 2) Polymorphism
 3)Encapsulation
 4) Interface
 5) Abstraction
 
 
 INHERETENCE-
 
 One class acquire properties of another class 
 with help of Extends keyword.
 
 TYPES-
 
 1) Single level inheritence
 2) multi level
 3) multiple
 4) hiearchical
 
   
 
 */


package Oops_concept;

public class Single_level_child extends Single_levelparent
{
	public void car()
	{
		System.out.println("This is car");
	}

	public static void main(String[] args) 
	{
		Single_level_child obj =new Single_level_child();
		obj.money();
		obj.car();	
    }

}
