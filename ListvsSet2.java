package ab60;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListvsSet2 
{
	public static void main(String[] args) 
	{
		
		Set a1=new HashSet();
		a1.add(74);
		a1.add(63);
		a1.add(7);
		a1.add(22);
		a1.add(22);

		System.out.println("This is my Set-> "+a1);
		
		List s1=new ArrayList(a1);
		System.out.println("This is my List-> "+s1);
		s1.add(22);
		System.out.println("After adding duplicate-> "+s1);
		
	}
}
