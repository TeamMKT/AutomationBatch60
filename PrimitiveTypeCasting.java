package ab60;
public class PrimitiveTypeCasting 
{
	public static void main(String[] args) 
	{
		Object o1=	new PrimitiveTypeCasting();//upcasting-implicit
	//	Object o2=(Object)	new PrimitiveTypeCasting();//upcasting-explicit

		
		PrimitiveTypeCasting p1=(PrimitiveTypeCasting)o1;
		//downcasting explicit			
		
		/*
		syntax:
		ParentClass p1=new ChildClass();//upcasting-implicit
		
		ChildClass c1=(ChildClass)p1;		//downcasting explicit			
		
		*/
		
		
		
		
		
		
		
		
		//int into double  "="
		int a=100;
		
		 double d1=a;//widening-implicitly
		 System.out.println(d1);
		 
		 double d2=(double)a;//widening-explicitely
		 System.out.println(d2);
		 
		 //2018 Oracle 1st round-4 MCQ Questions 
		
		
		//double into int
		 
		 double a1=654.2578;
		 		
		 int i1=(int)a1;
		 System.out.println(i1);//narrowing-explicit
		
		
		
		//byte into int
		 
		 
		 
		
	}
}
