package ab60;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListprogram3 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(74);
		a1.add(79);
		a1.add(25);
		a1.add(16);
		a1.add(16);
		
		System.out.println(a1);
			
		Collections.sort(a1);
		System.out.println("After Sorting->"+a1);
		Collections.reverse(a1);
		System.out.println("After Sorting->"+a1);


		
	}
}
