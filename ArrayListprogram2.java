package ab60;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListprogram2 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(74);
		a1.add(79);
		a1.add(25);
		a1.add(16);
		a1.add(50);
		a1.add(50);

		System.out.println(Collections.max(a1));
		System.out.println(Collections.min(a1));
		
		int count=	Collections.frequency(a1, 50);
		System.out.println(count);

	/*	ArrayList<String> a2=new ArrayList<String>();
		a2.add("Ram");
		a2.add("Mohan");
		a2.add("Vaibhav");
		a2.add("Rinku");
		a2.add("Pallavi");
		System.out.println(a2);
	*/
	}
}
