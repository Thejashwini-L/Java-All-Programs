package inheritance;

import java.util.Date;

public class HowToGetFutureTime {

	public static void main(String[] args) 
	{
		Date d1=new Date();
		//d1.getDate();//depriciated/dead code
		//System.out.println(d1);
		System.out.println(d1.getTime());//epouch time
		Date d2 = new Date(d1.getTime());//epouch time is converted to human time
		System.out.println(d2);
		Date d3 = new Date(d1.getTime()+(60*60*1000*24*6));//to get future time by 6 days..60 min*60 sec*1000ms*24hrs*6days
		System.out.println(d3);
		Date d4 = new Date(d1.getTime()-(60*60*1000*24*6));//to get past time by 6 days
		System.out.println(d4);
	}

}
