package ab60;

import java.util.Arrays;

public class Arrayprogram3 
{
	public static void main(String[] args) 
	{
		int array1[]=new int[4];
		array1[0]=74;
		array1[1]=12;
		array1[2]=25;
		array1[3]=79;

		int array2[]=new int[array1.length];
		for(int i=0,j=array1.length-1;i<array1.length;i++,j--)
		{
		array2[j]=array1[i];
		}
	
		System.out.println("Input array is->");
		System.out.println(Arrays.toString(array1));
		System.out.println("Output array is->");
		System.out.println(Arrays.toString(array2));

	//	[1,2,3,4]
	//	[4,3,2,1]		
		
	}
}
