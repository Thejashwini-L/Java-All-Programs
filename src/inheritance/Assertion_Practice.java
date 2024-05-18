package inheritance;

import java.util.Arrays;

public class Assertion_Practice {

	public static void main(String[] args) 
	{
		/*String name = "";
		assert name.length()>0:"Given String is empty";
		System.out.println("String is present");*/
		
		int num[]= new int[3];
		num[0]=12;
		num[1]=13;
		num[2]=14;
		assert num.length > 4:"array length is more";
		for(int i=0;i<num.length;i++)
		{
	
		System.out.println(num[i]);
		
		}
	}

}
