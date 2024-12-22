
/* 3. Check Eligibility to Vote
Write a Java program that asks the user
 for their age and checks if they are eligible 
 to vote (18 or older). Use if-else statements 
 to print an appropriate message.
 */

package FlowControl_statement;

public class Voting_Assign {

	public static void main(String[] args) 
	{
		int age =22;
		if(age>=18)
		{
			System.out.println(" Eligible for vote");
		}
		else
		{
			System.out.println("Not Eligible for vote");
			
		}
		

	}

}
