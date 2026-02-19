package ab60;

import java.util.Scanner;

public class AmazonProgram 
{
	AmazonProgram(int a)
	{
		System.out.println("Constructor 1");
	}
	AmazonProgram(String name)
	{
		System.out.println("Constructor 2");
	}
	AmazonProgram(char gender)
	{
		this("MKT");
		System.out.println("Constructor 3");
	}
	public static void main(String[] args) 
	{
		new AmazonProgram('M');
		Scanner s1=new Scanner();
		
	}
}
