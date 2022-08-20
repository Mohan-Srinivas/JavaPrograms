package StringPrograms;

import java.util.Scanner;

public class FindMyPosition {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//ASCII for A-65 a-97
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Alphabher Character");
		char givenChar=s.next().charAt(0);
		givenChar=Character.toUpperCase(givenChar);
		int asciiPos=(int)givenChar;
		int position=asciiPos-64;
		System.out.println("Position is : "+position);
		s.close();
		
	}

}
