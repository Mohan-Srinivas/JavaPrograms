package StringPrograms;

public class CountVowelsInaString 
{

	public static void main(String[] args) 
	{
		String given="Suresh Raina";
		int length=given.length();
		int vowelscount=0;
		for(int i=0;i<length;i++)
		{
			if(given.charAt(i)=='a'||given.charAt(i)=='e'||given.charAt(i)=='o'
				||given.charAt(i)=='i'||given.charAt(i)=='u')
			{
				vowelscount++;
			}
		}
		System.out.println("Vowels count is "+vowelscount);
	}

}
