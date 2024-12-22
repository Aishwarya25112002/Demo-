package String;

public class Demo {

	public static void main(String[] args) 
	{
		String name = new String("Aishwarya");
		
		String name1 = "rupali";
		String name2 = "RUPALI";
		
System.out.println(name); // print name 

System.out.println(name.length()); // calculate no's of character including space

System.out.println(name.charAt(1)); //return character at specified index in string

System.out.println(name.concat(" Sonawane"));//used to join to string

System.out.println(name.equals(name1));//it check two strings are same or not

System.out.println(name1.equalsIgnoreCase(name2));// ignore the lowercase or uppercase

System.out.println(name.indexOf('w')); //first occurence of specified character

System.out.println(name.replace('w','v'));//replace / changing the spefic character.

System.out.println(name2.toLowerCase());

System.out.println(name1.toUpperCase());

System.out.println(name.substring(4));

String name4=" Surekha ";
System.out.println(name4);
System.out.println(name4.trim());//remove the whitespace of start and end of character



		
	}

}
