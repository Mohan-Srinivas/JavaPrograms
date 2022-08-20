package StringPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class findSmallest 
{
	Integer givenArray[]= {2,3,1,4,5};
	public void sot()
	{
		int len=givenArray.length;
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				if(givenArray[i]<givenArray[j])
				{
					int temp=givenArray[i];
					givenArray[i]=givenArray[j];
					givenArray[j]=temp;
				}
			}
		}
		for(int i=0;i<len;i++)
			System.out.print(givenArray[i]+" ");
	}
	
	public void findSmall()
	{
		int smallest=Integer.MAX_VALUE;
		for(int i=0;i<givenArray.length;i++)
		{
			if(givenArray[i]<smallest)
			{
				smallest=givenArray[i];
			}
		}
		System.out.println("Smallest Number in array is "+smallest);
		
	}
	public void findLarge()
	{
		int largest=Integer.MIN_VALUE;
		for(int i=0;i<givenArray.length;i++)
		{
			if(givenArray[i]>largest)
			{
				largest=givenArray[i];
			}
		}
		System.out.print("Largest Number in array is "+largest);
		
	}
	
	public void findSmallUsingArray()
	{
		Arrays.sort(givenArray);
		System.out.println(givenArray[0]);
	}
	public void usingCollections()
	{
		List<Integer> list=Arrays.asList(givenArray);
		Collections.sort(list);
		Integer smallest=list.get(0);
		System.out.println(smallest);
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		findSmallest fs=new findSmallest();
		//fs.findSmall();
		//fs.findSmallUsingArray();
		//fs.usingCollections();
		//fs.findLarge();
		fs.sot();
	}

}
