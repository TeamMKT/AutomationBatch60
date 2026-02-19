package ab60;

import java.util.Arrays;

public class MaximumMinimum 
{
	public static void main(String[] args) 
	{
		
		int array[]=new int[5];
		array[0]=30;
		array[1]=1;
		array[2]=2;
		array[3]=3;
		array[4]=4;

		System.out.println(Arrays.toString(array));
		int min=		array[0];//lets assume
		int max=		array[0];//lets assume

		for(int i=0;i<array.length;i++)
		{
			if(array[i]>max)  //i=0,30>30,false ,i=1,25>30,false i=2,1>30,false     ,i=3,90>30,true,assiging 90 to max
			{
				max=array[i];
			}
			if(array[i]<min)//i=0,30<30false, i=1,25<30,true,25 to min, i=2,1<25,1 to min,,i=3,90<1,false,i=4
			{
			min=array[i];
			}
		}
		System.out.println("The higest value-> "+max);
		System.out.println("The minimum value-> "+min);

		
	}
}
