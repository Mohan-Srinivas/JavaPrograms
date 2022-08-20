package StringPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class FindingMissingAlphabhaetsInaString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String given="abcdefghijklmopqrstuvwxyz";
		given=given.toLowerCase();
		given=given.replaceAll(" ", "");
		System.out.println("Given input : "+given);
		String[] userArray=given.split("");
		String[] alphabhets="abcdefghijklmopqrstuvwxyz".split("");
		
		HashSet<String> set1=new HashSet<String>(Arrays.asList(userArray));
		HashSet<String> set2=new HashSet<String>(Arrays.asList(alphabhets));
		
		set2.removeAll(set1);
		System.out.print(set2);
			
		
		
	}

}
