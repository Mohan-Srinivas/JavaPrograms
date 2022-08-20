package StringPrograms;

public class ReverseWordsInASentence 
{
	public void reverseWord()
	{
		String given="I Love Amaze";
		String reversed="";
		
		String[] temp=given.split(" ");
		System.out.println(temp[0]);
		System.out.println(temp[1]);
		System.out.println(temp[2]);
		
		for(int i=temp.length-1;i>=0;i--)
		{
			reversed=reversed+temp[i]+" ";
			
		}
		System.out.println("Reversed Sentence : "+reversed);
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ReverseWordsInASentence sen=new ReverseWordsInASentence();
		sen.reverseWord();

	}

}
