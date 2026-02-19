package ab60;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListProperty 
{
	public static void main(String[] args) 
	{
		List l1=new ArrayList();
		l1.add("Hari");
		l1.add(12);
		l1.add(false);
		l1.add('S');
		System.out.println(l1);
		
		ListIterator i2=	l1.listIterator();
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
		
	}
}
