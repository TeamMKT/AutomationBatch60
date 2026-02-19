package ab60;
import java.lang.String;
import java.util.Arrays;

public class ArrayProblem6 
{
	public static void main(String[] args) 
	{
		String a="mom";
		String b="dad";
		
		if(a.length()!=b.length())
		{
			System.out.println("They are not ANAGRAM");
		}
		else
		{
			System.out.println("in String there is no SOrt method present");
			System.out.println("lets convert String into array");
			char c1[]=	a.toCharArray();
			char c2[]=b.toCharArray();
			
			System.out.println("After converting your inputs, it became: ");
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));

			System.out.println("Now you can sort it: ")	;
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			System.out.println("After Sorting your inputs, it became: ");
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			
			System.out.println("Lets Comppare the 2 arrays: ");
			if(Arrays.equals(c1, c2))
			{
				System.out.println("Given 2 Strings are ANagram");

			}
			else
			{
				System.out.println("Given 2 Strings are NOT ANagram");

			}

		}
		
		
	}
}
