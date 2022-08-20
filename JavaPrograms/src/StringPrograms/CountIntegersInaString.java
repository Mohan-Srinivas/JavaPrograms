package StringPrograms;

public class CountIntegersInaString 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String given="Suresh raina48";
		int length=given.length();
		int total=0;
		for(int i=0;i<length;i++)
		{
			char intchar=given.charAt(i);
			if(Character.isDigit(intchar))
			{
				
				int digit=Character.getNumericValue(intchar);
				total=total+digit;
				System.out.println("Total is "+total);
			}
		}
		System.out.println(total);
	}

}
