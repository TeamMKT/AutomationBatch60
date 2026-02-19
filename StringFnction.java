package ab60;

import java.util.Arrays;

public class StringFnction 
{
	static int noofAlphabets=0;
	static int noofNumeric=0;
	static int noofSpaces=0;
	static int noofSpecialChar=0;

	public static void main(String[] args) 
	{
		String input="k v no 2 bangalore ^&%";
		
		
		char c1[]=	input.toCharArray();
	//	System.out.println(Arrays.toString(c1));
		for(int i=0;i<c1.length;i++)
		{
		boolean b1=	Character.isAlphabetic(c1[i]);
			if(b1==true)
			{
				noofAlphabets++;
			}
		boolean b2=	Character.isWhitespace(c1[i]);

			if(b2==true)
			{
				noofSpaces++;
			}	
			boolean b3=	Character.isDigit(c1[i]);

			if(b3==true)
			{
				noofNumeric++;
			}	
		
		}
		System.out.println("Count of Total Alphabets are -> "+noofAlphabets);
		System.out.println("Count of Total Spaces are -> "+noofSpaces);
		System.out.println("Count of Total Numeric are -> "+noofNumeric);

		noofSpecialChar=	input.length()-(noofAlphabets+noofSpaces+noofNumeric);
		
		System.out.println("Count of Total special char are -> "+noofSpecialChar);

	}
}
