package StringPrograms;

import java.util.ArrayList;

public class UpperandLower 
{
	String given="SRINIVASAN srinivasan";
	//String lowercase="sureshraina";
	public void withBuiltIn()
	{
		System.out.println(given.toLowerCase());
		//System.out.println(lowercase.toUpperCase());
	}
	public void withoutBuiltInLower() // to lowercase
	{
		char[] charArray=given.toCharArray();
		for(int i=0;i<charArray.length;i++)
		{
			if(charArray[i]>=65 && charArray[i]<=90)
			{
				charArray[i]=(char) (charArray[i]+32);
			
			}
		}
		for(int i=0;i<charArray.length;i++)
		{
			System.out.print(charArray[i]);
		}
	}
	public void withoutBuiltInUpper() // to uppercase
	{
		char[] charArray=given.toCharArray();
		for(int i=0;i<charArray.length;i++)
		{
			if(charArray[i]>=97 && charArray[i]<=122)
			{
				charArray[i]=(char) (charArray[i]-32);
			
			}
		}
		System.out.println();
		for(int i=0;i<charArray.length;i++)
		{
			System.out.print(charArray[i]);
		}
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		UpperandLower upper=new UpperandLower();
		upper.withoutBuiltInLower();
		upper.withoutBuiltInUpper();
	}

}
