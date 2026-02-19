package ab60;

import java.util.Arrays;

public class Arrayprogram4 
{
	static int countofvalue=0;
	public static void main(String[] args) 
	{
		int array[]=new int[5];
			array[0]=205;//this is how to update the value of a array at any index
			array[1]=302;
			array[2]=520;
			array[3]=240;
			array[4]=240;
		int numberToCheck=240;
		
			System.out.println(Arrays.toString(array));
			
			for(int i=0;i<array.length;i++)
			{
				if(array[i]==numberToCheck)
				{
					System.out.print("Yes the Given Number is a part of the Array, at the index position->>>");
					System.out.println(i);
					countofvalue++;
				}
			}
			System.out.println("COunt of the value is repeapted these many times->>"+countofvalue);
		
	}
}
