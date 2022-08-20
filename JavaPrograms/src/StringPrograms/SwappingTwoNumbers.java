package StringPrograms;

public class SwappingTwoNumbers 
{
	public void withThirdVariable()
	{
		int first=2000;
		int second=6000;
		System.out.println("Before Swapping");
		System.out.println("First values is :"+first);
		System.out.println("Second values is :"+second);
		int temp=first;
		first=second;
		second=temp;
		System.out.println("After Swapping");
		System.out.println("First values is :"+first);
		System.out.println("Second values is :"+second);
		
		
	}
	public void withoutThirdVariable()
	{
		int first=10;
		int second=5;
		System.out.println("Before Swapping");
		System.out.println("First values is :"+first);
		System.out.println("Second values is :"+second);
		first=first+second;
		second=first-second;
		first=first-second;
		System.out.println("After Swapping");
		System.out.println("First values is :"+first);
		System.out.println("Second values is :"+second);
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		SwappingTwoNumbers swap=new SwappingTwoNumbers();
		swap.withThirdVariable();
		swap.withoutThirdVariable();
	}

}
