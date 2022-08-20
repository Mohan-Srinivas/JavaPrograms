package StringPrograms;

import java.util.HashMap;


public class Examples 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str="word by word i give many words as example in an article that is going to be presented";
		String[] newStr=str.split(" ");
		
		HashMap<String, Integer> hm=new HashMap<String,Integer>();
		for(String s:newStr)
		{
			if(hm.containsKey(s))
			{
				int i=hm.get(s);
				hm.put(s,i+1);
			}
			else
			{
				hm.put(s, 1);
			}
		}
		System.out.println(hm);
	}

}
