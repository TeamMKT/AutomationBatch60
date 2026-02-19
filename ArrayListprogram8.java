package ab60;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListprogram8 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Ram");
		a1.add("Riju");
		a1.add("Yamini");
		a1.add("Sonal");
		a1.add("Manish");
		System.out.println(a1);

		ArrayList<String> a2=new ArrayList<String>();
		a2.add("Ram");
		a2.add("Riju");
		a2.add("Yamini");
		a2.add("Sonal");
		a2.add("Manish");
		System.out.println(a2);
		
		String s1=	a1.get(0);
		
		System.out.println(a1.size());
			System.out.println(s1);
		boolean answer=	a1.equals(a2);
			System.out.println(answer);
		
	}
}
