package ab60;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterfaceProperty 
{
	public static void main(String[] args) 
	{
		Set<Integer> s1=	new HashSet<Integer>();
		s1.add(52);
		s1.add(32);
		s1.add(57);
		s1.add(74);
		s1.add(104);
		
		Iterator<Integer> i3=	s1.iterator();
		
		while(i3.hasNext())
		{
			System.out.println(i3.next());
		}
		
		Collections.sort(null);

	}
}
