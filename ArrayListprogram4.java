package ab60;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListprogram4 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(74);
		a1.add(79);
		a1.add(25);
		a1.add(16);
		a1.add(30);
		
		Iterator<Integer> i1=	a1.iterator();
			//hasnext   //next   //remove
			//boolean-hasnext
			//next-object
		System.out.println("Iteration using Iterator:");
		System.out.println("Forward Iteration using-> Iterator:");

		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		ListIterator<Integer> i2=a1.listIterator();
		// hasnext next hasprevious previous set remove
		System.out.println("Iteration using ListIterator:");
		System.out.println("Forward Iteration using-> ListIterator:");
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		System.out.println("Backword Iteration using-> ListIterator:");
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
		

	}
}
