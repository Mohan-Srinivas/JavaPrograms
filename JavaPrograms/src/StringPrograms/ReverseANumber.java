package StringPrograms;

public class ReverseANumber 
{
	public void reverseNumber()
	{
		int num=123;
		int reversedNum=0;
		while(num!=0)
		{
			reversedNum=reversedNum*10;
			reversedNum=reversedNum+(num%10);
			num=num/10;
		}
		System.out.println("Reversed Number is ; "+reversedNum);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ReverseANumber number=new ReverseANumber();
		number.reverseNumber();
	}

}
