package ab60;
public class Stringreverse 
{
	public static void main(String[] args) 
	{
	String input="radar";
	String output="";
	for(int i=input.length()-1;i>=0;i--)
	{
	char c1=	input.charAt(i);
	output=output+c1;
	}
	System.out.println("Input Is -> "+input);
	System.out.println("Output is ->> "+output);

	//mom //dad   //radar //madam
	
	if(input.equals(output))
	{
		System.out.println("The Given String is a Palindrome");
	}
	else
	{
		System.out.println("NOt a Palindrome");

	}
	
	
	
	
	}
}
/*
i=3,true,c1=o,output=o
i=2,true,c1=t,output=ot
i=1,true,c1=u,output=ot+u=otu
i=0,true,c1=a,output=ot+u=otu+a=otua
*/