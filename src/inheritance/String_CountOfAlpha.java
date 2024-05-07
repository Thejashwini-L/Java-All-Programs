package inheritance;

import java.util.Arrays;

public class String_CountOfAlpha 
{
	static int countofalpha =0;//declared this to get count
public static void main(String[] args) 
{
	
	String name = "Manish";
	String name1 = "Manish123";//this will give 6 as numeric is not counted
	String name2 = "Manish Kumar Tiwari";//space will be ignored and only give alpha counts
	char c1[] = name.toCharArray();//converting string to char of array, so index 0 - M, 1 -a....
	System.out.println(Arrays.toString(c1));//to show as array in horizontal
	
	for(int i=0;i<c1.length;i++)
	{
		boolean answer = Character.isAlphabetic(c1[i]);
	//System.out.println(Character.isAlphabetic(c1[0]));//to check if all chars are alpha
		if(answer==true)
		{
			countofalpha++;//each time when its true counts gets incremented, so that we can get how many alphabets are there
		}
	}
	System.out.println("The total count of Alphabets " + countofalpha);
}
}
