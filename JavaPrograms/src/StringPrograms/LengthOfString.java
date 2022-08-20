package StringPrograms;

public class LengthOfString 
{
	public void withBuiltIn()
	{
		String given="SRC Domain";
		System.out.println(given.length());
	}
	public void withoutBuiltIn()
	{
		String given="SRC Domain";
		int length=0;
		char[] toArray=given.toCharArray();
		System.out.println(toArray.length);
		for (char c : toArray) 
		{
			length++;
		}
		System.out.println("Length of the String is : "+length);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LengthOfString len=new LengthOfString();
		len.withBuiltIn();
		len.withoutBuiltIn();
	}

}
