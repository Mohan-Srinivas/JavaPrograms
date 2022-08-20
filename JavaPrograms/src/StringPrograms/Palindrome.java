package StringPrograms;

public class Palindrome 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String given="madam";
		StringBuffer buffer=new StringBuffer(given);
		buffer=buffer.reverse();
		//System.out.println(buffer);
		
		  if(given.equals(buffer.toString())) 
		  { 
			  System.out.println("Palindrome");
		  } 
		  else
		  System.out.println("Not palidrome");
		 
	}

}
