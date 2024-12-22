package FlowControl_statement;

public class Switch_Default {

	public static void main(String[] args)
	{
		int day=100;
		switch(day)
		{
		case 1:
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
		
		case 3:
			System.out.println("Wensday");
			break;
			
		case 4:
			System.out.println("Thusday");
			break;
			
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			
		default:
			System.out.println("Invalid days");
			
		}
		System.out.println("This is in the main method");
		
}

}

/* Note:
 *    In that break statement remove then print all .
 *    Example- if we take int days=2
 *    then after tuesday all the days are prints
 */
