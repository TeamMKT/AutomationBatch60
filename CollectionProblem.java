package ab60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class CollectionProblem 
{
	public static void main(String[] args)
	{
	ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(1,3,6,5,8,9));
	ArrayList<Integer> list1=new ArrayList<Integer>(Arrays.asList(14,3,6,5,8,58));
	
	list.retainAll(list1);
	System.out.println(list);
	int sum=0;
	for(int i=0;i<list.size();i++)
	{
		 sum=sum+list.get(i);
	}
	System.out.println(sum);
	
	
	
	
	}
}
