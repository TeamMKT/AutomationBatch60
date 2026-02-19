package ab60;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListprogram6 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(74);
		a1.add(79);
		a1.add(25);
		a1.add(16);
		a1.add(30);
		a1.add(2, 63);
	//	System.out.println(a1.isEmpty());
			
		System.out.println(a1.contains(25));
		
		
		System.out.println(a1);
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(650);
		a2.add(600);
		a2.add(700);
		a2.add(521);
		a2.add(900);
		
		//a2.addAll(a1);
		a2.addAll(0, a1);
		System.out.println(a2.containsAll(a1));
		System.out.println(a2);
		
		a2.removeAll(a1);
		System.out.println("Removing entire a1 Collection"+a2);
		
	}
}
