package StringPrograms;

import java.util.Scanner;

public class PatternPrograms 
{
	public void usingstar()
	{
		Scanner s=new Scanner(System.in);
		int noOfLine=s.nextInt();
		for(int row=0;row<noOfLine;row++)
		{
			for(int column=0;column<=row;column++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void tria()
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("  ");
				
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			for(int k=1;k<i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	public void reverseTri()
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int k=i;k<=n;k++)
			{
				System.out.print(" *");
			}
			for(int k=i;k<n;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	public void numberPattern()
	{
		Scanner s=new Scanner(System.in);
		int noOfLine=s.nextInt();
		for(int row=0;row<noOfLine;row++)
		{
			for(int column=0;column<=row;column++)
			{
				System.out.print((column+1)+" ");
			}
			System.out.println();
		}
	}
	public void numberPatterAdd()
	{
		Scanner s=new Scanner(System.in);
		int startingNumber=1;
		System.out.println("Enter number of rows;:");
		int noOfRows=s.nextInt();
		int row,column;
		for(row=0;row<noOfRows;row++)
		{
			for(column=0;column<=row;column++)
			{
				System.out.print(startingNumber+" ");
				startingNumber=startingNumber+1;
			}
			System.out.println();
		}
	}
	public void reversenumber()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of rows;:");
		int noOfRows=s.nextInt();
		int row,column;
		for(row=0;row<noOfRows;row++)
		{
			for(column=noOfRows;column>row;column--)
			{
				System.out.print(column+" ");
			//	startingNumber=startingNumber+1;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PatternPrograms programs=new PatternPrograms();
		//programs.usingstar();
		//programs.numberPattern();
		//programs.numberPatterAdd();
		//programs.reversenumber();
		programs.reverseTri();
	}

}
