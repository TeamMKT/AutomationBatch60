package ab60;

import java.util.Arrays;

public class Arrayprogram1 
{
	public static void main(String[] args) 
	{
		int array1[]=new int[4];
		array1[0]=74;
		array1[1]=12;
		array1[2]=25;
		array1[3]=79;

		int array2[]=new int[array1.length];

		for(int i=0;i<array1.length;i++)
		{
		array2[i]=array1[i];
		}
		System.out.println("Input Array is: ---");
		System.out.println(Arrays.toString(array1));
		System.out.println("Output Array is: ---");
		System.out.println(Arrays.toString(array2));

		
	}
}
