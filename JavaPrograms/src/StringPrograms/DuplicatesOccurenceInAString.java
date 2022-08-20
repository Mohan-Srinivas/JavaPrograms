package StringPrograms;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicatesOccurenceInAString 
{
	static void findDup(String str)
	{
		HashMap<String,Integer> hm=new HashMap<>();
		String[] givenStr=str.split(" ");
		for (String string : givenStr) 
		{
			if((hm.get(string))!=null)
			{
				int count=hm.get(string);
				hm.put(string, count+1);
			}
			else
			{
				hm.put(string, 1);
			}
		}
		Iterator<String> iterator= hm.keySet().iterator();
		while(iterator.hasNext())
		{
			String temp=iterator.next();
			int num=hm.get(temp);
			if(num>1)
			{
				System.out.println("The Word "+temp+" appeared for "+num+" no of times" );
			}
		}
	}
	static void findDuplicateword(String str)
	{
		HashMap<Character, Integer> hm=new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
			char temp=str.charAt(i);
			if((hm.get(temp))!=null)
			{
				int value=hm.get(temp);
				hm.put(temp, value+1);
			}
			else
			{
				hm.put(temp, 1);
			}
		}

		Iterator<Character> iterator= hm.keySet().iterator();
		while(iterator.hasNext())
		{
			char temp=iterator.next();
			int num=hm.get(temp);
			if(num>1)
			{
				System.out.println("The Word "+temp+" appeared for "+num+" no of times" );
			}
		}
	}
	static void hashmap11()
	{
		HashMap<String, Integer> hm=new HashMap<>();
		hm.put("Number", 123);
		hm.put("Sal", 1000);
		System.out.println(hm);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	//	findDup("I am am learning I java java java ");
	    findDuplicateword("srinivasan");
		//hashmap11();
	}

}
