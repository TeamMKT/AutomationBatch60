package ab60;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListprogram7 
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

		System.out.println(Collections.binarySearch(a1,"Manish"));
		
	/*	a1.remove(4);
		System.out.println("Removing from INdex"+a1);
	
		a1.remove("Yamini");
		System.out.println("Removing the object"+a1);

		//a1.removeAll(a1)
		
		
	//	a1.clear();
		System.out.println(a1);
		
		*/
		
	}
}
