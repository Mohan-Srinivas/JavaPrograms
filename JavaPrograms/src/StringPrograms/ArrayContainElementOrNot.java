package StringPrograms;

import java.util.stream.IntStream;

public class ArrayContainElementOrNot 
{
	int[] givenArray= {1,4,5,8,9};
	boolean found=false;
	int searchElement=10;
	public void presentOrNot()
	{
		for(int i=0;i<givenArray.length;i++)
		{
			if(searchElement==givenArray[i])
			{
				System.out.println("Element found at "+(i+1)+" position");
				found=true;
				break;
			}
		}
		
	}
	public void usingIntStream()
	{
		boolean capture=IntStream.of(givenArray).anyMatch(element->element==searchElement);
		if(capture==true)
			System.out.println("Element presnet");
		else
			System.out.println("Element not presnet");	
	}	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayContainElementOrNot present=new ArrayContainElementOrNot();
		present.presentOrNot();
		present.usingIntStream();
	}

}
