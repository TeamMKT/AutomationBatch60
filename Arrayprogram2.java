package ab60;

import java.util.Arrays;

public class Arrayprogram2 
{
	public static void main(String[] args) 
	{
		int array1[]=new int[4];
		array1[0]=74;
		array1[1]=12;
		array1[2]=25;
		array1[3]=79;

		int array2[]=new int[4];
		array2[0]=74;
		array2[1]=12;
		array2[2]=25;
		array2[3]=79;
		
		
		if(Arrays.equals(array1, array2)==true)
		{
			System.out.println("Both arrays are equals");
		}
		else
		{
			System.out.println("Both arrays are NOt equals");

		}
		
		
		
	}
}
