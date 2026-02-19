package ab60;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Class3 
{
	public static void main(String[] args) 
	{
	try {
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the size of the array:");
		int age[]=new int[s1.nextInt()];
		age[0]=41;
		age[1]=41;
		age[2]=41;
		System.out.println(Arrays.toString(age));
	}
	catch(ArrayIndexOutOfBoundsException a1)
	{
		System.out.println("Handled the exception 1");
	}
	catch(NegativeArraySizeException a2)
	{
		System.out.println("Please enter the size of the array , this time please make sure its not -ve");
		try {
		Scanner s1=new Scanner(System.in);
		int age[]=new int[s1.nextInt()];
		age[0]=41;
		age[1]=41;
		age[2]=41;
		System.out.println(Arrays.toString(age));
		}
		catch(NegativeArraySizeException m1)
		{
			System.out.println("Handled the exception in nested try catch block");

		}
	}	
	catch(InputMismatchException a3)
	{
		System.out.println("Handled the excepti\"Syntax:\r\n"
				+ "\r\n"
				+ "try\r\n"
				+ "{\r\n"
				+ "        //hereyou have a code that is giving exception\r\n"
				+ "}\r\n"
				+ "catch(ExceptionName variable)\r\n"
				+ "{\r\n"
				+ "\r\n"
				+ "}\"						on 2");
	}	
		
		
	}
}
