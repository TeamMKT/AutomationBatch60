package ab60;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ListProperty2 
{
	public static void main(String[] args) 
	{
		List<String> l1=new ArrayList<String>();
		l1.add("Hari");
		l1.add("Ohm");
		l1.add("Jaya");
		l1.add("Lakshmi");
		l1.add("Lakshmi");
		
		System.out.println(Collections.binarySearch(l1,"Ohm"));
		System.out.println(l1);
/*		
		ListIterator<String> i2=	l1.listIterator();
		System.out.println("Forward Iteration:");
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		System.out.println("Backword Iteration:");
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
	*/	
	}
}
