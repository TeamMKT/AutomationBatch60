package ab60;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInputScanner 
{
	public static void main(String[] args) 
	{
	Scanner s1=new Scanner(System.in);	
	System.out.println("Please enter the size of the array:");
		int rollno[]=new int[s1.nextInt()];
		for(int i=0;i<rollno.length;i++)
		{
			System.out.println("Please enter the value at index position-> "+i);
			rollno[i]=s1.nextInt();
		}	
			
	System.out.println(Arrays.toString(rollno));		
	s1.close();
		
	}
}
