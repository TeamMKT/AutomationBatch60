package ab60;

import java.util.Date;

public class StringDate 
{
	public static void main(String[] args) {
		
	Date d1=new Date();//constructor
		System.out.println(d1.getTime());
		
	Date d2=new Date(d1.getTime()-(1000*60*60*24*5l));////constructor
	  System.out.println(d2);
	  String dateformat1=		d2.toString();
	 String month= dateformat1.substring(4, 7);
	  System.out.println(month);
	  String date=dateformat1.substring(8, 10);
	  System.out.println(date);
	  String year=dateformat1.substring(dateformat1.length()-4);
	  System.out.println(year);

	  String format2=date.concat(month).concat(year);
	  System.out.println(format2);
	  String format3=date.concat(" ").concat(month).concat(" ").concat(year);
	  System.out.println(format3);
	  
}
}