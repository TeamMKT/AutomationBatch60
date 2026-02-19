package ab60;

import java.util.Enumeration;
import java.util.Vector;

public class VectcorClass 
{
	public static void main(String[] args) 
	{
		Vector<Integer> v1=new Vector<Integer>();
		v1.add(45);
		v1.add(21);
		v1.add(63);
		v1.add(74);
		v1.removeElement(21);
		
		System.out.println(v1);
		Enumeration<Integer> e1=	v1.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}

	}
}
