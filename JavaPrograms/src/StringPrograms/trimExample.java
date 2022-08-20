package StringPrograms;

public class trimExample 
{
	/*
	 * Text ="  I love India  ";
	 * 1.using trim
	 * 2.Using Strip(In Java 11)
	 * 		2.1 : strip()
	 * 		2.2 ; stripLeading()
	 * 		2.3 : stripTrailing()
	 * 3.Using RegularExpression
	 * 		3.1 ^[/t]+ | +[\t]+$  --> Leading and Trailing
	 * 		3.2 ^[/t]+ --> Leading
	 * 		3.3 [/t]+$ ---> Trailing
	 * 
	 */
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String given="  I love Thor   ";
		System.out.println(given.trim());
		System.out.println(given.replaceAll("^[ /t]+|[ \t]+$",""));
		System.out.println(given.replaceAll("^[ /t]+", ""));
		System.out.println(given.replaceAll("[ /t]+$", ""));
		
	}

}
