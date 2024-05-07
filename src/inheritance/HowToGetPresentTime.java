package inheritance;

import java.util.Date;

public class HowToGetPresentTime {

	public static void main(String[] args) 
	{
		Date d1=new Date();//date is predefined class
		System.out.println(d1);
		String input = d1.toString();
		System.out.println(input);
		String month = input.substring(4, 7);
		System.out.println(month);
		String date = input.substring(8, 10);
		System.out.println(date);
		System.out.println(input.length());
		/*String year = input.substring(24);
		System.out.println(year);*/
		String year1 = input.substring(input.length()-4);
		System.out.println(year1);
		System.out.println("===================================");
		System.out.println(date.concat(" ").concat(month).concat(" ").concat(year1));
		//System.out.println(date+ " " .concat(month)+ " ".concat(year1));
		System.out.println(date.concat("-").concat(month).concat("-").concat(year1));
		System.out.println(date.concat("/").concat(month).concat("/").concat(year1));

	}

}
