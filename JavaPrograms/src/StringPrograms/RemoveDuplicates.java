package StringPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicates 
{
	public void removedup()
	{
		String str="this is";
		int len=str.length();
		char[] charArray=str.toCharArray();
		System.out.println("Original Str "+str);
		LinkedHashSet<Character> set1=new LinkedHashSet<>();
		for (Character ch: charArray) 
		{
			set1.add(ch);
		}
		
		
		System.out.println("After Removing duplicates");
		for (Character x : set1) 
		{
			System.out.print(x);
		}
		
	}
	public static void main(String args[])
	{
		RemoveDuplicates dup=new RemoveDuplicates();
		dup.removedup();
		/*
		 * String given="geeksforgeeks"; char[] str=given.toCharArray(); int
		 * length=str.length; int index=0; for(int i=0;i<length;i++) { int j;
		 * for(j=0;j<i;j++) { if(str[i]==str[j]) { break; } } if(j==i) {
		 * str[index++]=str[i]; } } char[] newStr=Arrays.copyOf(str, index);
		 * System.out.println(String.valueOf(newStr));
		 */
		String given="this is";
		int len=given.length();
		String str=new String();
		for(int i=0;i<len;i++)
		{
			char c=given.charAt(i);
			if(str.indexOf(c)<0)
			{
				str+=c;
			}
		}
		System.out.println();
		System.out.println("After removing duplicates : "+str);
		
	}

}
