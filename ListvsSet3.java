package ab60;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListvsSet3 
{
	public static void main(String[] args) 
	{
		
		List a1=new ArrayList();
		a1.add(74);
		a1.add(63);
		a1.add(7);
		a1.add(22);
		a1.add(22);
		a1.add(null);
		a1.add(96);
		a1.add(null);
		System.out.println("Before removing-> "+a1);
		Iterator i1=		a1.iterator();
		while(i1.hasNext())
		{
			if(i1.next()==null)
			{
			i1.remove();
			}			
		}
		System.out.println("After removing->   "+a1);
		
		
	}
}
