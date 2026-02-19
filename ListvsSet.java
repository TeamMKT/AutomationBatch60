package ab60;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListvsSet 
{
	public static void main(String[] args) 
	{
		
		List a1=new ArrayList();
		a1.add(74);
		a1.add(63);
		a1.add(7);
		a1.add(22);
		a1.add(22);

		a1.add(96);
		System.out.println("This is my List-> "+a1);
		
		Set s1=new HashSet(a1);
		System.out.println("This is my Set-> "+s1);

		
	}
}
