package StringPrograms;

import java.util.Iterator;

public class ReplaceVowelsWithSpecialChar
{
	String given="I Love Mahendra Singh Dhoni";
	 
	public void usingOwnWay()
	{
		char charArray[]=given.toCharArray();
		for(int i=0;i<given.length();i++) 
		{
			if(given.charAt(i)=='A'||given.charAt(i)=='E'||given.charAt(i)=='I'||
					given.charAt(i)=='O'||given.charAt(i)=='U'||
					given.charAt(i)=='a'||given.charAt(i)=='e'||given.charAt(i)=='i'||
					given.charAt(i)=='o'||given.charAt(i)=='u')
			{
				charArray[i]='$';
			}
			
		}
		for (char c : charArray) 
		{
			System.out.print(c);
		}
	}
	public void usingregEx()
	{
		System.out.println();
		String replacedStr=given.replaceAll("[AEIOUaeiou]", "\\$");
		System.out.println(replacedStr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReplaceVowelsWithSpecialChar vowels=new ReplaceVowelsWithSpecialChar();
		vowels.usingOwnWay();
		vowels.usingregEx();
	}

}
