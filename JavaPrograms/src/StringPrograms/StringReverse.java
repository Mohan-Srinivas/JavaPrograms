package StringPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StringReverse 
{
	public void usingStringBuffer()
	{
		String given="Honda";
		StringBuffer buffer=new StringBuffer(given);
		System.out.println(buffer.reverse());
	}
	public void usingOwn()
	{
		String given="Honda";
		char[] charArray=given.toCharArray();
		int len=charArray.length;
		String reversedStr="";
		for(int i=len-1;i>=0;i--)
		{
			reversedStr=reversedStr+charArray[i];
		}
		System.out.println("Reversed String : "+reversedStr);
	}
	public void usingCollections()
	{
		String given="Honda";
		char[] charArray=given.toCharArray();
		
		List<Character> list=new ArrayList<Character>();
		for (Character character : charArray) 
		{
			list.add(character);		
		}
		Collections.reverse(list);
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i));
		}
		/*
		 * ListIterator iterator=list.listIterator(); while(iterator.hasNext()) {
		 * System.out.print(iterator.next()); }
		 */
			
					
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StringReverse stringReverse=new StringReverse();
		//stringReverse.usingStringBuffer();
		//stringReverse.usingOwn();
		//stringReverse.usingCollections();
		String str="Honda";
		String rev="";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			rev=ch+rev;
		}
		System.out.println(rev);
	}

}
